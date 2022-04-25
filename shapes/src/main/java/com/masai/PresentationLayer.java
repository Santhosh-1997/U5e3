package com.masai;

public class PresentationLayer {

	private ServiceLayer slayer;
	
	
	
	public void setSlayer(ServiceLayer slayer) {
		this.slayer = slayer;
	}



	public void printArea() {
		slayer.print();
		System.out.println("area printed in presentation layer");
	}
}
