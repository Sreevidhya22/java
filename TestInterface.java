import java.util.*;

interface Shape {
double area();
double perimeter();
}

class Circle implements Shape {
private int radius;

Circle(int radius) {
this.radius = radius;
}

public double area(){
return Math.PI * radius * radius;
}

public double perimeter() {
return 2 * Math.PI * radius;
}
}

class Rectangle implements Shape {
private int length;
private int breadth;

Rectangle(int length, int breadth) {
this.length = length;
this.breadth = breadth;
}

public double area(){
return length*breadth;
}

public double perimeter() {
return 2 * (length + breadth);
}
}

public class TestInterface {
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int choice;

do{
System.out.println("1.Circle, 2.Rectangle, 3.Exit");
System.out.println("Enter choice");
choice = sc.nextInt();

switch(choice) {
case 1:
System.out.println("Enter radius of the circle");
int radius = sc.nextInt();
Circle circle = new Circle(radius);
System.out.println("Area of the circle  : " + circle.area());
System.out.println("Perimeter of the circle : " + circle.perimeter());
break;

case 2:
System.out.println("Enter length of the rectangle");
int length = sc.nextInt();
System.out.println("Enter breath of the rectangle");
int breadth = sc.nextInt();
Rectangle rectangle = new Rectangle(length, breadth);
System.out.println("Area of the Rectangle  : " + rectangle.area());
System.out.println("Perimeter of the Rectangle : " + rectangle.perimeter());
break;

case 3:
System.out.println("Exiting");
choice = 3;
break;

default:
System.out.println("Invalid input");
}
}while(choice != 3);
}
}
