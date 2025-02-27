import java.util.*;

public class StringSearch{
public static void main(String args[]){

int n;
String key = new String();
boolean b = false;

String s[] = new String[10];
Scanner sc = new Scanner(System.in);
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the no: of Strings you want to enter");
n = sc.nextInt();

System.out.println("Enter the Strings");
for(int i = 0; i < n; i++){
s[i] = scanner.nextLine();
}

System.out.println("Enter the element to search");
key = scanner.nextLine();

for(int i = 0; i < n; i++){
if(s[i].equals(key)){
System.out.println("Element " + key + " found at index " + i+1);
b = true;
}
}

if(b == false){
System.out.println("Not found");
}
}
}
