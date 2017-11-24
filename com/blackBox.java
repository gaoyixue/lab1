package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class blackBox {

	@Test
	  public void testCalcShortestPath6() {
		Dgraph dg=new Dgraph();
        dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str1= "";
	    String str2=dg.calcShortestPath("to$","new");
	    System.out.println(str2);
	    assertEquals(str1,str2);
	  }
	
	  @Test
	  public void testCalcShortestPath5() {
		Dgraph dg=new Dgraph();
	    dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str1= "";
	    String str2=dg.calcShortestPath("not","a");
	    System.out.println(str2);
	    assertEquals(str1,str2);
	  }
	  @Test
	  public void testCalcShortestPath4() {
		Dgraph dg=new Dgraph();
	    dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str1= "";
	    String str2=dg.calcShortestPath("a","worlds");
	    System.out.println(str2);
	    assertEquals(str1,str2);
	  }
	  
	  
	  @Test
	  public void testCalcShortestPath3() {
	    Dgraph dg=new Dgraph();
	    dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str1= "";
	    String str2=dg.calcShortestPath("","");
	    System.out.println(str2);
	    assertEquals(str1,str2);
	  }
	  @Test
	  public void testCalcShortestPath2() {
	    Dgraph dg=new Dgraph();
		dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str1= "to,seek,out,new";
	    String str2=dg.calcShortestPath("to","new");
	    System.out.println(str2);
	    assertEquals(str1,str2);
	  }
	  @Test
	  public void testCalcShortestPath1() {
		Dgraph dg=new Dgraph();
		dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str1= "to,seek,out,new,civilizations,to,seek,out,new,life,and,to,seek,out,new,life,to,seek,to,seek,out,new,worlds,to,seek,out,new,to,seek,out,strange,to,seek,out,to,explore,to";
	    String str2=dg.calcShortestPath("to","");
	    System.out.println(str2);
	    assertEquals(str1,str2);
	  }
}
