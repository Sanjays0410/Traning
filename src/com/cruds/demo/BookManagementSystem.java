package com.cruds.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cruds.db.BookDAO;

public class BookManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bookid =0;
		String title;
		String choice;
		BookDAO dao=new BookDAO();
		do{
			System.out.println("=========welcome=============");
			System.out.println("enter the choice");
			System.out.println("1.add book details");
			System.out.println("2.Search book by title");
			System.out.println("3.list all book");
			System.out.println("4.delete book by bookid");
			System.out.println("5.exiting application");
			choice=sc.nextLine();
			switch(choice)
			{
			case "1" : 
						System.out.println("enter the book details");
						System.out.println("enter the book id");
						 bookid=sc.nextInt();
						sc.nextLine();
						System.out.println("enter the book title");
						 title=sc.nextLine();
						System.out.println("enter the prize of book");
						Float prize=sc.nextFloat();
						Library l=new Library(bookid, title, prize);
						if(dao.create(l))
						{
							System.out.println("details added succesfully");
						}
						break;
			case "2" : 
						System.out.println("enter the book title to know its data ");
						  String title1=sc.nextLine();
						  List<Library> list=dao.getBook(title1);
						  if(list!=null)
						  {
						    System.out.println(dao.getBook(title1));
						  }
						  else
						  {
							  System.out.println("data not found");
						  }
						 
						
						break;
			case "3" :
						System.out.println("listing details all books available");
						List<Library> list1=dao.getAllBook();
						
						for(Library l1:list1)
						{
							System.out.println(l1);
						}
						/*if(dao.getAllLibrary()!=null)
						{
							System.out.println(dao.getAllLibrary());
						}
						else
						{
							System.out.println("=====no books found=====");
						}*/
						break;
			case "4" :
						System.out.println("enter the book id to delete ");
						int  bookid1=sc.nextInt();
						if(dao.delete(bookid1))
						{
							System.out.println("details deleted");
						}
						else
						{
							System.out.println("=====please enter correct book id");
						}
						break;
			case "5" : 
						System.out.println("=======exiting application========");
						break;
			
			
			
		}
	}while(!choice.equals("5"));
sc.close();
}
}
