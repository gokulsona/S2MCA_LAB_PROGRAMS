Aim : Java Program to Add two Complex Numbers.
//Algorithm
Step 1 :Start
Step 2 :Define a class named complex
Step 3 :Define a constructor within the complex class to initialize the real and imaginary parts of a complex number.
Step 4 :Define a method display within the complex class to display the complex number in the format real + imagi.
Step 5 :Define a method add within the complex class to add two complex numbers and return the result as a new complex number.
Step 6 :Create instances of complex numbers (c1 and c2) using the defined constructor.
Step 7 :Invoke the add method on one of the complex numbers (c1) passing the other complex number (c2) as an argument.
Step 8 :Display the result of the addition operation.
step 9 :Stop

//Program
import java.util.*;

class complex
{
	int real,imag;	
	public complex(int real, int imag)
	 {
		this.real = real;
		this.imag = imag;
	 }
	 void display()
	 {
	 	System.out.println(real+" + "+imag+"i");
	 }
	
	public complex add(complex c1, complex c2)
	 {
		complex res =  new complex(0,0);
		int a = c1.real + c2.real;
		int b = c1.imag + c2.imag;
		System.out.println("Result : "+a + " + " +b+"i");		
		return res;
	 }
	 

	public static void main(String args[])
	{
		complex c1 = new complex(3,4);
		System.out.print("First Complex Number : ");
		c1.display();
		complex c2 = new complex(1,3);
		System.out.print("Second Complex Number : ");
		c2.display();
		complex c3 = new complex(0,0);
		c3.add(c1, c2);
	}
}

//Output
First Complex Number  : 3 + 4i
Second Complex Number : 1 + 3i
Result : 4 + 7i

