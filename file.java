import java.io.*;
import java.util.StringTokenizer;

class file
{
public static void main(String args[])
{
try
{
FileReader f1=new FileReader("number.txt");
FileWriter f2=new FileWriter("even.txt");
FileWriter f3=new FileWriter("odd.txt");
int i;
Scanner sc=new Scanner(Sysetm.in);
String s=sc.nextLine();
StringTokenizer st = new StringTokenizer(s,"");
while(s)
{
if(i%2==0)
{
f2.write(i);
}
else
{
f3.write(i);
}
}
f1.close();
f2.close();
f3.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}
