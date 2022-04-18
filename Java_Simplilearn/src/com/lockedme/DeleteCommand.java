package com.lockedme;

import java.util.ArrayList;

public class DeleteCommand {
	
	FindCommand find = new FindCommand();

	public ArrayList<String> deleteFile(ArrayList<String> fileArray) {
		
		int fileArrSize = 0;
		boolean fileFound = false;
		find.findFile(fileArray, fileArrSize, fileFound);
		
		if (find.getFileFound() == true) {
			fileArray.remove(fileArrSize);
		} else {
			System.out.println("File not found.");
		}
		
		return fileArray;
		
	}
	
}
