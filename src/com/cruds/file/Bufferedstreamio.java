package com.cruds.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferedstreamio {

	public static void main(String[] args)
	{
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\softwares\\eclipse-jee-oxygen-M2-win32-x86_64\\eclipse\\readme\\readme_eclipse.html"));
			BufferedOutputStream bos=new BufferedOutputStream(System.out);
			byte[] data=new byte[1024];
			boolean eof=false;
			int len=0;
			while(!eof)
			{
				len=bis.read(data);
				if(len==-1)
				{
					eof=true;
				}
				else
				{
					bos.write(data, 0,len);
				}
			}
		}
		catch(FileNotFoundException e){
		e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		

		}
		
	}
}

