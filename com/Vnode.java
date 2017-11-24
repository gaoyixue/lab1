package com;

public class Vnode {
	String data;
    Enode first;
    Integer num;
    int w;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Enode getFirst() {
		return first;
	}
	public void setFirst(Enode first) {
		this.first = first;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public Vnode(String data,Enode first,Integer num,int w)
	{
		this.data=data;
		this.first=first;
		this.num=num;
		this.w=w;
	}
	public Vnode() {
		
	}
}
