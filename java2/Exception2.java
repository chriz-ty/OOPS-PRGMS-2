package javacode;
import java.util.Scanner;
public class Exception2 
  {
    public static void main(String[] args) 
     {
      int n1,n2,d;
      char ch='y';
      Scanner sc = new Scanner(System.in);

      while(ch=='y'|| ch=='Y')
      {
       System.out.print("Enter the first number: ");
       n1=sc.nextInt();
       System.out.print("Enter the second number: ");
       n2=sc.nextInt();
     
       try 
        {
         d=n1/n2;
         System.out.println("Result: "+d);
        }
            
       catch (Exception e) 
        {
         System.out.println("Divison by zero is not allowed");
        }
            
       finally
        {
         System.out.println("End of Operatrion");   
        }
        
        System.out.print("\nDo you want to continue (y/n)");
        ch=sc.next().charAt(0);
        }

    }
}
