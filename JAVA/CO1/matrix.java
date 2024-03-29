Aim : Java program to Add two matrix
//Algorithm
Step 1 : Start 
Step 2 : Define class and Ask the user to enter the number of rows and columns for the matrices
Step 3 : Ask the user to enter the elements of the first matrix and second matrix Store the elements in a 2D array.
Step 4 : Create a new 2D array to store the sum of the matrices, add  elements of the two matrices and store the result in the sum matrix
step 5 : Print the proper result
Step 6 : End
//Program
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
int m, n, i, j;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows andcolumns of matrix : ");
m = in.nextInt();
n = in.nextInt();
int first[][] = new int[m][n];
int second[][] = new int[m][n];
int sum[][] = new int[m][n];
System.out.println("Enter the elements of first matrix : ");
for (i = 0; i <m; i++)
for (j = 0; j < n; j++)
first[i][j] = in.nextInt();
System.out.println("Enter the elements of second matrix : ");
for (i = 0 ; i< m; i++)

for (j = 0 ; j < n; j++)
second[i][j] = in.nextInt();
for (i = 0; i<m; i++)
for (j = 0; j <n; j++)
sum[i][j] = first[i][j] + second[i][j]; 
System.out.println("Sum of the matrices: ");
for (i = 0; i< m; i++)
{
for (j = 0; j <n; j++)
System.out.print(sum[i][j] + "\t");
System.out.println();
}
}
}
//Output
Enter number of rows: 2
Enter number of columns: 2
Enter elements of first matrix:
1 2
3 4
Enter elements of second matrix:
5 6
7 8
Sum of the matrices:
6  8 
10 12 

