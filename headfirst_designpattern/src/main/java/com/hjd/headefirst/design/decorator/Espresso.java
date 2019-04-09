package com.hjd.headefirst.design.decorator;

public class Espresso extends Beverage{

	public Espresso() {
		description = "Espresso Coffe";
	}
	
	public double cost() {
		return 1.99;
	}

}
