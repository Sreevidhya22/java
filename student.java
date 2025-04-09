

import java.util.*;
interface sports
{
public void sportsGetdata();
public void sportsDispdata();

}
class student1
{
String name;
int roll_no;
int s1;
int s2;

student1(String name,int roll_no,int s1,int s2)
{
this.name=name;
this.roll_no=roll_no;
this.s1=s1;
this.s2=s2;
}
}
class result extends student1 implements sports
{
int rank;
String item;
Scanner in=new Scanner(System.in);
result(String name,int roll_no,int s1,int s2)
{
super(name,roll_no,s1,s2);
}
void acadmic()
{
int percentage=(s1+s2)*100/200;
System.out.println("percentage="+percentage);
}

public void sportsGetdata()
{
System.out.println("enter the item name:");
item=in.nextLine();
System.out.println("enter the rank :");
rank=in.nextInt();
}
public void sportsDispdata()
{
System.out.println("sports item :"+item);
System.out.println("rank:"+rank);


}
}
class student
{
public static void main(String args[])
{
Scanner in=new  Scanner(System.in);
System.out.println("enter the name:");
String name=in.nextLine();
System.out.println("Enter roll no:");
int roll_no=in.nextInt();
System.out.println("enter mark in  frist subject:");
int s1=in.nextInt();
System.out.println("enter the second subject:");
int s2=in.nextInt();
result r=new result(name,roll_no,s1,s2);
r.sportsGetdata();
r.acadmic();
System.out.println();
r.sportsDispdata();
}
}













 
