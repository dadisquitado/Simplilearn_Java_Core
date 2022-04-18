package com.lockedme;

import java.util.ArrayList;
import java.util.Scanner;

public class AddCommand {
	
	public ArrayList<String> addFile(ArrayList<String> fileArray) {
		
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Input the filename: ");
		String inputFilename;
		inputFilename = scanner.next();

		fileArray.add(inputFilename);
  
		return fileArray;
		
	}

}
