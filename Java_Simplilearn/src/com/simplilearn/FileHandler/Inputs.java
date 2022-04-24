package com.simplilearn.FileHandler;

import java.util.Scanner;

public class Inputs {
	
	Scanner scanner = new Scanner(System.in);
	CloseCommand close = new CloseCommand();
	GoCommand go = new GoCommand();
	ListCommand list = new ListCommand();
	WrongCommand wrong = new WrongCommand();
	AddCommand add = new AddCommand();
	DeleteCommand delete = new DeleteCommand();
	FindCommand find = new FindCommand();
	
	private String[] inputCommandStr;
	private String inputString;
	private String inputCommand;
	private String inputParam;
	
	public void setInputCommand(String inputString) {
	
		this.setInputString(inputString);
		this.inputCommandStr = inputString.split(" ");
	
	}
	
	public String getInputCommand() {
		
		inputCommand = this.inputCommandStr[0];
		return inputCommand;
	
	}
	
	public String getInputParameter() {
		
		try {
			inputParam = this.inputCommandStr[1];
			return inputParam;
		}
		catch (Exception e) {
			return null;
		}
		
	}
	
	
	public void processCommand() {
		
		setInputCommand(scanner.nextLine());
		
		inputCommand = getInputCommand();
		inputParam = getInputParameter();
		
		switch (inputCommand) {
		
		case "go":
			go.setDirectory(inputParam);
			processCommand();
			break;
		
		case "list":
			go.setDirectory(inputParam);
			list.setSortParam(inputParam);
			list.setListOfFiles(go.getFile().listFiles());
			list.getListOfFiles();
			processCommand();
			break;
		
		case "add":
			add.setDirectory(inputParam);
			processCommand();
			break;
		
		case "delete":
			delete.setDirectory(inputParam);
			processCommand();
			break;
		
		case "find":
			find.setDirectory(inputParam);
			processCommand();
			break;
		
		case "close":
			close.closeCommand();
			break;
			
		case "exit":
			close.closeCommand();
			break;
			
		case "quit":
			close.closeCommand();
			break;
			
		default:
			wrong.wrongCommand();
			processCommand();
			
		}
	}

	public String getInputString() {
		return inputString;
	}

	public void setInputString(String inputString) {
		this.inputString = inputString;
	}

}
