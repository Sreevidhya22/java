package mca;
import graphics.*;
import java.util.*;

class packages
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle : ");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		Rectangle r=new Rectangle(l,b);
		System.out.println("Area of recatngle : "+r.area());
		
		System.out.println("Enter base and height of triangle : ");
		double base=sc.nextDouble();
		double h=sc.nextDouble();
		Triangle t=new Triangle(base,h);
		System.out.println("Area of triangle : "+t.area());
		
		System.out.println("Enter the side of square : ");
		double side=sc.nextDouble();
		Square s=new Square(side);
		System.out.println("Area of square : "+s.area());
		
		System.out.println("Enter the radius of circle : ");
		double radius=sc.nextDouble();
		Circle c=new Circle(radius);
		System.out.println("Area of circle : "+c.area());
	}
}
