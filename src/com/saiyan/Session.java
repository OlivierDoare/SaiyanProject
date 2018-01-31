package com.saiyan;
import java.util.HashMap;
import java.util.Scanner;

public class Session {
	/*The session object will contain all repetitions, weight lifted,
	 * and machine used
	 */

	//the sessionId will be a number increased at every session
	int sessionId;
	//we will count the number of points for the session
	int sessionPoints;
	HashMap<String, Integer> sessionAtributes;// = new HashMap<String, Integer>();
	
	//When logging a session, we will ask the user the exercice, the number of repetition
	public Session(Body body) {
		this.sessionId =+ body.sessionId; //Incrementation of the sessionId
		Scanner reader = new Scanner(System.in);
		
		//if loop to enter all exercices
		boolean encore = true;
		//Creation of the Hashmap
		HashMap<String, Integer> sessionAtributes = new HashMap<String, Integer>();
		while(encore) {
			System.out.println("Quel Exercice ?");//ask for the exercice
			String exercice = reader.next();
			System.out.println("Combien de répétitions ?");//ask for the number of repetitions
			int repetitions = reader.nextInt();
			//add the exercice and number of reps in the hashMap
			sessionAtributes.put(exercice, repetitions);
			//Ask if there is more to log
			System.out.println("Encore une exo ?\n1 = Oui & \n2 = Non");
			int response = reader.nextInt();
			if(response == 2) {
				encore = false;
			}
			this.sessionAtributes = sessionAtributes;
		}
		
		
		
		
		System.out.println(sessionAtributes);//Print Test
	}
	
	
	//Constructor
	public Session(int sessionId, int sessionPoints) {
		super();
		this.sessionId = sessionId;
		this.sessionPoints = sessionPoints;
	}
	
	
}
