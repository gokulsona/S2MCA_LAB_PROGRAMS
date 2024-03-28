Aim : Java program to create array of employee object and display each employee id, name and salary 
//Algorithm
step 1 : start
step 2 : Define Employee Class:
step 3 : Define a class named Employee with attributes eNo, eSalary, and eName.
step 4 : Define a main class and Initialize Employee Array:
step 5 : Initialize an array of Employee objects named employees inside the main method.
step 6 : Specify the details of each employee directly within the array initialization (Employee ID, Name, Salary)
step 7 : Iterate over each employee in the employees array and print their details (ID, Name, Salary).
step 8 : stop


//Program
import java.util.Scanner;
class Employee
{
    int eNo, eSalary;
    String eName;
    public Employee (int no, int sal, String name)
    {
        eNo = no;
        eSalary = sal;
        eName = name;
    }
}
public class Main
{
    public static void main (String[] args)
    {
        System.out.println ("Enter number of employees : ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        // create array of objects
        Employee employees[] = new Employee[n];
        for (int i = 0; i < n; i++)
            {

                System.out.println ("Enter " + (i+1)+ " employee details ");
                System.out.println ("Enter employee id     : ");
                int eid = sc.nextInt ();
                System.out.println ("Enter employee name   : ");
                String nam = sc.next ();
                enam = new String (nam);
                System.out.println ("Enter employee salary : ");
                int esal = sc.nextInt ();
                Employee emp = new Employee (eid, esal, enam);
                employees[i] = emp;
            }
        System.out.println ("Employees are :\n");
        for (int i = 0; i < n; i++)
            {
		System.out.println("EmpId = " + employees[i].eNo + " " + "Name = "+employees[i].eName + " " + " Salary="+employees[i].eSalary ) ;
		System.out.println( );
            }
    }
}
//Output
Enter number of employees : 3
Enter 1 employee details 
Enter employee id    : 1
Enter employee name  : Sam
Enter employee salary: 15000

Enter 2 employee details 
Enter employee id     : 2
Enter employee name   : John
Enter employee salary : 14899

Enter 3 employee details 
Enter employee id     : 3
Enter employee name   : Steve
Enter employee salary : 17000

Employees are :
EmpId = 1 Name =Sam Salary=15000

EmpId = 2 Name =John Salary=14899

EmpId = 3 Name =Steve Salary=17000
