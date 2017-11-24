package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Dgraph {
  private static Vnode [] vlist;

  public void createGraph(String []str) {
    ArrayList<String> set = new ArrayList<String>();
    for (int i = 0;i < str.length;i++) {
      if (!set.contains(str[i])) {
        set.add(str[i]);
      }
    }
    Object []sa = set.toArray();
    vlist = new Vnode[set.size()];
    for (int i = 0;i < set.size();i++) {
      vlist[i] = new Vnode();
      vlist[i].data = (String)sa[i];
      vlist[i].first = null;
      vlist[i].num = 0;
    }
    for (int k = 1;k < str.length;k++) {
      int j = index(str[k-1]);
      int f = 0;
      Enode node1 = vlist[j].first;
      if (node1 != null) {
        while (node1 != null) {
          if (node1.data.equals(str[k])) {
            node1.w++;
            f = 1;
            break;
          }
          node1 = node1.next;
        }
      }
      if (f == 0) {
        Enode node = new Enode(str[k],vlist[j].first,false,1);
        vlist[j].first = node;
        vlist[j].num++;
      }    
    }
  }

  public static int index(String st) {
    for (int i = 0;i < vlist.length;i++) {
      if ((vlist[i].data).equals(st)) {
        return i;
      }
      if (i == (vlist.length - 1)) {
        return -1;
      }
    }
    return -1;
  }

  public String queryBriDgeWords(String word1,String word2) {
    int m = index(word1);
    int n = index(word2);
    
    String str2;
    ArrayList<String> str = new ArrayList<String>();
    if((m == -1) && (n != -1)) 
      str2="No '" + word1 + "' in the graph!";
    else {
      if ((m != -1) && (n == -1))
        str2="No '" + word2 + "' in the graph!";
      else {
        if(m==-1 && n==-1) {
          str2="No '" + word1 + "' and '" + word2 + "' in the graph!";
          return str2;
        }
        else {
          Enode e = vlist[m].first;
          while (e != null) {
            Enode e2 = vlist[index(e.data)].first;
            while (e2 != null) {
              if (e2.data.equals(word2)) {
                str.add(e.data);
                break;
              }
              e2 = e2.next;
            }
            e = e.next;
          }
        }
        if (str.size() == 0) 
          str2="No briDge word from " +"'"+ word1 + "' to '" + word2+"'";
        else {
          String str1=String.join(",", str);
          str2="The briDge words from '"  +word1 + "' to '"+ word2 +"' is:" + str1;
        }
      }
    }
    
    return str2;
  }

  public ArrayList<String> randWalk() {
  Random r=new Random();
  int n1=r.nextInt(vlist.length);
		ArrayList<String> s=new ArrayList<String>();
		s.add(vlist[n1].data);
		while(true)
		{
			if(vlist[n1].num==0)
				return s;
			int n2=r.nextInt(vlist[n1].num);
			Enode node=vlist[n1].first;
			for(int k=0;k<n2;k++)
			{
				node=node.next;
			}
			s.add(node.data);
			if(node.visit==true)
				return s;
			node.visit=true;
			n1=index(node.data);
		}
	}
	
	String [] generateNewText(String []inputText)
	{
		
		ArrayList <String> newtext= new ArrayList<String>();
		Random r=new Random(); 
		for (int i=0;i<inputText.length-1;i++)
		{
			newtext.add(inputText[i]);
			String ll=queryBriDgeWords(inputText[i],inputText[i+1]);
			if(ll.contains(":")) {
			String lll[]=ll.split(":");
			String l[]=lll[1].split(",");
			if(l.length==0)
				continue;
			else
			{
				newtext.add(l[r.nextInt(l.length)]);
			}
			}
		}
		newtext.add(inputText[inputText.length-1]);
		String []newtxt=new String[newtext.size()];
		Object []sa=newtext.toArray();
		
		for(int i=0;i<newtext.size();i++)
		{
			newtxt[i]=(String)sa[i];
		}
		return newtxt;
	}

	int [] Dijkstra(int v0, int n,int s0)  
	{  
		int []path; 
		path=new int [n];
		int []visited;
		visited=new int [n];  
		Queue<Vnode> q=new LinkedList<>();  
	    //初始化  
	    final int INF=Integer.MAX_VALUE;
	    for(int i = 0; i < n; i++)  
	    {  
	        vlist[i].w = INF;  
	        path[i] = -1;       //每个顶点都无父亲节点  
	        visited[i] = 0;     //都未找到最短路  
	    }  
	    vlist[v0].w = 0;  
	    q.offer(vlist[v0]);  
	    while(!q.isEmpty())  
	    {  
	        Vnode cd = q.element();  
	        q.poll();  
	        int u=index(cd.data);
	        if(visited[u]==1)  
	            continue;  
	        visited[u] = 1;  
	        Enode p=vlist[u].first;
	        while(p!=null)  
	        {  
	            int tempv = index(p.data);  
	            int tempw = p.w;  
	            if(visited[tempv]==0 && (vlist[tempv].w)> (vlist[u].w+tempw))
	            {  
	                vlist[tempv].w = vlist[u].w+tempw;  
	                path[tempv] = u;  
	                q.offer(vlist[tempv]);  
	            }  
	            p = p.next;  
	        }  
	    }  
	    //System.out.println("最短路径长为："+vlist[s0].w);
	    return path;
	}
	
	int i;
	String calcShortestPath(String word1, String word2)
	{
	  ArrayList <String> p= new ArrayList<String>();
    int []Pa;
    int w1=index(word1);
    int w2=index(word2);
    int i=0;
    if(w1!=-1&&word2.isEmpty())
    {
      for(int j=0;j<vlist.length;j++)
      {
        Pa=Dijkstra(w1, vlist.length,j);
        w2=j;
        while(w2!=-1)
        {
          p.add(vlist[w2].data);
          w2=Pa[w2];
        }
      }
    }
    else if(w1==-1||(w1!=-1&&w2==-1))
    {
      System.out.println("单词不存在");
    }
    else
    {
      Pa=Dijkstra(w1, vlist.length,w2);
      while(w2!=-1)
      {
        p.add(vlist[w2].data);
        w2=Pa[w2];
      }
    }
 
    String []path=new String[p.size()];
    Object []sa=p.toArray();
    for(i=0;i<p.size();i++)
    {
      path[i]=(String)sa[i];
      
    }
    StringBuffer str = new StringBuffer();
    for(int m = 0; m < path.length; m++){
     str. append(path[path.length-m-1]);
     if(m<path.length-1)
       str. append(',');
    }
    String s = str.toString();

    return s;
    
	}

	String[] readfromfile(String filepath)
	{
	     try
	     {
			FileReader fr=new FileReader(filepath);
			BufferedReader br=new BufferedReader(fr);
			String sf=null;
			String s2="";
	        while((sf=br.readLine())!=null){  
	            s2=s2+sf+" ";
	        }
	        br.close();
            fr.close();
			Scanner sc=new Scanner(s2);
		    String str=sc.nextLine();
		    str=str.toLowerCase();
		    str=str.replaceAll("[^a-z]", " ");
		    str=str.replaceAll("\\s{1,}", " ");
		    String []sl=str.split(" ");
		    return sl;
	     }catch(Exception e)
		{
			e.printStackTrace();
		}
	    return null;
	}
    public void showDgraph(String s3[]) {
    	GraphViz gViz=new GraphViz("C:\\Users\\dell\\Desktop", "D:\\Program Files\\graphviz2.38\\bin\\dot.exe");
        gViz.start_graph();
        for(int i=0;i<s3.length-1;i++)
        {
        	gViz.addln(s3[i]+"->"+s3[i+1]);
        }
        gViz.end_graph();
        gViz.run();
    }
}