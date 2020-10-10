package com.cruds.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputstreamexe {

	public static void main(String[] args) {
		// String msg="hello world!! welcome to java io";
		 //byte[] data= msg.getBytes();
		 try {
			 
			 FileInputStream fis=new FileInputStream("D:\\softwares\\eclipse-jee-oxygen-M2-win32-x86_64\\eclipse\\readme\\readme_eclipse.html");
			 byte[] data=new byte[fis.available()];
			 fis.read(data);
			FileOutputStream fos=new  FileOutputStream("demo.txt");
			fos.write(data);
			fos.close();
			fis.close();
			System.out.println(" data written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
				

	}

}
}
