import java.util.Scanner;

class Shapes{
void area(int l, int b){
System.out.println("Area of rectangle : " + l*b);
}
void area(float r){
System.out.println("Area of circle : " + (3.14*r*r));
}
void area(double s){
System.out.println("Area of square : " + s*s);
}
}
public class OverloadTest{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Shapes sh = new Shapes();

System.out.println("Enter length abd breadth : ");
int l = sc.nextInt();
int b = sc.nextInt();
sh.area(l, b);

System.out.println("Enter radius : ");
float r = sc.nextInt();
sh.area(r);

System.out.println("Enter side : ");
double s = sc.nextInt();
sh.area(s);

sc.close();
}
}
