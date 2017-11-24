package com;

public class newText {
	Dgraph g=new Dgraph();
	public String [] NewText() {
		return g.generateNewText(g.readfromfile("E:\\lab7\\src\\com\\newtext.txt"));
	}
}
