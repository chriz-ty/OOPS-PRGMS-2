package JavaPack;

import java.util.Scanner;

public class javapck_arithmetic_exception {

public static void main(String[] args) {

int n1,d;

Scanner sc = new Scanner(System.in);

System.out.println("Enter the no: ");
n1=sc.nextInt();
         
try {
           d = n1/0;
         System.out.println("Result: "+d);
         
         
        }
         catch(ArithmeticException e1) {
        throw new ArithmeticException("Division by zero");
         }
 finally {
 System.out.println("End of Operation");
 }
}
}
