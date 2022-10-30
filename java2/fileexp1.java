package javacode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FILEHANDLINGPROGRAMS1 
{
  public static void main(String[] args) throws FileNotFoundException,IOException 
	{
	  Scanner sc=new Scanner(System.in);
	  int i,n,num;
	  File fo = new File("number.txt");
	  
	   if(fo.exists())
			System.out.println("File Exists");
		 else
			System.out.println("File Created\n");
	  
		FileOutputStream fi=new FileOutputStream("number.txt");
		System.out.print("\nEnter the number of elements: ");
		n=sc.nextInt();
		
		 for(i=0;i<n;i++)
		   {
			System.out.print("\nEnter the elements "+(i+1)+": ");
			num=sc.nextInt();
			fi.write(num);
		   }
		
		fi.close();
		i=0;
		FileInputStream file=new FileInputStream("number.txt");
		System.out.print("\n\nThe elements are: ");
		while((i=file.read())!=-1) 
		 {
		  System.out.print(i);
		 }
		file.close();
	 }
 }
