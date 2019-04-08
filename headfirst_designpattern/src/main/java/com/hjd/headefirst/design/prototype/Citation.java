package com.hjd.headefirst.design.prototype;

/**
 * 奖状类
 * 
 * @author jiande.hu
 *
 */
public class Citation implements Cloneable {

	private String name;

	private String info;

	private String college;

	public Citation() {

	}

	public Citation(String name, String info, String college) {
		super();
		this.name = name;
		this.info = info;
		this.college = college;
		System.out.println("创建奖状成功！");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	void display() {
		System.out.println(name + info + college);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
