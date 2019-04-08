package com.hjd.headefirst.design.prototype;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SunWukong extends JPanel implements Cloneable {

	private static final long serialVersionUID = 5543049531872119328L;

	public SunWukong() {
		JLabel l1 = new JLabel(new ImageIcon("file/Wukong.jpg"));
		this.add(l1);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		SunWukong w = null;
		try {
			w = (SunWukong) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("拷贝悟空失败!");
		}
		return w;
	}

}
