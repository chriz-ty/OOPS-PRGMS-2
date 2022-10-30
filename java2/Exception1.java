package javacode;
import java.util.*;
public class Excep1
  {

   public static int divide(int first,int second)throws ArithmeticException
      {  
	    return first/second;
      }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Values: ");
        int firstNumber,secondNumber;
        firstNumber=sc.nextInt();
        secondNumber=sc.nextInt();
        try
        {
          System.out.println("Result="+ divide(firstNumber,secondNumber));
            
        }
        catch(ArithmeticException e)
        {
          System.out.println(e.getMessage());   
        }
    }
}
