import java.util.*;
class test
{
static void age(int n)
{
if (n<18)
{
throw new ArithmeticException("age is lessthan 18");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter age:");
int n=sc.nextInt();
try
{
age(n);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}
