package javacode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class fileexp4 
{
  public static void main(String[] args) throws IOException
  {
   int i,n;
   File fo = new File("lineofnum.txt");
	
   if(fo.exists())
   System.out.println("File exists");
   else
   {
    fo.createNewFile();
    System.out.println("File created");
   }
				
   FileWriter fi = new FileWriter("lineofnum.txt",true);
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the no. of elements: ");
   n=sc.nextInt();
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the elements: ");
  
   for(i=1;i<=n;i++)
 	{
	 System.out.println("Enter the number"+i+":");
	 String no = br.readLine();
	 fi.write(no+" ");
	}
				
   System.out.println("Numbers added");
   fi.close();
   FileReader fr = new FileReader("lineofnum.txt");
   BufferedReader br1 = new BufferedReader(fr);
   String s;
   while((s=br1.readLine())!=null)
   System.out.println(s);
   fr.close();
  } 
 } 
