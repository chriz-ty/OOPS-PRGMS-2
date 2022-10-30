package helloworld;
import java.util.Scanner;
public class Frequency
	{
		public static void main(String[] args)
			{
				int i,c=0,l;
				char x;
				String w;
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter a word");
				w=scan.next();
				System.out.println("Enter letter to check frequency");
				x=scan.next().charAt(0);
				l=w.length();
				for(i=0;i<l;i++)
				 {
					if(w.charAt(i)==x)
					c++;
				 }
				System.out.println("Number of times letter "+x+" repeats="+c);
			}
	}
