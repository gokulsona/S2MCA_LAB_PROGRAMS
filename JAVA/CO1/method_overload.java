#Aim : Area of different shapes using overloaded functions

#Algorithm
Step 1: Start
Step 2: Define the overload class with three overloaded area methods.
Step 3: In the main method, create an instance of the overload class and a Scanner object for user input.
Step 4: Prompt the user to enter the radius of a circle, ide of a square,length and breadth of a rectangle and read the input.
Step 5: Calculate and print the areas of the circle, square, and rectangle using the corresponding area methods.
Step 6: Stop

#Program
import java.util.*;
class overload 
{
    double area(double r) 
    {
        return 3.14 * (r * r);
    }
    double area(int a) 
    {
        return a * a;
    }
    double area(double l, double b) 
    {
        return l * b;
    }
    public static void main(String args[])
     {
        double r, l, b;
        int a;
        overload obj1 = new overload();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle:");
        r = sc.nextDouble();
        System.out.println("Enter the side of Square:");
        a = sc.nextInt();
        System.out.println("Enter the length of rectangle:");
        l = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle:");
        b = sc.nextDouble();
        System.out.println("Area of circle:" + obj1.area(r));
        System.out.println("Area of square:" + obj1.area(a));
        System.out.println("Area of rectangle:" + obj1.area(l, b));
    }
}

#Output
Enter the radius of circle    : 2
Enter the side of Square      : 2
Enter the length of rectangle : 3
Enter the breadth of rectangle: 4
Area of circle   : 12.56
Area of square   : 4.0
Area of rectangle: 12.0
