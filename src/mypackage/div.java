package mypackage;

public class div {

	public div(int a, int b) {
		// TODO Auto-generated constructor stub
		//yagni principle is being satisfied as there no code is no extra is included
		try
		{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Division of "  +a+  " and " +b+ " is: " +(a/b));
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("error! dividing by zero is not allowed");
		}

	}

}
