package com.saiyan;

import java.util.Scanner;
import java.io.*;

public class Application {

	public static void main(String[] args) {
		
		//Serealization !!! CHeck if the user has an account already
		Body body = null;
		try {
	         FileInputStream fileIn = new FileInputStream("body.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         body = (Body) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      } catch (FileNotFoundException f) {//If no account, then create one
	    	  System.out.println("première fois !");
	    	  body = new Body();
	    	  
	    	  try {
	    		  File myBody = new File("body.ser");
	    		  myBody.createNewFile();
	    	         FileOutputStream fileOut =
	    	         new FileOutputStream("body.ser");
	    	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	    	         out.writeObject(body);
	    	         out.close();
	    	         fileOut.close();
	    	         System.out.printf("Serialized data is saved in body.ser");
	    	      } catch (IOException i) {
	    	         i.printStackTrace();
	    	      }
	    	  Application.main(args);
	    	  return;
	      } catch (IOException i) {
	    	  i.printStackTrace();
	    	  return;
	      }
		
		
		System.out.println(body.toString());
		
		//setting the start parameters
		//olivier.Size.armSize = 23;
		
		
		//Log a session
		//This will probably go in an external class call "Session"
		//Incrementation of the sessionNumber when you log a session
		//nb = olivier.sessionNumber;
		//olivier.sessionNumber += 1;
		//Creation of a session Array or list...
		//Array session[] = new Array();
		//enter 10 push-ups
		//olivier.pushUps(10)
		//session[nb].pushUps = numberOfPushUps

	}

}
