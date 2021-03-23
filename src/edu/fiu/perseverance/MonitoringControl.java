/**
 * 
 */
package edu.fiu.perseverance;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is my MonitoringControl class
 * @author yflores
 *
 */
public class MonitoringControl implements SelfCheckCapable {

/**
 * These are my attributes
 */
	int thermostat;
	String Radiator;
	
/**
 * This is sendresult method - it uses the checkreport as a form of results to send to computer
 */
	void sendresult() {
		
	}
	
/**
 * This is makecheckreport method - it uses the checktemperature and checkpowerlevel information to create a check report.
 */
	void makecheckreport() {
		
	}
	
/**
 * This is adjusttemperature method - it changes the temperature needed when necessary
 */
	void adjusttemperature() {
		
	}
	
/** 
 * This is checktemperature method - it takes temperature
 */
	void checktemperature() {
	
}
/** 
 * This is checkpowerlevel method - it examines the power supply
 */
	void checkpowerlevel() {
	
}
/**
 * A getshcedulecommand retrieves the command from computer to schedule a health monitoring check
 * @return the schedule for when to do check
 */

	Computer getschedulecommand() {
	return null;
	
}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Monitoring Control";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
