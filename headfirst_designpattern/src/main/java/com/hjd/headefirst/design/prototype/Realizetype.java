package com.hjd.headefirst.design.prototype;

/**
 * 具体原型类
 * 
 * @author jiande.hu
 */
public class Realizetype implements Cloneable {

	public Realizetype() {
		System.out.println("具体原型创建成功!");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("具体原型复制成功!");
		return super.clone();
	}
}
