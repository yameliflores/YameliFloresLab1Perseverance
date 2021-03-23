/**
 * 
 */
package edu.fiu.perseverance;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author yflores
 *This is my computer class
 */
public class Computer implements SelfCheckCapable{
	
	/**
	 * These are my attributes
	 */
	
	String processor;
	String memory;
	
	/**
	 * This is interact method -  the computer interacts with the different instruments of the rover
	 */
	
	void interact() {	
	}
	
	/**
	 * This is storedata method - it gets information and stores it from different instruments to transmit to Earth such as the position of rover or pictures/videos
	
	void storedata() {
	}
	
	/**
	 * This is backup method - it backsup information for if second computer awakes if first computer is damaged or not working
	 */
	
	void backup() {
	}
	
	/**
	 * This is registerresults method - it registers the monitoring health report results for decision to adjust temperature or change activity
	 */
	
	void registerresult() {
	}
	
	/**
	 * This is sleep method - it makes currently used computer sleep if second computer is needed
	 */
	
	void sleep() {
	}
	
	/**
	 * This is wakeup method - it tells the computer that is asleep to wakeup
	 */
	
	void wakeup() {
	}
	
	@Override
	public String getComponentName() {
		//TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean selfCheck() {
		//TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean runSelfCheck() {
		//TODO Auto-generated method stub
		return false;
	}
	
	}
	
	




