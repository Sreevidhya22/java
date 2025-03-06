import java.util.*;
class string
{
public static void main(String args[])
{
String txt;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
txt=sc.nextLine();
System.out.println("\nConverting string to lowercase:");
System.out.println(txt.toLowerCase());
System.out.println("\nConverting string to uppercase:");
System.out.println(txt.toUpperCase());
System.out.println("\nLength of the string:");
System.out.println(txt.length());
System.out.println("\nReplace the  string :");
System.out.println(txt.replace('e', 'i'));

String txt1;
System.out.println("\nEnter a second string:");
txt1=sc.nextLine();
System.out.println(txt.concat(txt1));





}
}


