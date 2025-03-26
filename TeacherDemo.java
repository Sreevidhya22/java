import java.util.*;

class Person{

String name;
String gender;
String address;
int age;

Person(String name, String gender, String address, int age){
this.name = name;
this.gender = gender;
this.address = address;
this.age = age;
}
}

class Employee extends Person{
int empId;
String company;
String qualification;
double salary;

Employee(String name, String gender, String address, int age, int empId, String company, String qualification, double salary){
super(name, gender, address, age);
this.empId = empId;
this.company = company;
this.qualification = qualification;
this.salary = salary;
}
}

class Teacher extends Employee{

String subject;
String department;
int teacherId;

Teacher(String name, String gender, String address, int age, int empId, String company, String qualification, double salary, String subject, String department, int teacherId){

super(name, gender, address, age, empId, company, qualification, salary);
this.subject = subject;
this.department = department;
this.teacherId = teacherId;
}

void display(){
System.out.println("Name : " + name);
System.out.println("Gender : " + gender);
System.out.println("address : " + address);
System.out.println("Age : " + age);
System.out.println("Employee Id : " + empId);
System.out.println("Company : " + company);
System.out.println("Qualification : " + qualification);
System.out.println("salary : " + salary);
System.out.println("subject : " + subject);
System.out.println("department : " + department);
System.out.println("Teacher ID : " + teacherId);
}
}

public class TeacherDemo{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
Scanner s = new Scanner(System.in);

System.out.println("Enter the number of employee : ");
int n = sc.nextInt();

Teacher[] teachers = new Teacher[n];

for(int i = 0; i < n; i++){

System.out.println("Enter Employee Name");
String name = s.nextLine();

System.out.println("Enter Employee Gender");
String gender = s.nextLine();

System.out.println("Enter Employee address");
String address = s.nextLine();

System.out.println("Enter Employee Age");
int age = sc.nextInt();

System.out.println("Enter Employee Id");
int empId = sc.nextInt();

System.out.println("Enter Employee Company");
String company = s.nextLine();

System.out.println("Enter Employee Qualification");
String qualification = s.nextLine();

System.out.println("Enter Employee salary");
double salary = sc.nextDouble();

System.out.println("Enter Employee Subject");
String subject = s.nextLine();

System.out.println("Enter Employee Department");
String department = s.nextLine();

System.out.println("Enter Teacher Id");
int teacherId = sc.nextInt();

teachers[i] = new Teacher(name, gender, address, age, empId, company, qualification, salary, subject, department, teacherId);
}

System.out.println("Teachers Details");
for(int i = 0; i < n; i++){
teachers[i].display();
}
}
} 
