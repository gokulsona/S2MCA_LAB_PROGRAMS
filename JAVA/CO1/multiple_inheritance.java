#Aim : Write a Java Program for Multiple Inheritance

#Algorithm
Step 1: Start
Step 2: Define the Shape class with a method display that prints "Inside display".
Step 3: Define the Rectangle class that extends Shape and includes a method area that prints "Inside area".
Step 4: Define the Cube class that extends Rectangle and includes a method volume that prints "Inside volume".
Step 5: In the Tester class, define the main method.
Step 6: In the main method, create an instance of the Cube class.
Step 7: Call the display, area, and volume methods on the Cube instance.
Step 8: Stop


#Program
class Shape 
{
    public void display() 
    {
        System.out.println("Inside display");
    }
}
class Rectangle extends Shape 
{
    public void area()
     {
        System.out.println("Inside area");
    }
}
class Cube extends Rectangle
 {
    public void volume() 
    {
        System.out.println("Inside volume");
    }
}
public class Tester 
{
    public static void main(String[] arguments)
     {
        Cube cube = new Cube();
        cube.display();
        cube.area();
        cube.volume();
    }
}

#Output
Inside display
Inside area
Inside volume
