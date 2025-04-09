package sidh;
import aritmetic.*;
import java.util.*;

public class ArithmeticOperation{
public static void main(String args[]){
Scanner s = new Scanner(System.in);

System.out.println("Enter 2 numbers : ");
double a = s.nextInt();
double b = s.nextInt();

Addition add = new Addition();
Subtraction sub = new Subtraction();
Multiplication m = new Multiplication();
Division d = new Division();

double sum = add.compute(a, b);
double diff = sub.compute(a, b);
double product = m.compute(a, b);
double quotient = d.compute(a, b);

System.out.println("Sum of " + a + " + " + b + " = " + sum);
System.out.println("Difference of " + a + " - " + b + " = " + diff);
System.out.println("Product of " + a + " x " + b + " = " + product);
System.out.println("Quotient of " + a + " / " + b + " = " + quotient);
}
}
