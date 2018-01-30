package com.saiyan;

import java.io.Serializable;
import java.util.Scanner;

public class Body implements Serializable{

		//Creation of the object : body
		String personName;
		int personAge;
		int personWeight;
		Size personSize;
		Level personLevel;
		int points;
		


		//Constructor with no fields used only once
		public Body() {
			//ask for the name, age and weight
			Scanner reader = new Scanner(System.in);
			System.out.println("Quel est ton nom ?");
			String name = reader.next();
			System.out.println("Quel est ton age ?");
			int age = reader.nextInt();
			System.out.println("Quel est ton poids ?");
			int weight = reader.nextInt();
			this.personAge = age;
			this.personName = name;
			this.personWeight = weight;
			this.personLevel = new Level();
			this.personSize = new Size();
			this.points = 0;
		}


		@Override
		public String toString() {
			return "Body \npersonName=" + personName + "\npersonAge=" + personAge + "\npersonWeight=" + personWeight
					+ "\npersonSize=" + personSize + "\npersonLevel=" + personLevel + "\npoints=" + points;
		}
		
		
	
	

}
