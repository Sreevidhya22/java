import java.util.*;

public class StringManipulation{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter a String");
String s1 = sc.nextLine();

System.out.println("Enter a String to cancat");
String s2 = sc.nextLine();

System.out.println("Enter a String to check matching");
String s3 = sc.nextLine();

System.out.println("Enter a String to replace");
String s4 = sc.nextLine();


System.out.println("Enter 2 index to check substring");
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("String converted to uppercase " + s1.toUpperCase());
System.out.println("String converted to lowercase " + s1.toLowerCase());
System.out.println("String length " + s1.length());

System.out.println("String after concatenation " + s1.concat(s2));
System.out.println("String matches " + s1.matches(s3));

System.out.println("String replace " + s1.replace(s1,s4));

System.out.println("substring " + s1.substring(a,b));
} 
}
