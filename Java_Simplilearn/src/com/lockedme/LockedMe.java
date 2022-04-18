package com.lockedme;

import java.util.ArrayList;

public class LockedMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========================================================");
		System.out.println("Welcome to lockedMe.com!");
		System.out.println("========================================================");
		System.out.println("What do you want today?");
		System.out.println("-----------------------");
		System.out.println("list - to display all files in the application");
		System.out.println("add - to add specified files to the application");
		System.out.println("delete - to delete specified files from the application");
		System.out.println("find - to search specified files in the application");
		System.out.println("close - to close the application");
		System.out.println("========================================================");
		
		ArrayList<String> fileArray = new ArrayList<String>();
		
        Inputs inputs = new Inputs();
        inputs.getCommand(fileArray);
		
	}
	
}
