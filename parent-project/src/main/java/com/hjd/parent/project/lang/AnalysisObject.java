package com.hjd.parent.project.lang;

public class AnalysisObject implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		AnalysisObject ao = new AnalysisObject();
		AnalysisObject ao2 = new AnalysisObject();

		System.out.println("ao2 equals ao ---->>>>> " + ao2.equals(ao));
		System.out.println("ao2 == ao ---->>>>> " + (ao2 == ao));

		/**
		 * getClass method
		 */
		Class<? extends AnalysisObject> class1 = ao.getClass();
		System.out.println(class1);

		/**
		 * hashCode method
		 * 
		 * The core point is hashCode can be used to judge the different, cannot be used to judge the same, 
		 * (Objcet.hashCode) and Object hashCode is not because of any special place.
		 * The reason is very straightforward: whether it is to generate random numbers with internal addresses or directly 
		 * use the random number generator to generate random numbers,
		 * their length is truncated to 32 bits, there must be repetition. We can't think of hashCode as the same object. 
		 * HashCode should be used to optimize retrieval, because if hashCode is different, it must not be the same object.
		 */
		int hashCode = ao.hashCode();
		System.out.println(hashCode);

		/**
		 * clone method
		 */
		AnalysisObject cloneAo = (AnalysisObject) ao.clone();
		System.out.println(cloneAo.equals(ao));
		
		/**
		 * toString method
		 */
		System.out.println(cloneAo.getClass().getName() + "@" + Integer.toHexString(cloneAo.hashCode()) + " toString :" + cloneAo.toString());
		
	}
}
