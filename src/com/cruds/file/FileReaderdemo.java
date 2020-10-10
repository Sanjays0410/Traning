package com.cruds.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderdemo 
{
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("states.txt")))
		{
			String line=br.readLine();
					while(line!=null)
					{
						System.out.println(line);
						line=br.readLine();
					}
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
