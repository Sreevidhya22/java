import java.util.*;

class publisher
{
String publishername;
String agencyname;
publisher(String publishername,String agencyname)
{
this.publishername=publishername;
this.agencyname=agencyname;
}
}

class book extends publisher
{
String bookname;
String author;
int price;
String type;
book(String publishername,String agencyname,String bookname,String author,int price,String type)
{
super(publishername,agencyname);

this.bookname=bookname;
this.author=author;
this.price=price;
this.type=type;
}
}

class literature extends book
{
literature(String publishername,String agencyname,String bookname,String author,int price,String type)
{
super(publishername,agencyname,bookname,author,price,type);
}
void display()
{

System.out.println("publishername:"+this.publishername);
System.out.println("agencyname:"+this.agencyname);
System.out.println("bookname:"+this.bookname);
System.out.println("author:"+this.author);
System.out.println("price:"+this.price);
System.out.println("type:"+this.type);
}
}
class fiction extends book
{
fiction(String publishername,String agencyname,String bookname,String author,int price,String type)
{
super(publishername,agencyname,bookname,author,price,type);
}

void display()
{

System.out.println("publishername:"+this.publishername);
System.out.println("agencyname:"+this.agencyname);
System.out.println("bookname:"+this.bookname);
System.out.println("author:"+this.author);
System.out.println("price:"+this.price);
System.out.println("type:"+this.type);
}
}

public class hierarchical
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Scanner s=new Scanner(System.in);
System.out.println("Enter the details of literature book:");
System.out.println("Publisher name:");
String publishername1=s.nextLine();
System.out.println("agency name:");
String agencyname1=s.nextLine();
System.out.println("bookname:");
String bookname1=s.nextLine();
System.out.println("author:");
String author1=s.nextLine();
System.out.println("price:");
int price1=sc.nextInt();
System.out.println("type :");
String type1=s.nextLine();

literature literaturebook=new literature(publishername1,agencyname1,bookname1,author1,price1,type1);

System.out.println("Enter the details of fiction book:");
System.out.println("Publisher name:");
String publishername2=s.nextLine();
System.out.println("agency name:");
String agencyname2=s.nextLine();
System.out.println("bookname:");
String bookname2=s.nextLine();
System.out.println("author:");
String author2=s.nextLine();
System.out.println("price:");
int price2=sc.nextInt();
System.out.println("type :");
String type2=s.nextLine();

fiction fictionbook=new fiction(publishername2,agencyname2,bookname2,author2,price2,type2);

System.out.println(" details of literature book:");
literaturebook.display();
System.out.println("details of fiction book:");
fictionbook.display();
}
}







