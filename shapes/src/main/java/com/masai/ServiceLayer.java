package com.masai;

public class ServiceLayer {

	private Shape s;

	public void setS(Shape s) {
		this.s = s;
	}
	
	public void print() {
		s.area();
		System.out.println("got the area in service layer");
	}
	
}
