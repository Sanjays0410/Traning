package com.cruds.file;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.cruds.demo.Student;

public class Studentdata {

	public static void main(String[] args)

	{
		
		try(BufferedReader br=new BufferedReader(new FileReader("student.txt")))
		{
			String str=br.readLine();
			
			
			while(str!=null)
					{
				//String[] arrofline=new String[100];
				String[] arrofline=str.split(",");
				for( int i=0;i<arrofline.length;i++)
				{
					System.out.println(arrofline[i]);
				}
				
						str=br.readLine();
						
						
						//int size=arrofline.length;
						//for(int i=0;i<1;i++)
						
							String[] arr=new String[5];
							arr[0]=arrofline[0];
							arr[1]= arrofline[1];
							arr[2]=arrofline[2];
							
							int rollno= Integer.parseInt( arr[0]);
							String name=arr[1];
							String branch=arr[2];	
							Student st=new Student(rollno,name,null);
										
									
						if(arrofline!=null)
						{
							st.printDetails();
						}
						
					  	
					
					
						
					}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		}
	}


