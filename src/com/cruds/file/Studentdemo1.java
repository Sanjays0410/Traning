package com.cruds.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.cruds.demo.Student;

public class Studentdemo1 {

	public static void main(String[] args)
	{
		Student[] student=new Student[10];
		int pos=0;
		try(BufferedReader br=new BufferedReader(new FileReader("Student.txt")))
		{
			String line=br.readLine();
			while(line!=null)
			{
				String[] tokens=line.split(",");
				Student s=new Student(Integer.parseInt(tokens[0]),tokens[1],null);
				student[pos]=s;
				pos++;
				line=br.readLine();
			}
		}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		for(Student s:student)
		{
			if(s!=null)
			{
				s.printDetails();
			}
		}
		}
		

	}



