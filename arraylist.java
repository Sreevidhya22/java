import java.util.*;
import java.util.ArrayList;
class arraylist
{
public static void main(String args[])
{
ArrayList<Integer> numbers=new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
Scanner sc=new Scanner(System.in);
System.out.println("Enter new element:");
numbers.add(sc.nextInt());
System.out.println("list:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed element"+number);
int removedNumber=numbers.remove(1);
System.out.println("Removed element"+removedNumber);
for(int i=0;i<numbers.size();i++)
{
System.out.println(numbers.get(i)+" ");
}
}
}

