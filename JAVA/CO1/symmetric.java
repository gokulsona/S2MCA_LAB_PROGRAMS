Aim :  To read a matrix from the console and check whether it is symmetric or not.
//Algorithm
step 1 : start
step 2 : Read Rows and Columns from user as input and initialize a two dimensional matrix 
step 3 : Ask the user to Enter each Element of the matrix
step 4 : if Rows not equal to Columns print Not Symmetric
step 5 : else Compute the transpose of the matrix by swapping rows and columns.
step 6 : if all elements match, output "matrix is symmetric"; otherwise, output "matrix is not symmetric".
step 7 : stop

//Program
import java.util.*;
class symmetric
{
	Scanner sc = new Scanner(System.in);
	int row, col;
	//constructor
	public symmetric(int[][]m,int row, int col)
	{
		this.row = row;
		this.col = col;
		for(int i=0; i<row; i++)
		 {
		 	for(int j=0; j<col; j++)
		 	 {
		 	 	m[i][j] = sc.nextInt();
		 	 }
		 }
		 boolean symmetric = true;
		 if(row!=col)
		  {
		   	System.out.println("Matrix is not Symmetric");
		  }
		  else
		  {
			for(int i=0; i<row; i++)
		 	 {
		 		for(int j=0; j<col; j++)
		 	 	 {
		 	 	 	if(m[i][j] != m[j][i])
		 	 	 	 {
		 	 			symmetric = false;		 	 	 	 
		 	 		 }
		 	 	 }
		 	 }
		   
		  	if(symmetric)
		   	 {
		   		System.out.println("Matrix is Symmetric");
		  	 }
		       else
		   	 {
		   		System.out.println("Matrix is not Symmetric");		   
		  	 }
		   }
	}
	//display function
	public static void main(String args[])
	 {
 		Scanner sc = new Scanner(System.in);
	 	//read matrix row and col
	 	System.out.print("Enter Rows : ");
	 	int row = sc.nextInt();
	 	System.out.print("Enter Cols   : ");
	 	int col = sc.nextInt();
	 	
	 	//declare matrix
	 	int[][] matrix = new int[row][col];
	 	System.out.println("\nEnter Matrix Elements");
	 	symmetric m = new symmetric(matrix, row, col);//constructor object
	 }
}

//Output
Enter Rows   : 3
Enter Cols   : 3

Enter Matrix Elements
1 2 3
2 4 5
3 5 6
Matrix is Symmetric

