import java.util.*;

class Product{
int p_code;
String p_name;
int price;
}

public class Demo{
 public static void main(String args[]){
  
  Product obj1 = new Product();
  Product obj2 = new Product();
  Product obj3 = new Product();
  
  Scanner sc = new Scanner(System.in);
  
  
  System.out.println("Enter product 1 code : ");
  obj1.p_code = sc.nextInt();
  
  System.out.println("Enter product 1 price : ");
  obj1.price = sc.nextInt();
  
  sc.nextLine();
  
  System.out.println("Enter product 1 name : ");
  obj1.p_name = sc.nextLine();
  
  System.out.println("Enter product 2 code : ");
  obj2.p_code = sc.nextInt();
  
  System.out.println("Enter product 2 price : ");
  obj2.price = sc.nextInt();
  
  sc.nextLine();
  
  System.out.println("Enter product 2 name : ");
  obj2.p_name = sc.nextLine();
  
  System.out.println("Enter product 3 code : ");
  obj3.p_code = sc.nextInt();
  
  System.out.println("Enter product 3 price : ");
  obj3.price = sc.nextInt();
  
  sc.nextLine();
  
  System.out.println("Enter product 3 name : ");
  obj3.p_name = sc.nextLine();

  if(obj1.price < obj2.price && obj1.price < obj3.price){
   System.out.println("Product name : " + obj1.p_name);
   System.out.println("Product code : " + obj1.p_code);
   System.out.println("Product price : " + obj1.price);
  }else if(obj2.price < obj3.price){
   System.out.println("Product name : " + obj2.p_name);
   System.out.println("Product code : " + obj2.p_code);
   System.out.println("Product price : " + obj2.price);
  }else{
   System.out.println("Product name : " + obj3.p_name);
   System.out.println("Product code : " + obj3.p_code);
   System.out.println("Product price : " + obj3.price);
  }
 }
}
