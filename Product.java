import java.util.*;

class Product1{
int p_code;
String p_name;
int price;
}

public class Product{
 public static void main(String args[])
 {
  
  Product1 p1 = new Product1();
  Product1 p2 = new Product1();
  Product1 p3 = new Product1();
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter product1 code : ");
  p1.p_code = sc.nextInt();
  System.out.println("Enter product1 price : ");
  p1.price = sc.nextInt();
  sc.nextLine();
  System.out.println("Enter product 1 name : ");
  p1.p_name = sc.nextLine();
  System.out.println("Enter product 2 code : ");
  p2.p_code = sc.nextInt();
  System.out.println("Enter product 2 price : ");
  p2.price = sc.nextInt();
  sc.nextLine();
  System.out.println("Enter product 2 name : ");
  p2.p_name = sc.nextLine();
  System.out.println("Enter product 3 code : ");
  p3.p_code = sc.nextInt();
  System.out.println("Enter product 3 price : ");
  p3.price = sc.nextInt();
  sc.nextLine();
  System.out.println("Enter product 3 name : ");
  p3.p_name = sc.nextLine();
  
  System.out.println("----LOWEST PRICE PRODUCT DETAILS---"); 
  if(p1.price < p2.price && p1.price < p3.price)
  {
   System.out.println("Product name : " + p1.p_name);
   System.out.println("Product code : " + p1.p_code);
   System.out.println("Product price : " + p1.price);
  }
  else if(p2.price < p3.price)
  {
   System.out.println("Product name : " + p2.p_name);
   System.out.println("Product code : " + p2.p_code);
   System.out.println("Product price : " + p2.price);
  }
  else
  {
   System.out.println("Product name : " + p3.p_name);
   System.out.println("Product code : " + p3.p_code);
   System.out.println("Product price : " + p3.price);
  }
 }
}







