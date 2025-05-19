import java.util.*;
class Multiplication extends Thread
{
	public void run()
	{
	 	int n=5;
	 	System.out.println("...Multiplication table of 5...");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" * "+n+" = "+n*i);
		}
	}
}
class Primeno implements Runnable
{
	private int num1;
	public Primeno(int num1)
	{
		this.num1=num1;
	}
	public void run()
	{
		Prime(num1);
	}
	static void Prime(int num1)
	{
		System.out.println("All prime numbers within "+1+" and "+num1+" are : ");
		for(int i=2;i<=num1;i++)
		{
			int count=0;  
     		for(int j=2;j<=i/2;j++)
     		{
        		if(i%j==0)
        		{
          			count++;  
          			break;  
        		}
      		}
      		if(count==0) 
      		{
        		System.out.println(i);
	  		}
		}
	}
}
class Threadclass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int num1=sc.nextInt();
		Primeno p=new Primeno(num1);
		Thread t1=new Thread(p);
		t1.start();
		try
		{
			t1.sleep(100);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Multiplication m=new Multiplication();
		m.start();
	}
}
