package com.simplilearn.FileHandler;

public class FileHandler {

	public static void main(String[] args) {
		
		System.out.println("========================================================");
		System.out.println("Welcome to Simplilearn File Handler");
		System.out.println("========================================================");
		System.out.println("list - to display all files in the application");
		System.out.println("add - to add specified files to the application");
		System.out.println("delete - to delete specified files from the application");
		System.out.println("find - to search specified files in the application");
		System.out.println("close - to close the application");
		System.out.println("go - to go to specific directory");
		System.out.println("========================================================");
		
		Inputs inputs = new Inputs();
		inputs.processCommand();		
		
	}
	
}
