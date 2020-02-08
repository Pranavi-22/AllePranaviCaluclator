package mypackage;
class caluclator
{
		int a,b;
		caluclator(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
		void add()
		{
			add obj1=new add(a,b);
		}
		void sub()
		{
			sub obj1=new sub(a,b);
		}
       void mul()
       {
    	   mul obj2=new mul(a,b);
       }
       void div() 
	{
		div obj3=new div(a,b);
	}
       //dry principle ;
 }

