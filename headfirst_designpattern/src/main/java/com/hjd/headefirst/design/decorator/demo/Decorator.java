package com.hjd.headefirst.design.decorator.demo;

public class Decorator implements Component{

	Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	public void operation()
    {
        component.operation();
    }

}