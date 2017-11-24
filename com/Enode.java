package com;

public class Enode {
	 String data;
	 Enode next;
	 boolean visit;
	 int w;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Enode getNext() {
		return next;
	}
	public void setNext(Enode next) {
		this.next = next;
	}
	public boolean isVisit() {
		return visit;
	}
	public void setVisit(boolean visit) {
		this.visit = visit;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public Enode(String data,Enode next,boolean visit,int w) {
		this.data=data;
		this.next=next;
		this.visit=visit;
		this.w=w;
	}
	public Enode() {
		
	}
}
