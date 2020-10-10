package com.cruds.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class DataInputDemo {

	public static void main(String[] args) {
		try(DataInputStream dis= new DataInputStream(new FileInputStream("test.DAT")); )
		{
			//DataInputStream dis = new DataInputStream((new FileInputStream("test.DAT"));
		System.out.println(	dis.readDouble());
			 System.out.println(dis.readInt());
			 System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}



