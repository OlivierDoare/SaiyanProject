package com.saiyan;

import java.util.Scanner;

public class Body {

		//Creation of the object : body
		String personName;
		int personAge;
		int personWeight;
		Size personSize;
		Level personLevel;
		int points;
		
		// This function is called when the user has no account already
		public Body firstTime(){
			//ask for the name, age and weight
			Scanner reader = new Scanner(System.in);
			System.out.println("Quel est ton nom ?");
			String name = reader.next();
			System.out.println("Quel est ton age ?");
			int age = reader.nextInt();
			System.out.println("Quel est ton poids ?");
			int weight = reader.nextInt();
			//Creation of the body (add a session counter in the body)
			Body body = new Body(name, age, weight);
			return body;
		}

	
		Body(String _name, int _age, int _weight){
			this.personName = _name;
			this.personAge = _age;
			this.personWeight = _weight;
			this.personLevel = null;
			this.personSize = null;
			this.points = 0;
		}
		
		

		//Constructor with no fields
		public Body() {
			
			Body body = firstTime();
			this.personAge = body.personAge;
			this.personName = body.personName;
			this.personWeight = body.personWeight;
			this.personLevel = new Level();
			this.personSize = new Size();
			this.points = 0;
		}


		@Override
		public String toString() {
			return "Body [personName=" + personName + ", personAge=" + personAge + ", personWeight=" + personWeight
					+ ", personSize=" + personSize + ", personLevel=" + personLevel + ", points=" + points + "]";
		}
		
		
	
	

}
