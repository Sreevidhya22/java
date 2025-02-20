import java.util.*;

public class Addition
{
 public static void main(String args[])
 {
 int a[][] = new int[20][20];
 int b[][] = new int[20][20];
 int c[][] = new int[20][20];
 
 int r1,r2,c1,c2;
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter number of row for first matrix");
 r1 = sc.nextInt();
 
 System.out.println("Enter number of column for first matrix");
 c1 = sc.nextInt();
 
 System.out.println("Enter the elements for first matrix:");
  for(int i = 0; i < r1; i++)
  {
  for(int j = 0; j < c1; j++)
  {
   a[i][j] = sc.nextInt();
  }
 }
 
 System.out.println("Enter number of row for second matrix");
 r2 = sc.nextInt();
 
 System.out.println("Enter number of column for second matrix");
 c2 = sc.nextInt();
 
 System.out.println("Enter the elements for second matrix:");
for(int i = 0; i < r2; i++)
{
 for(int j = 0; j < c2; j++)
 {
  b[i][j] = sc.nextInt();
  }
 }

 
 for(int i = 0; i < r2; i++)
 {
 for(int j = 0; j < c2; j++)
 {
  c[i][j] = a[i][j] + b[i][j];
  }
 }
 
 System.out.println("Matrix addition");
 
 for(int i = 0; i < r2; i++)
 {
 for(int j = 0; j < c2; j++)
 {
  System.out.print(c[i][j]+" ");
  }
   System.out.println(" ");
  }
 
 }
 
 }

