package com;

import java.io.IOException;
import javax.swing.JOptionPane;

public class test {
	public static void main(String[] args)throws IOException  {
		String a=JOptionPane.showInputDialog("choose function(1,2,3,4,5,6):");
        while(a!="0")
        {
    	switch(a)
    	{
    	case "1":
    	{
    		CreatGraph cg=new CreatGraph();
    		cg.createGraph();
	        break;
    	}
    	case "2":
    		showGraph sg=new showGraph();
    		sg.showDgraph();
    		break;
    	case "3":
    		QBriDgeWordsCtrl qg=new QBriDgeWordsCtrl();
    		String w1=JOptionPane.showInputDialog("input word1:");
    		String w2=JOptionPane.showInputDialog("input word2:");	
    		System.out.println(qg.queryBriDgeWords(w1,w2));	
    		
    		break;
    	case "4":
    		newText ng=new newText();
    		String s5[]=ng.NewText();
    		for(String s:s5) {
    			System.out.println(s);
    		}
    		break;
    	case "5":
    	  String wo1=JOptionPane.showInputDialog("input word1:");
          String wo2=JOptionPane.showInputDialog("input word2:");
          calSpathCtrl cg=new calSpathCtrl();
          System.out.println(cg.calcShortesePath(wo1,wo2));
          break;

    	case "6":
    		RandwalkCtrl rg=new RandwalkCtrl ();
    		System.out.println(rg.randWalk());
	        break;
    		
    	default:
    		break;
    	}
        a=JOptionPane.showInputDialog("choose function(1,2,3,4,5,6):");
        }
	}
}
