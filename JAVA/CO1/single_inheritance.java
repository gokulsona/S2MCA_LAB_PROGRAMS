#Aim : Write a Java Program for Single level Inheritance

#Algorithm
Step 1: Start
Step 2: Define the Employee class with a salary attribute (sal).
Step 3: Define the sing_inherit class that extends the Employee class and includes a bonus attribute (bonus).
Step 4: In the main method, create an instance of the sing_inherit class.
Step 5: Print the salary,bonu attribute inherited from the Employee and sing_inherit class.
Step 6: Stop

#Program
class Employee 
{
    float sal = 40000;
}
class sing_inherit extends Employee 
{
    int bonus = 10000;
    public static void main(String args[]) 
    {
        sing_inherit p = new sing_inherit();
        System.out.println("Salary  : " + p.sal);
        System.out.println("Bonus   : " + p.bonus);
    }
}

#Output
Salary : 40000.0
Bonus : 10000
