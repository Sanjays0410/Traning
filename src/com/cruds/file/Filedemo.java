package com.cruds.file;

import java.io.File;
import java.io.FilenameFilter;

public class Filedemo {

	public static void main(String[] args) {
		File file=new File("D:\\softwares\\eclipse-jee-oxygen-M2-win32-x86_64\\eclipse");
		System.out.println(file.isDirectory());
		if(file.isDirectory()){
			String[] files=file.list( new TextfileFilter());
				
				
			
			for(String filename:files)
				System.out.println(filename);
		}

	}

}
