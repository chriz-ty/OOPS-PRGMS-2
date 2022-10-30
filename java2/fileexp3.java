package javacode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class fileexp3
 {
  public static void main(String[] args) throws IOException 
   {
    File fo = new File("filexp3.txt");
		
     if(fo.exists())
		System.out.println("File exists");
	 else
	   {
		fo.createNewFile();
		System.out.println("File created");
	   }
		
	FileWriter fi = new FileWriter("content.txt",true);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter data: ");
	String s = br.readLine();
	fi.write(s+" ");
    System.out.println("Content added to the file");
	fi.close();
    FileReader fr = new FileReader("content.txt");
	BufferedReader br1 = new BufferedReader(fr);
	String s1;
		
	 while((s1=br1.readLine())!=null)
		System.out.println(s1);
		
	 fr.close();
  }
 }
