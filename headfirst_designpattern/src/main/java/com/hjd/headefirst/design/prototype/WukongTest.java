package com.hjd.headefirst.design.prototype;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class WukongTest {

	public static void main(String[] args) throws CloneNotSupportedException
    {
        JFrame jf=new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(1,2));
        Container contentPane=jf.getContentPane();
        SunWukong obj1=new SunWukong();
        contentPane.add(obj1);       
        SunWukong obj2=(SunWukong)obj1.clone();
        contentPane.add(obj2);   
        jf.pack();       
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}
