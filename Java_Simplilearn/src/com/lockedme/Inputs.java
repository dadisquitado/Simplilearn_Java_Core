package com.lockedme;

import java.util.ArrayList;
import java.util.Scanner;

public class Inputs {
	
    Scanner scanner = new Scanner(System.in);
    AddCommand add = new AddCommand();
    ListCommand list = new ListCommand();
    FindCommand find = new FindCommand();
    DeleteCommand delete = new DeleteCommand();
	
	public void getCommand(ArrayList<String> fileArray) {
		
		System.out.println("Input the command: ");
		String inputCommand;
		int arrayIndex = 0;
    	boolean fileFound = false;
        inputCommand = scanner.next();
        
        switch (inputCommand) {
        case "list":
        	System.out.println("List Command");
        	list.listFiles(fileArray);
        	this.getCommand(fileArray);
        	break;
        case "add":
        	System.out.println("Add Command");
        	add.addFile(fileArray);
        	this.getCommand(fileArray);
        	break;
        case "delete":
        	System.out.println("Delete Command");
        	delete.deleteFile(fileArray);
        	this.getCommand(fileArray);
        	break;
        case "find":
        	System.out.println("Find Command");
			find.findFile(fileArray, arrayIndex, fileFound);
        	this.getCommand(fileArray);
        	break;
        case "close":
        	System.out.println("Close Command");
        	CloseCommand close = new CloseCommand();
        	close.closeCommand();
        	break;
        };     
        
        scanner.nextLine(); //This is needed to pick up the new line
		
	};
	
}
