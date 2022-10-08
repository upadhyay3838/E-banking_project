package org.e_banking_utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class propertiesFileHandel {
public static	Properties pr;
	public static Properties prFileHandel(String filePath) throws IOException {
		
		File f=new File(filePath);
		FileInputStream fr=new FileInputStream(f);
	    pr=new Properties();
		pr.load(fr);
		System.out.println(pr);
		return pr;
		
		
		
	}

}
