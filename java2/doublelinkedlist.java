package helloworld;
import java.util.*;
public class doublelinkedlist 
  {
	public static void main(String[] args)
	{
	 List<Integer> no=new LinkedList<>();
	 no.add(10);
	 no.add(13);
	 no.add(15);
	 no.add(17);
	 no.add(19);
	 System.out.println("List : " + no);
	 int num=no.get(3);
	 System.out.println("Element to be removed : "+num);
	 int ind= no.indexOf(17);
	 System.out.println("Position of  is "+ind);
	 int removedNumber = no.remove(3);
	 System.out.println("Removed Element: "+removedNumber);
	 System.out.println("List : "+no);
	}
  }
