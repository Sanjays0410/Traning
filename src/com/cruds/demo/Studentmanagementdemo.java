package com.cruds.demo;
import com.cruds.db.StudentDAO;
import java.util.Scanner;

import com.cruds.db.StudentDAO;
import java.util.List;
public class Studentmanagementdemo {

	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String choice;
		StudentDAO dao=new StudentDAO();
		int rollno;
		do
		{
			System.out.println("welcome");
			System.out.println("1. add student");
			System.out.println("2. search student by rollno");
			System.out.println("3. list all student");
			System.out.println("4. delete student by rollno");
			System.out.println("5 exit");
			choice=sc.nextLine();
			switch(choice)
			{
			case "1" : 
							System.out.println("enter the student rollno");
							rollno=sc.nextInt();
							sc.nextLine();
							System.out.println("enter the student name");
							String name=sc.nextLine();
							Student s=new Student(rollno, name, null);
							if(dao.create(s))
								{
									System.out.println("student details added");
								}
							break;
							
			case "2" :		
							System.out.println("enter the student rollno to search is data");
							rollno=sc.nextInt();
							if(dao.getStudent(rollno) != null)
							{
								System.out.println(dao.getStudent(rollno));
							}
							else
							{
								System.out.println("data not found");
							}
							break;
							
			case "3":  	
						List <Student> list=dao.getAllStudents();
						System.out.println("========rollno======name");
						for(Student s2:list)
						{
							System.out.println(s2);
						}
						break;
						
			case "4":  
						System.out.println("enter the rollno of student to be deleted");	
			           int delrollno=sc.nextInt();
			           	if(dao.delete(delrollno))
			           	{
			        	  System.out.println("  student data deleted");
			           	}
			           	else 
			           	{
			           		System.out.println("data not found");
			           	}
			           	break;
			           	
			case "5": 
					System.out.println("exiting application thank u");
				
						break;
			
			}
			

		}while(!choice.equals("5"));
		sc.close();
		
	
	}

}
