package com.Thirdware.googleAssis;

import java.util.Scanner;

public class PhraseAsAnd {
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your sentence");
	String input=scanner.nextLine();
	String[] inputSplit=input.split("and");
	String[] firstname=inputSplit[0].split(" ");
	String[] lastname=inputSplit[1].split(" ");
	String[] email=inputSplit[2].split(" ");
	String[] password=inputSplit[3].split(" ");
	for(int i=0;i<firstname.length;i++) {
		if(firstname[i].length()<=3 ){
			firstname[i].replaceAll(firstname[i],"");
		}
		else if(firstname[i].equals("firstname")) {
			firstname[i].replaceAll(firstname[i],"");
		}
		else {
			System.out.println("firstname :: "+ firstname[i]);
		}
	}
	for(int i=0;i<lastname.length;i++) {
		if(lastname[i].length()<=3 ){
			lastname[i].replaceAll(lastname[i],"");
		}
		else if(lastname[i].equals("lastname")) {
			lastname[i].replaceAll(lastname[i],"");
		}
		else {
			System.out.println("lastname :: "+ lastname[i]);
		}
	}
	for(int i=0;i<email.length;i++) {
		if(email[i].length()<=3 ){
			email[i].replaceAll(email[i],"");
		}
		else if(email[i].equals("email")) {
			email[i].replaceAll(email[i],"");
		}
		else {
			System.out.println("email :: "+ email[i]);
		}
	}
	for(int i=0;i<password.length;i++) {
		if(password[i].length()<=3 ){
			password[i].replaceAll(password[i],"");
		}
		else if(password[i].equals("password")) {
			password[i].replaceAll(password[i],"");
		}
		else {
			System.out.println("password :: "+ password[i]);
		}
	}

	
	}
}
