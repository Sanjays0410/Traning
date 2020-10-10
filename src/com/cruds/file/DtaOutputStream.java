package com.cruds.file;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DtaOutputStream {

	public static void main(String[] args) {
		try(DataOutputStream dos= new DataOutputStream(new FileOutputStream("test.DAT"));)
		{
			dos.writeDouble(99.99);
			dos.writeInt(22);
			dos.writeUTF("san");
			System.out.println("data written success");
			//DataOutputStream dos= new DataOutputStream(new FileOutputStream("test.DAT"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
