class MultiplicationTable extends Thread{
public void run(){
for(int i=0;i<10;i++){
int n = 5*i;
System.out.println("5" + "x" + i + "=" + n);
}
}
}

class PrimeNumbers extends Thread{
int num;
public PrimeNumbers(int num){
this.num = num;
}
public void run(){
for(int i = 0; i < num; i++){
if(isPrime(i)){
System.out.println(i);
}
}
}

public boolean isPrime(int number){
if(number<=1){
return false;
}
for(int i = 2; i<=Math.sqrt(number); i++){
if(number%i==0){
return false;
}
}
return true;
}
}

public class ThreadDemo{
public static void main(String args[]){

MultiplicationTable m = new MultiplicationTable();
PrimeNumbers p = new PrimeNumbers(10);

m.start();
p.start();


}
}
