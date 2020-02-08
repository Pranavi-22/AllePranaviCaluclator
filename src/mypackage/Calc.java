package mypackage;
import mypackage.*;
import java.util.Scanner;
public class Calc
{
	public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		int a=sc.nextInt();
		System.out.println("enter number 2");
		int b=sc.nextInt();
		System.out.println("these are the operation select any one");
		System.out.println("1:+");
		System.out.println("2:-");
		System.out.println("3:*");
		System.out.println("4:/");
		int op=sc.nextInt();
		caluclator obj=new caluclator(a,b);
		switch(op) {
		case 1:
			obj.add();
			 break;
		case 2:
			obj.sub();
		    break;
		case 3:
			obj.mul();
		    break;
		case 4:
			obj.div();
		    break;
		    default:
		    	System.out.println("invalid choice enter between 1 to 4");
		//this calc class is just calling caluclator class and it is not dependent on any classes solid and kiss principle 
		}
	}
	
}
