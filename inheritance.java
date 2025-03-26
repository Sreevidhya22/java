import java.util.*;
class employee
{
int emp_id;
String emp_name;
String address;
double emp_salary;
employee(int emp_id,String emp_name,String address,double emp_salary)
{
this.emp_id = emp_id;
this.emp_name = emp_name;
this.address = address;
this.emp_salary = emp_salary;
}
}

class teacher extends employee
{
String department;
String subject;
teacher(int emp_id,String emp_name,String address,double emp_salary, String department, String subject)
{
super(emp_id,emp_name,address,emp_salary);
this.department = department;
this.subject = subject;
}

void display()
{
System.out.println("Employee Id : " + emp_id);
System.out.println("Name : " + emp_name);
System.out.println("address : " + address);
System.out.println("salary : " + emp_salary);
System.out.println("department : " + department);
System.out.println("subject : " + subject);
}
}

class inheritance
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of teachers:");
int n=sc.nextInt();
sc.nextLine();
teacher [] teachers=new  teacher[n];

for(int i=0;i<n;i++)
{

System.out.println("Enter Employee Id");
int emp_id = sc.nextInt();

System.out.println("Enter Employee Name");
String emp_name = s.nextLine();

System.out.println("Enter Employee address");
String address = s.nextLine();

System.out.println("Enter Employee salary");
double emp_salary = sc.nextDouble();

System.out.println("Enter Employee Department");
String department = s.nextLine();

System.out.println("Enter Employee Subject");
String subject = s.nextLine();

teachers[i] = new teacher(emp_id,emp_name,address,emp_salary,department,subject);
}

System.out.println("enter the employee number to be searched:");
int no=s.nextInt();
boolean found=false;
for(teacher teacher:teachers)
{
if(teacher.emp_id==no)
{
found=true;
teacher.display();
break;
}
}

if(!found)
{
System.out.println("employee not found:");
}
sc.close();
s.close();
}
}








