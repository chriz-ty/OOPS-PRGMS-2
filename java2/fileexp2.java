package javacode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class fileexp2 
 {
  public static void main(String[] args) throws IOException 
   {
	File fo = new File("fileexp2.txt");
		
	 if(fo.exists())
		System.out.println("File exists");
	 else
	  {
		fo.createNewFile();
		System.out.println("File created");
	  }
		
	 try
	  {
	    FileOutputStream fi = new FileOutputStream("fileexp2.txt",true);
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the data: ");
		String s = br.readLine();
		byte[] a = s.getBytes();
	    fi.write(a);
	    System.out.println("Data added");
	   }
	 
	 catch(Exception e)
	   {
		System.out.println("File not found");
	   }
		
	int i=0;
	FileInputStream fi = new FileInputStream("fileexp2.txt");
	System.out.println(fi.available());
		
	 while((i=fi.read())!=-1)
	   {
		char x=(char)i;
		System.out.print(x);
	   }
   }
  }
