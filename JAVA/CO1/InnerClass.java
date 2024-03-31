Aim : Java Prgram to Create Inner Class and  Objects for Inner Class
//Algorithm
Step: Start
Step: Create a new instance of the CPU class.
Step: Create a new instance of the nested class Processor using the new keyword.
Step: Create a new instance of the nested class RAM using the new keyword.
Step: Print the processor cache value by calling the getCache() method on the Processor instance.
Step: Print the RAM clock speed value by calling the getClockSpeed() method on the RAM instance.
Step: Stop	
//Program
class CPU
{
  double price;
  class Processor
  {
    double cores;
    String manufacturer;
    double
    getCache ()
    {
      return 3.40;
    }
  } 
  protected class RAM
  {
    double memory;
    String manufacturer;
    double
    getClockSpeed ()
    {
      return 5.2;
    }
  }
} 
public class InnerClass
{
public static void main (String[] args)
  {
    CPU cpu = new CPU ();
    CPU.Processor processor = cpu.new Processor ();
    CPU.RAM ram = cpu.new RAM ();
    System.out.println ("Processor Cache = " + processor.getCache ());
    System.out.println ("Ram Clock speed = " + ram.getClockSpeed ());
  }
}
//Output
Processor Cache = 3.4
Ram Clock speed = 5.2

