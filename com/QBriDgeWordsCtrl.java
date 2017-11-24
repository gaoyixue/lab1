package com;

public class QBriDgeWordsCtrl {
	Dgraph g=new Dgraph();
	public String queryBriDgeWords(String word1,String word2) {
		return g.queryBriDgeWords(word1, word2);
	}
	
}
