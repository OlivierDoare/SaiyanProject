package com.saiyan;

import java.io.Serializable;
import java.util.Scanner;

public class Size implements Serializable{
	
	int armSize;
	int legSize;
	int abdosSize;
	int pecsSize;

	Size(int _armSize, int _legSize, int _abdosSize, int _pecsSize){
		
		
		
		
	}
	
	public Size(){
		//ask for the armSize, legSize, abdosSize and pecsSize
		Scanner reader = new Scanner(System.in);
		System.out.println("Tour de bras en centimètre :");
		int armSize = reader.nextInt();
		this.armSize = armSize;
		System.out.println("Tour cuisse en centimètre :");
		int legSize = reader.nextInt();
		this.legSize = legSize;
		System.out.println("Tour de taille en centimètre :");
		int abdosSize = reader.nextInt();
		this.abdosSize = abdosSize;
		System.out.println("Tour de poitrine en centimètre :");
		int pecsSize = reader.nextInt();
		this.pecsSize = pecsSize;
	}

	@Override
	public String toString() {
		return "Size [armSize=" + armSize + ", legSize=" + legSize + ", abdosSize=" + abdosSize + ", pecsSize="
				+ pecsSize + "]";
	}
}
