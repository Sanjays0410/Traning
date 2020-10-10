package com.cruds.demo;

import java.util.Scanner;

public class StudenDir
{
	public static void main(String[] args)
	{
		Student[] studentdir=new Student[20];
		int top=0;
		
		String choice="";
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("please select the choice");
			System.out.println("1. add studnets");
			System.out.println("2. print details.");
			System.out.println("3. search by name");
			System.out.println("3. search by rollno");
			System.out.println("4.delete student details");
			System.out.println("5.exit");
			
			choice=sc.nextLine();
			
			System.out.println(choice);
			
			switch(choice)
			{
			case "1" : System.out.println("add details.");
			   
			           int rollno=sc.nextInt();
			          
			        
			           String studentname=sc.nextLine();
			           
			           Student stu=new Student(rollno,studentname, null);
			           studentdir[top]=stu;
			           top++;
			           
			           System.out.println("added details successfully!!!");
			           break;
			           
			case "2" : System.out.println("enter name");
						String searchname=sc.nextLine();
						boolean found=false;
						
						for(int i=0;i<top;i++)
						{
							if(searchname.equals(studentdir[i]))
							{
								found=true;
								break;
							}
						}
						
						
						if(found)
						{
							System.out.println(searchname + "found");
							
						}
						else
						{
							System.out.println(searchname + "not found");
						}
						
						break;
			/*case "3" :  System.out.println("enter rollno");
						//int searchrollno=sc.nextInt();
						//boolean found1=false;
			
						for(int i=0;i<top;i++)
						{
							if(searchrollno==(studentdir[i]))
							{
								found1=true;
								break;
							}
						}
			
						if(found1=true)
						{
							System.out.println(searchrollno + "found");
				
						}
						else
						{
							System.out.println(searchrollno + "not found");
						}
			
						break;
						
						*/
						
			case "5" : System.out.println("exit");
			           break;
			           
			           default : System.out.println("invalid choice");
			
			}
		}
		
		while(!choice.equals("5"));
			sc.close();
		
		
	}
}
