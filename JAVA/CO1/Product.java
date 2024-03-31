Aim: Define a class ‘product’ with data members pcode, pname and price.Create 3 objects of the class and find the product having the lowest price.

//Algorithm
Step 1: Start
Step 2: Define the Product class with attributes pname, pcode, and price.
Step 3: Implement a default constructor and a parameterized constructor in the class.
Step 4: Define a method display() within the class to display product details.
Step 5: In the main method, create instances of Product using both constructors.
Step 6: Compare prices of products to find the one with the lowest price.
Step 7: Stop 
//Program
public class Product 
{
  String pname, pcode;
  int price;
  // default constructor
 public Product() {}
  // p a r am e t e r i s e d c o n s t r u c t o r
 public Product(String pname, String pcode, int price) {
    this.pname = pname;
    this.pcode = pcode;
    this.price = price;
  }
 public void display() {
    System.out.println("pcode : " + this.pcode);
    System.out.println("pname : " + this.pname);
    System.out.println("price:  " + this.price);
  }
public static void main(String[] args) {
    // Creating object using no parameters constructor

    Product p1 = new Product();
    p1.pcode = "Car123";
    p1.pname = "Benz";
    p1.price = 10000;
    
    System.out.println("\n\n******** Displaying p1******** ");
    p1.display();
    // Us ing p a r am e t e r i s e d c o n s t r u c t o r s
    Product1p2 = new Product("Jaguar", "Car426", 25000);
    System.out.println("\n******** Displaying p2********");
    p2.display();
    Product p3 = new Product("Maruthi", "Car800", 50000);
    System.out.println("\n******** Displaying p3******** ");
    p3.display();
    Product p = p3.price < (p1.price < p2.price ? p1.price : p2.price)?
    p3: (p1.price < p2.price ? p1 : p2);
    
    System.out.println("\n******** Displaying product with lowest price *******");
    p.display();
  }
}

//output
******** Displaying p1******** 
pcode : Car123
pname : Benz
price:  10000

******** Displaying p2********
pcode : Car426
pname : Jaguar
price:  25000

******** Displaying p3******** 
pcode : Car800
pname : Maruthi
price:  50000

******** Displaying product with lowest price *******
pcode : Car123
pname : Benz
price:  10000


