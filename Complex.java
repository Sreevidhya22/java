import java.util.*;
class Complex
{
int r;
int i;
public Complex(int r,int i)
{
this.r=r;
this.i=i;
}
public void sum(Complex c1,Complex c2)
{
int x=c1.r+c2.r;
int y=c1.i+c2.i;
System.out.println("Sum of two complex number is:"+x+"+"+y+"i");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter real  value for first complex number:");
int r=sc.nextInt();
System.out.println("Enter imaginary  value for first complex number:");
int i=sc.nextInt();
System.out.println("Enter real value for second complex number:");
int r1=sc.nextInt();
System.out.println("Enter imaginary  value for second complex number:");
int i2=sc.nextInt();
Complex c1=new Complex(r,i);
Complex c2=new Complex(r1,i2);
Complex c3=new Complex(0,0);
c3.sum(c1,c2);
}
}
