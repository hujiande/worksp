package com.hjd.headefirst.design.observermode.api;

/**
 * @author ivy
 *
 * Observer interface
 */
public interface Subject {

	/**
	 *  register interface
	 */
	public void registerObserver(Observer ob);
	/**
	 * 	cancel interface
	 */
	public void removeObserver(Observer ob);
	/**
	 * notify interface: when the theme is updated, invoking this method, to inform all observer 
	 */
	public void notifyObserver();
	
}
