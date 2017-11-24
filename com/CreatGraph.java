package com;

import java.io.IOException;


public class CreatGraph {
	private static Dgraph g;
	public void createGraph() throws IOException {
	    g = new Dgraph();
	    g.createGraph(g.readfromfile("E:\\lab7\\src\\com\\java.txt"));
	  }
	 public static Dgraph getGraph() {
		    return g;
	} 
}
