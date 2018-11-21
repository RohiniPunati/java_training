package com.Thirdware.googleAssis;

import java.util.Scanner;

public class PhraseAsAnd {
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	Pojo pojo =new Pojo();
	
	System.out.println("Enter your sentence");
	String input=scanner.nextLine();
	String[] inputSplit=input.split("and");
	String[] firstname=inputSplit[0].split(" ");
	String[] lastname=inputSplit[1].split(" ");
	String[] email=inputSplit[2].split(" ");
	String[] password=inputSplit[3].split(" ");
//	pojo.setFirstname(firstname);
	for(int i=0;i<firstname.length;i++) {
		if(firstname[i].length()<=3 ){
			firstname[i].replaceAll(firstname[i],"");
		}
		else if(firstname[i].equals("firstname")) {
			firstname[i].replaceAll(firstname[i],"");
		}
		else {
			pojo.setFirstname(firstname[i]);
			System.out.println("firstname :: "+ pojo.getFirstname());
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
			pojo.setLastname(lastname[i]);
			System.out.println("lastname :: "+ pojo.getLastname());
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
			pojo.setEmail(email[i]);
			System.out.println("email :: "+pojo.getEmail());
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
			pojo.setPassword(password[i]);
			System.out.println("password :: "+ pojo.getPassword());
		}
	}

	
	}
}
