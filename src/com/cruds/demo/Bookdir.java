package com.cruds.demo;

import java.util.Scanner;

public class Bookdir
{
	public static void main(String[] args) {
		Book[] b=new Book[10];
		int top=0;
		String choice="";
Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("please select the choice");
			System.out.println("1. add book");
			System.out.println("2. print details.");
			System.out.println("3. search by bookname");
			System.out.println("3. search by bookno");
			System.out.println("4.delete student details");
			System.out.println("5.exit");
			
			choice=sc.nextLine();
			
			System.out.println(choice);
			
			switch(choice)
			{
			case "1" : System.out.println("add details.");
			   
			           int bookno=sc.nextInt();
			          
			        
			           String bookname=sc.nextLine();
			           
			           Book bb=new Book(bookno,bookname);
			           b[top]=bb;
			           top++;
			           
			           System.out.println("added details successfully!!!");
			           break;
			           
			case "3" : System.out.println("enter name");
						String searchbookname=sc.nextLine();
						boolean found=false;
						
						for(int i=0;i<top;i++)
						{
							if(searchbookname.equals(b[i]))
							{
								found=true;
								break;
							}
						}
						
						
						if(found)
						{
							System.out.println(searchbookname + "found");
							
						}
						else
						{
							System.out.println(searchbookname + "not found");
						}
						
						break;
			case "2" :System.out.println("view details");
						for(int i=0;i<top;i++)
						{
							Book br=b[i];
							if(br!= null)
							{
								br.printDetails();
							}
						}
						break;
			/*case "3" :  
			 * System.out.println("enter bookno");
						int searchrollno=sc.nextInt();
						boolean found1=false;

						for(int i=0;i<top;i++)
						{
							if(searchrollno==(b[i]))
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
			
		
		 
	}

}*/
			}
		}
		while(!choice.equals("6"));
		sc.close();
	}
}
		
