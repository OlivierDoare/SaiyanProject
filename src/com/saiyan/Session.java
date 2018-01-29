package com.saiyan;
import java.util.TreeMap;
import java.util.HashMap;

public class Session {
	/*The session object will contain all repetitions, weight lifted,
	 * and machine used
	 */

	//the sessionId will be a number increased at every session
	int sessionId;
	//we will count the number of points for the session
	int sessionPoints;
	HashMap<String, Integer> sessionAtributes = new HashMap<String, Integer>();
	
	//Constructor
	public Session(int sessionId, int sessionPoints) {
		super();
		this.sessionId = sessionId;
		this.sessionPoints = sessionPoints;
	}
	
	
}
