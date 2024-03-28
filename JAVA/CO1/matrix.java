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

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = inputMatrix(rows, columns, scanner, "first");
        int[][] matrix2 = inputMatrix(rows, columns, scanner, "second");

        int[][] sum = addMatrices(matrix1, matrix2);

        displayMatrix(sum);

        scanner.close();
    }

    // Method to input elements of a matrix
    public static int[][] inputMatrix(int rows, int columns, Scanner scanner, String name) {
        System.out.println("Enter elements of " + name + " matrix:");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        System.out.println("Sum of the matrices:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
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

