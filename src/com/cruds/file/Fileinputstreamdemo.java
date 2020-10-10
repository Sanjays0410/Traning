package com.cruds.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinputstreamdemo
{

	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		File file=new File("D:\\softwares\\eclipse-jee-oxygen-M2-win32-x86_64\\eclipse\\readme\\readme_eclipse.html");
		try {
			if(file.exists()&& file.canRead())
			{
			//byte[] bb= new byte[100];
			//bb= fis.read();
			
			fis  =new FileInputStream(file);
			}
			int size =fis.available();
			System.out.println("size" +size);
			for(int i=0;i<size;i++)
			{ 
				
				System.out.println((byte) fis.read()); 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				if(fis!=null)
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		// TODO Auto-generated method stub

	}

}
