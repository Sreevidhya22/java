import java.util.*;

public class MatrixSymmetric{
 public static void main(String args[]){
 
 int r1,r2,c1,c2,flag=0;
 
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter row 1");
 r1 = sc.nextInt();
 
 System.out.println("Enter colomn 1");
 c1 = sc.nextInt();
 
 int a[][] = new int[20][20];
 int b[][] = new int[20][20];
 int c[][] = new int[20][20];
 
 System.out.println("Enter matrix 1");
 
 for(int i = 0; i < r1; i++){
  for(int j = 0; j < c1; j++){
   a[i][j] = sc.nextInt();
  }
 }
 
 for(int i = 0; i < r1; i++){
 for(int j = 0; j < c1; j++){
  b[i][j] = a[j][i];
  }
 }
 
 for(int i = 0; i < r1; i++){
  for(int j = 0; j < c1; j++){
   if(a[i][j] == b[i][j]){
   flag = 1;
   } else {
   flag = 0;
   break;
   }
  }
 }
 
if(flag == 1){
System.out.println("Symmetric");
}else{
System.out.println("not Symmetric");
}
 
 }
}
