package com.lockedme;

import java.util.ArrayList;
import java.util.Scanner;

public class FindCommand {
	
	public boolean fileFound;

	public int findFile(ArrayList<String> fileArray, int arrayIndex, boolean fileFound) {
		
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Input the filename: ");
		String inputFilename;
		this.fileFound = false;
		arrayIndex = 0;
		inputFilename = scanner.next();
		
		if (fileArray.isEmpty()) {
			System.out.println("File not found.");
			System.out.println("Array is empty.");
		} else {
			for (String element : fileArray){
				if (element.contains(inputFilename)){
					this.fileFound = true;
					arrayIndex = fileArray.indexOf(inputFilename);
					System.out.println("File exists " + inputFilename + " at index " + arrayIndex);
					} else {
						System.out.println("File not found.");
						System.out.println("Array is not empty but file doesn't exist.");
						}
				}
		
		}
		
		return arrayIndex;
	}
	
	public boolean getFileFound() {
		
		return fileFound;
		
	}
	
}
