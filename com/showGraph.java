package com;

public class showGraph {
	private Dgraph g=CreatGraph.getGraph();
	public void showDgraph() {
		g.showDgraph(g.readfromfile("F:\\软件工程\\实验一\\1150310110-lab1-code\\java.txt"));
	}
}
