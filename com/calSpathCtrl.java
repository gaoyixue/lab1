package com;

public class calSpathCtrl {
	Dgraph g=new Dgraph();
	  
	public String calcShortesePath(String word1, String word2) {
	    return g.calcShortestPath(word1, word2);
	}
}
