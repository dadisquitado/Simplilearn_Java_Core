package com.simplilearn.FileHandler;

import java.io.File;

public class GoCommand {
	
	private String directory;
	private File file;
	private boolean isExists;
	private String currDirectory;
	private String currDir = "Current directory is ";
	private String doesntExist = "Directory doesn't exist. ";
	
	public String getDirectory() {
		System.out.println(currDir + directory);
		return directory;
	
	}

	public void setDirectory(String directory) {

		if (directory == null) {
			directory = ".";
		}
		
		if (directory.equals("asc") || directory.equals("desc")) {
			directory = ".";
		}
		
		this.file = new File(directory);
		isExists = file.exists();
		
		if (isExists == true && directory == "." && currDirectory == null) {
		
			currDirectory = file.getAbsolutePath();
			this.directory = currDirectory;
			System.out.println(currDir + currDirectory);
		
		} else if (isExists == true && directory == "." && currDirectory != null) {
			
			this.file = new File(currDirectory);
			this.directory = currDirectory;
			System.out.println(currDir + currDirectory);
		
		} else if (isExists == true) {
		
			currDirectory = directory;
			this.directory = currDirectory;
			System.out.println(currDir + currDirectory);
		
		} else if (isExists == false && currDirectory == null) {
		
			this.file = new File(".");
			currDirectory = file.getAbsolutePath();
			this.directory = currDirectory;
			System.out.println(doesntExist + currDir + currDirectory);
			
		} else if (isExists == false && currDirectory != null) {
			
			this.file = new File(currDirectory);
			this.directory = currDirectory;
			System.out.println(doesntExist + currDir + currDirectory);
		
		} else {
		
			this.file = new File(currDirectory);
			this.directory = currDirectory;
			System.out.println(doesntExist + currDir + currDirectory);
		
		}
	
	}
	
	public void setFile(File file) {
		
		this.file = file;
		
	}
	
	public File getFile() {
		
		return this.file;
		
	}

}
