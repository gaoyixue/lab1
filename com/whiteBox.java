package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class whiteBox {

	@Test
	  public void testQueryBriDgeWords1() {
	    @SuppressWarnings("static-access")
	    Dgraph dg=new Dgraph();
	    dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str2 = dg.queryBriDgeWords("exciting", "to");
	    String str1 = "No 'exciting' in the graph!";
	    assertEquals(str1,str2);  
	}
	@Test
		public void testQueryBriDgeWords2() { 
	    Dgraph dg=new Dgraph();
	    dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str4 = dg.queryBriDgeWords("and", "ambulence");
	    String str3 = "No 'ambulence' in the graph!";
	    assertEquals(str3,str4); 
	}
	
	@Test
	    public void testQueryBriDgeWords3() {
		Dgraph dg=new Dgraph();
	    dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str6 = dg.queryBriDgeWords("anymore", "ambulence");
	    String str5 = "No 'anymore' and 'ambulence' in the graph!";
	    assertEquals(str5,str6);  
	}
	@Test
      public void testQueryBriDgeWords4() {
	    Dgraph dg=new Dgraph();
        dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str8 = dg.queryBriDgeWords("civilizations", "to");
	    String str7 = "No briDge word from 'civilizations' to 'to'";
	    assertEquals(str7,str8); 
	}
	@Test
    public void testQueryBriDgeWords5() {
	    Dgraph dg=new Dgraph();
        dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str10 = dg.queryBriDgeWords("new","civilizations");
	    String str9 = "No briDge word from 'new' to 'civilizations'";
	    assertEquals(str9,str10); 
	}
	@Test
    public void testQueryBriDgeWords6() {
	    Dgraph dg=new Dgraph();
        dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str12 = dg.queryBriDgeWords("strange","worlds");
	    String str11 = "The briDge words from 'strange' to 'worlds' is:new";
	    System.out.println(str12);
	    assertEquals(str11,str12);  
	}
	@Test
    public void testQueryBriDgeWords7() {
	    Dgraph dg=new Dgraph();
        dg.createGraph(dg.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	    String str14 = dg.queryBriDgeWords("to","out");
	    String str13 = "The briDge words from 'to' to 'out' is:seek,explore";
	    System.out.println(str14);
	    assertEquals(str13,str14); 
	  }

}
