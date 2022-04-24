package com.simplilearn.FileHandler;

import java.io.File;

public class DeleteCommand {
	
	private String directory;
	private String fileDirectory;
	private File file;
	private boolean fileExists;
	private String currDir = "Current directory is ";
	public String getDirectory() {
		
		System.out.println(currDir + directory);
		return directory;
	
	}

	public void setDirectory(String directory) {
		
		if (directory != null) {
			
			this.file = new File(".");
			
			fileDirectory = file.getAbsolutePath() + "/" + directory;
			
			this.file = new File(fileDirectory);
			fileExists = file.exists();
			
			if (fileExists == false) {
				System.out.println("File doesn't exist.");
			} else {
				file.delete();
				System.out.println("File deleted: " + fileDirectory);
			}
				
		} else {
			
			System.out.println("Please provile the file to delete.");
			
		}
	
	}
	
	public void setFile(File file) {
		
		this.file = file;
		
	}
	
	public File getFile() {
		
		return this.file;
		
	}

}
