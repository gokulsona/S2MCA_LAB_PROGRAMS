Aim : Java program to search an Element in an Array
//Algorithm
step 1 : start 
step 2 : Define Class and Create an integer array with a specified size.
step 3 : Ask the user to Enter elements into array
step 4 : Display each element of the array using display function
step 5 : Ask the user to input the element to search
step 6 : Check if each element in array  matches the element to search.
	 If a match is found, set a flag indicating the element is found and break out of the loop.

step 7 : If the flag is set, Element is found else not
step 8 : print proper result
step 9 : stop
//Program
import java.util.*;
//Sort Array using constructor
class SearchArray
{
	int size;
	//empty constructor
	public SearchArray()
	 {
	 }

	//constructor
	public SearchArray(int[] arr,int size)
	 {
		SearchArray dis = new SearchArray();
		Scanner sc = new Scanner(System.in);
		this.size = size;
		for(int i=0; i<size; i++)
		 {
			arr[i] = sc.nextInt();
		 }
		dis.display(arr, size);
	 }
	

	//search
	void search(int[] arr, int size)
	 {
		Scanner sc = new Scanner(System.in);
		SearchArray ds = new SearchArray();
		System.out.println("\nEnter Element to Search : ");
		int element = sc.nextInt();
		int flag=0;
		for(int i=0; i<size; i++)	
		 {
				if( arr[i] == element)
				 {
					flag=1;
					break;
				 }
		 }
		if(flag == 1)
		 {
			System.out.printf("Element %d found",element);
		 }
		else
		 {
			System.out.printf("Element %d not found",element);
		 }

	 }
	 
	//display
	void display(int[] arr, int size)
	 {
		SearchArray s = new SearchArray();
		System.out.println("Array Elements are :");
		for(int i=0; i<size; i++)
		 {
			System.out.print(arr[i]+"\t");
		 }
		s.search(arr,size);
	 }
	//main function
	public static void main(String args[])
	 {
		Scanner sc = new Scanner(System.in);
		//size of array
		System.out.print("Enter Size of Array : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		SearchArray arr = new SearchArray(array, size);
	 }
}
//Output
Enter Size of Array : 5
10
20
30
40
50
Array Elements are : 10	20	30	40	50	
Enter Element to Search : 30
Element 30 found
