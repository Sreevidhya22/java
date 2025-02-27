import java.util.*;

public class StringSort{
public static void main(String args[]){

int n;
String temp = new String();


Scanner sc = new Scanner(System.in);

System.out.println("Enter the no: of Strings you want to enter");
n = sc.nextInt();

String s[] = new String[n];

sc.nextLine();

System.out.println("Enter the Strings");
for(int i = 0; i < n; i++){
s[i] = sc.nextLine();
}

System.out.println("Before Sorting : ");
for(int i = 0; i < n; i++){
System.out.println(s[i]);
}

for(int i = 0; i < n; i++){
for(int j = 0; j < n; j++){
if(s[i].compareTo(s[j]) < 0){
temp = s[j];
s[j] = s[i];
s[i] = temp;
}
}
}

System.out.println("after Sorting : ");
for(int i = 0; i < n; i++){
System.out.println(s[i]);
}
}
}
