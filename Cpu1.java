
class Cpu
{
int price;

class Processor
{
int core;
String manufacture;
}

static class Ram
{
int memory;
String manufacture;
 }
 
}
class Cpu1
{
 
public static void main(String args[])
{

Cpu obj = new Cpu();
obj.price = 1200;

Cpu.Processor pc = obj.new Processor();
pc.core = 12; 
pc.manufacture = "Intel";

Cpu.Ram r = new Cpu.Ram();
r.memory = 32;
r.manufacture = "lg";

System.out.println("CPU price : " + obj.price);
System.out.println("Processor manufacturer : " + pc.manufacture);
System.out.println("Processor core : " + pc.core);
System.out.println("Ram memory : " + r.memory);
System.out.println("Ram manufacturer : " + r.manufacture);

}
}


