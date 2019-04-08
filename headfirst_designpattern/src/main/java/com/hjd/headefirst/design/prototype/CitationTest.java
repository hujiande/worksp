package com.hjd.headefirst.design.prototype;

public class CitationTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Citation citation = new Citation("张三","同学：在2019学年第一学期中表现优秀，被评为三好学生。","清华大学");
		citation.display();
		Citation citation2 = (Citation) citation.clone();
		citation2.setName("李斯");
		citation2.setCollege("北京大学");
		citation2.display();
	}
}
