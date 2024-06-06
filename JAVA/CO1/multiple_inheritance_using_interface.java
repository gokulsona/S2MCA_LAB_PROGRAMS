#Aim :Create classes Student and Sports. Create another class Result inherited from Student and Sports. Display the academic and sports score of a student.(Multiple inheritance using interface)

#Algorithm
Step 1: Start
Step 2: Define the  interface Student and Sports with a constant score and an abstract method display_score, display_sports.
Step 3: Create a class result that implements both Student and Sports interfaces.
Step 4: In the result class, implement the display_score,display_sports method to print the academic score and sports score.
Step 5: Print Proper result
Step 6: Stop

#Program
interface Student 
{
    int score = 10;
    void display_score();
}
interface Sports 
{
    int score = 20;
    void display_sports();
}
class result implements Student, Sports 
{
    public void display_score() 
    {
        System.out.println("Academic Score : " + Student.score);
    }
    public void display_sports() 
    {
        System.out.println("Sports Score : " + Sports.score);
    }
}
public class interface_academics 
{
    public static void main(String args[]) 
    {
        result obj = new result();
        obj.display_score();
        obj.display_sports();
    }
}


#Output
Academic Score : 10
Sports Score   : 20
