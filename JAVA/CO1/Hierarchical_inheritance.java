#Aim :Aim: Write a program has class Publisher, Book, Literature and Fiction. Read the information and print the details of books from either the category,
using inheritance.

#Algorithm
Step 1: Start
Step 2: Define the Publisher class with a constructor to initialize the publisher's name.
Step 3: Define the Book class with a constructor to initialize the book's name and publisher.
Step 4: Define the Literature and Fiction class that extends Book and includes a Littype attribute. Implement a display method to show the book details.
Step 5: In the main method of InheritanceBookExample, create instances of Publisher, Literature, and Fiction, and call their display methods.
Step 6: Stop

#Program
class Publisher
 {
    String publisher;
    Publisher(String publi) 
    {
        this.publisher = publi;
    }
}
class Book 
{
    String name;
    Publisher publisher;
    public Book(String name, Publisher publisher) 
    {
        this.name = name;
        this.publisher = publisher;
    }
}
class Literature extends Book {
    String Littype = " Literature ";
    Literature(String name, Publisher publisher) 
    {
        super(name, publisher);
    }
    void display() {
        System.out.println("Name:" + super.name);
        System.out.println("Type: " + this.Littype);
        System.out.println("Publisher: " + this.publisher.publisher);
    }
}
class Fiction extends Book {
    String Littype = "Fiction";
    Fiction(String name, Publisher publisher)
     {
        super(name, publisher);
    }
    void display() {
        System.out.println("Name:" + super.name);
        System.out.println("Type: " + this.Littype);
        System.out.println("Publisher:" + this.publisher.publisher);
    }
}
public class InheritanceBookExample 
{
    public static void main(String[] args) 
    {
        Publisher lp = new Publisher("S.Chand");
        Literature l = new Literature("As you like It", lp);
        l.display();
        Publisher fp = new Publisher("Tata McGraw Hill");
        Fiction f = new Fiction("Tempest", fp);
        f.display();
    }
}

#Output
Name	  : As you like It
Type	  : Literature 
Publisher : S.Chand
Name	  : Tempest
Type	  : Fiction
Publisher : Tata McGraw Hill
