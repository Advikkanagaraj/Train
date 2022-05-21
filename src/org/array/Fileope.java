package org.array;

import java.io.File;
import java.io.IOException;

public class Fileope {

	public static void main(String[] args) throws IOException {
		
		//to create new folder or dir
		File f=new File("E:\\2022\\raj");
		/*boolean mkdir = f.mkdir();
		System.out.println(mkdir);*/
		
		
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		
		boolean canRead = f.canRead();
		System.out.println(canRead);
		
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		
		boolean file = f.isFile();
		System.out.println(file);
		
		boolean exists = f.exists();
		System.out.println(exists);
		
		String[] list = f.list();
		System.out.println(list);
		
		File[] listFiles = f.listFiles();
		System.out.println(listFiles);
		
		boolean directory = f.isDirectory();
		System.out.println(directory);
		
		
		
		
		
	}
}
