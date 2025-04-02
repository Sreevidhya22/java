import java.util.*;

interface Student{
void setAcademicScore(int score);
int getAcademicScore();
}

interface Sport{
void setSportScore(int score);
int getSportScore();
}

class Result implements Student,Sport {
String name;
int academicScore;
int sportScore;

Result(String name) {
this.name = name;
}

public void setAcademicScore(int score){
this.academicScore = score;
}

public int getAcademicScore() {
return academicScore;
}

public void setSportScore(int score){
this.sportScore = score;
}

public int getSportScore() {
return sportScore;
}

public void display(){
System.out.println("Name : " + name);
System.out.println("Academic Score : " + getAcademicScore());
System.out.println("Sport Score : " + getSportScore());
}
}

public class MultipleInterface {
public static void main(String args[]) {
 
Scanner sc = new Scanner(System.in);

System.out.println("Enter the name of the student");
String name = sc.nextLine();

System.out.println("Enter the academic mark");
int academicScore = sc.nextInt();

System.out.println("Enter the Sport score");
int sportScore = sc.nextInt();

Result result = new Result(name);
result.setAcademicScore(academicScore);
result.setSportScore(sportScore);

result.display();
}
}
