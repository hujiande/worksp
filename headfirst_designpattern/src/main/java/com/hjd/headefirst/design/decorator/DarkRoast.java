package com.hjd.headefirst.design.decorator;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "DarkRoast Coffe";
	}
	
	public double cost() {
		return .99;
	}

}
