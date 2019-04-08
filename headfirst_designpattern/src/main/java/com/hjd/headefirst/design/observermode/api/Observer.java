package com.hjd.headefirst.design.observermode.api;

/**
 * 
 * @author ivy
 * 
 * all of observer must implement update method, to achieve observer interface.
 *
 */
public interface Observer{
	
	/**
	 * 
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temp, float humidity, float pressure);

}
