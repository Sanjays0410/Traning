package com.cruds.collections;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.cruds.demo.Student;

public class PhoneDirectory 
{
	public static  void main(String[] args) 
	{
		Map<String, String> phMap=new HashMap<>();
		
			String choice;
			String searchphonenumber = null;
			String result;
			Scanner sc=new Scanner(System.in);
			try(ObjectInputStream oi=new ObjectInputStream(new FileInputStream("phone.ser"));)
			{
				phMap=(Map<String,String>)oi.readObject();
				System.out.println(phMap);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			do{
				System.out.println("please enter the choice");
				System.out.println(" 1add phone number");
				System.out.println("2 Search name");
				System.out.println("3. exit");
				choice=sc.nextLine();
				
				System.out.println( "you have entered " +choice);
				
				switch(choice)
				{
				case "1": System.out.println("enter the phone number");
						String phonenumber= sc.nextLine();
						System.out.println("enter the name");
						String name=sc.nextLine(); 
						 
						 phMap.put(phonenumber,name);
						
				        System.out.println("added details successfully!!!");
				           break;
				case "2" : System.out.println("enter the phno");
							searchphonenumber=sc.nextLine();
							   result= phMap.get(searchphonenumber);
							
			
						if(result!=null)
						{
							System.out.println(phMap.get(searchphonenumber));
							
						
						}
						else
						{
							System.out.println(searchphonenumber + "not found");
						}
			
						break;
						
				case "3":System.out.println("exit");
							try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("phone.ser"));)
							{
								os.writeObject(phMap);
								System.out.println("saved successfully");
								
							}
							catch(IOException e){
								e.printStackTrace();
							}
				break;
				}
				
		}while(!choice.equals("3"));
		sc.close();
		

}
}
