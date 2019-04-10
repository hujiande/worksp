package com.hjd.headefirst.design.decorator.iodemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) {
		int c;
		InputStream in;
		try {
			in =  new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("F:\\workspace\\headfirst_designpattern\\file\\test.txt")));
			while ( (c = in.read()) >=0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
