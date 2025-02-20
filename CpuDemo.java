class Cpu{
int price;

class Processor{
int no_of_cores;
String manufacturer;
}

static class Ram{
int memory;
String manufacturer;
}
}

public class CpuDemo{
public static void main(String args[]){

Cpu cpu = new Cpu();
cpu.price = 1200;

Cpu.Processor processor = cpu.new Processor();
processor.no_of_cores = 12; 
processor.manufacturer = "Intel";

Cpu.Ram ram = new Cpu.Ram();
ram.memory = 40;
ram.manufacturer = "Samsung";

System.out.println("CPU price : " + cpu.price);
System.out.println("Processor manufacturer : " + processor.manufacturer);
System.out.println("Processor core : " + processor.no_of_cores);
System.out.println("Ram memory : " + ram.memory);
System.out.println("Ram manufacturer : " + ram.manufacturer);
}
}
