package com.simplilearn.FileHandler;

import java.io.File;
import java.io.IOException;

public class AddCommand {
	
	private String directory;
	private String fileDirectory;
	private File file;
	private String currDir = "Current directory is ";
	public String getDirectory() {
		
		System.out.println(currDir + directory);
		return directory;
	
	}

	public void setDirectory(String directory) {
		
		if (directory != null) {
			this.file = new File(".");
			
			try {
				fileDirectory = file.getAbsolutePath() + "/" + directory;
				this.file = new File(fileDirectory);
				file.createNewFile();
				System.out.println("File created: " + fileDirectory);
			} catch (IOException e) {
				System.out.println("Failed to create the file. Provide proper filename. Avoid using slash '/'.");
			}
			
		} else {
			
			System.out.println("Please provile the file to add.");
			
		}
	
	}
	
	public void setFile(File file) {
		
		this.file = file;
		
	}
	
	public File getFile() {
		
		return this.file;
		
	}

}