package com.cruds.demo;


import java.util.List;
import java.util.Scanner;

import com.cruds.db.MoviesDAO;

public class MoviesManagement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int movieid;
		String choice;
		MoviesDAO dao=new MoviesDAO();
		do{
			System.out.println("=======welcome========");
			System.out.println("1. add details to movies data");
			System.out.println("2. search data by movie name");
			System.out.println("3. list all data");
			System.out.println("4. delete daya by movie id");
			System.out.println("5.========== exixting=========");
			choice =sc.nextLine();
			
			switch(choice)
			{
			case "1" :
					System.out.println("enter the movie id");
					movieid=sc.nextInt();
					System.out.println("enter the movie name");
					 String moviename=sc.nextLine();
					moviename= sc.nextLine();
					System.out.println("enter the movie hero");
					String moviehero=sc.nextLine();
					System.out.println("enter the movie director");
					String moviedirector=sc.nextLine();
					System.out.println("enter the hero salary");
					int herosal=sc.nextInt();
					
					Movies m=new Movies(movieid, moviename, moviehero, moviedirector, herosal);
					if(dao.create(m))
					{
					
					System.out.println("data added succesfully");
					}
					break;
		case "2" : 
					System.out.println("enter the movie name to search movie data");
					 String moviename1=sc.nextLine();
					if(dao.getmovies(moviename1)!=null)
					{
						System.out.println(dao.getmovies(moviename1));
					}
					else {
						System.out.println("data not found");
					}
					break;
		case "3" :	
					System.out.println("printing details of all movies");
					List<Movies> list=dao.getAllMovie();
			/*		if(dao.getAllMovie()!=null)
					{
						//System.out.println("hi");
						System.out.println(dao.getAllMovie());
					}  */
					for(Movies m1:list)
					{
						System.out.println(m1);
					}
				    
					break;
					
		case "4" :
					System.out.println("enter the movie id to delete movie details");
					movieid=sc.nextInt();
					if(dao.delete(movieid))
					{
						System.out.println("data deleted");
					}
					else
					{
						System.out.println("please enter correct data");
					}
					break;
					
		case "5" : 
					System.out.println("=========exiting========");
					break;
		
		}
	}while(!choice.equals("5"));
	
	}

}
