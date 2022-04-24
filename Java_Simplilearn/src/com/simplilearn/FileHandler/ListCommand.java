package com.simplilearn.FileHandler;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;

public class ListCommand {
	
	private File[] listOfFiles;
	private String sortParam;
	public File[] getListOfFiles() {
		
		if (sortParam == null) {
		
			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					System.out.println("File " + listOfFiles[i].getName());
				} else if (listOfFiles[i].isDirectory()) {
					System.out.println("Folder " + listOfFiles[i].getName());
				}
			}
			
		} else if (sortParam.equals("asc")) {
			
			Arrays.sort(listOfFiles);
			
			for (File f : listOfFiles) {
				
				if (f.isFile()) {
					System.out.println("File " + f.getName());
				} else if (f.isDirectory()) {
					System.out.println("Folder " + f.getName());
				}
			}

		} else if (sortParam.equals("desc")) {
			
			Arrays.sort(listOfFiles, Collections.reverseOrder());
			
			for (File f : listOfFiles) {
				
				if (f.isFile()) {
					System.out.println("File " + f.getName());
				} else if (f.isDirectory()) {
					System.out.println("Folder " + f.getName());
				}
			}
			
		} else {
			
			System.out.println("There's a problem listing the files in this directory.");
			
		}
		
		return listOfFiles;
	}

	public void setListOfFiles(File[] file) {
		this.listOfFiles = file;
	}

	public String getSortParam() {
		return sortParam;
	}

	public void setSortParam(String sortParam) {
		this.sortParam = sortParam;
	}


}
