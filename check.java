import java.util.*;
class EvenException extends Exception
{
EvenException(String s)
{
super(s);
}
}
class OddException extends Exception
{
OddException(String s)
{
super(s);
}
}
class check
{
 static void Even(int n)throws EvenException,OddException
 {
 if(n%2==0)
 {
 throw new EvenException("number is even");
 }
 else
 {
   throw new OddException("number is odd");
 }
 }
 
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a number:");
 int n=sc.nextInt();
 try
 {
 Even(n);
 }
 catch(EvenException e)
 {
 System.out.println(e);    
 }
 catch(OddException e)
 {
 System.out.println(e);
 }
 }
 }
