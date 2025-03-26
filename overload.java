import java.util.*;
class shapes
{
void area(int l,int b)
{
int ar=l*b;
System.out.println("Area of the rectangle is:"+ar);
}

void area(double r)
{
double ar=(3.14*r*r);
System.out.println("Area of the circle is:"+ar);
}

void area(int side)
{
int ar=side*side;
System.out.println("Area of the square is:"+ar);
}
}



class overload
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
shapes s=new shapes();
System.out.println("Enter the length of the rectangle:");
int l=sc.nextInt();
System.out.println("Enter the breadth of the rectangle:");
int b=sc.nextInt();
s.area(l,b);

System.out.println("Enter the radius of the circle:");
double r=sc.nextInt();
s.area(r);

System.out.println("Enter the side of the square:");
int side=sc.nextInt();
s.area(side);
}
}
