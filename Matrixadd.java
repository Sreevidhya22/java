import java.util.*;

public class Matrixadd{
 public static void main(String args[]){
 
 int r1,r2,c1,c2;
 
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter row 1");
 r1 = sc.nextInt();
 
 System.out.println("Enter colomn 1");
 c1 = sc.nextInt();
 
 System.out.println("Enter row 2");
 r2 = sc.nextInt();
 
 System.out.println("Enter colomn 2");
 c2 = sc.nextInt();
 
 int a[][] = new int[20][20];
 int b[][] = new int[20][20];
 int c[][] = new int[20][20];
 
 System.out.println("Enter matrix 2");
 
 for(int i = 0; i < r1; i++){
  for(int j = 0; j < c1; j++){
   a[i][j] = sc.nextInt();
  }
 }
 
 System.out.println("Enter matrix 2");
 
 for(int i = 0; i < r2; i++){
 for(int j = 0; j < c2; j++){
  b[i][j] = sc.nextInt();
  }
 }
 
 for(int i = 0; i < r1; i++){
 for(int j = 0; j < c1; j++){
  c[i][j] = a[i][j] + b[i][j];
  }
 }
 
 System.out.println("Enter matrix 2");
 
 for(int i = 0; i < r2; i++){
 for(int j = 0; j < c2; j++){
  System.out.print(c[i][j]);
  }
  System.out.println();
 }
 
 }
}
