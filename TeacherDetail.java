import java.util.*;

class Employee{
int empId;
String name;
String address;
double salary;

Employee(int empId, String name, String address, double salary){
this.empId = empId;
this.name = name;
this.address = address;
this.salary = salary;
}
}

class Teacher extends Employee{
String department;
String subject;

Teacher(int empId, String name, String address, double salary, String department, String subject){
super(empId,name,address,salary);
this.department = department;
this.subject = subject;
}

void display(){
System.out.println("Employee Id : " + empId);
System.out.println("Name : " + name);
System.out.println("address : " + address);
System.out.println("salary : " + salary);
System.out.println("department : " + department);
System.out.println("subject : " + subject);
}
}

public class TeacherDetail{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Scanner s = new Scanner(System.in);

System.out.print("Enter the number of employees : ");
int n = sc.nextInt();

Teacher[] teachers = new Teacher[n];

for(int i = 0; i < n; i++){

System.out.println("Enter Employee Id");
int empId = sc.nextInt();

System.out.println("Enter Employee Name");
String name = s.nextLine();

System.out.println("Enter Employee address");
String address = s.nextLine();

System.out.println("Enter Employee salary");
double salary = sc.nextDouble();

System.out.println("Enter Employee Department");
String department = s.nextLine();

System.out.println("Enter Employee Subject");
String subject = s.nextLine();

teachers[i] = new Teacher(empId,name,address,salary,department,subject);
}

System.out.println("Teachers Details");
for(int i = 0; i < n; i++){
teachers[i].display();
}

}
}
