import java.util.*;
interface shape
{
void area();
void perimeter();
}
class circle implements shape
{
double r;
circle(double r)
{
this.r=r;
}
public void area()
{
System.out.println("Area of circle is :"+3.14*r*r);
}
public void perimeter()
{
System.out.println("perimeter of circle is:"+2*3.14*r);
}
}
class rectangle implements shape
{
int l,b;
rectangle(int l,int b)
{
this.l=l;
this.b=b;
}
public void area()
{
System.out.println("area of rectangle is:"+l*b);
}
public void perimeter()
{
System.out.println("perimeter of rectangle is:"+2*(l+b));
}
}


class Interface
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int ch;
do
{
System.out.println("\nEnter your choice:");
System.out.println("1.to find area and perimeter of circle");
System.out.println("2.to find area and perimeter of rectangle");
System.out.println("0.exit");
ch = sc.nextInt();
switch(ch)
{
case 1:
	System.out.println("Enter the radius:");
	double r= sc.nextDouble();
	circle c =new circle(r);
	c.area();
	c.perimeter();
	break;
case 2:
	System.out.println("Enter the length and breadth:");
	int l=sc.nextInt();
	int b=sc.nextInt();
	rectangle re =new rectangle(l,b);
	re.area();
	re.perimeter();
	break;
case 0:
	System.out.println("Exiting....");
	break;
default:
	System.out.println("invalid choice");
	break;
}
}while(ch!=0);
sc.close();
}
}
	






