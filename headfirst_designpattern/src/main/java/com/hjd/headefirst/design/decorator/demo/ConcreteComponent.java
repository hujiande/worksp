package com.hjd.headefirst.design.decorator.demo;

public class ConcreteComponent implements Component{

	public ConcreteComponent() {
		System.out.println("创建具体构建角色");
	}
	
	public void operation() {
		 System.out.println("调用具体构件角色的方法operation()");
	}

}
