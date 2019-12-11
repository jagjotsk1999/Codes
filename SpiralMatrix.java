package Ds.Achievers;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("enter the elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int rowStart = 0, colStart = 0;
        printSpiral(matrix, rowStart, colStart, rows, cols);
    }
        static void printSpiral(int[][] matrix, int rowStart, int colStart, int rows, int cols){
        if (rowStart >= rows || colStart >= cols)
            return;

        for (int x = rowStart ; x < cols ; x++)

            System.out.print(matrix[rowStart][x]+" ");

        for (int x = rowStart + 1 ; x < rows ; x++)

            System.out.print(matrix[x][cols - 1]+" ");

        for (int x = cols - 2 ; x >= colStart ; x--)

            System.out.print(matrix[rows - 1][x]+" ");

        for (int x = rows - 2 ; x > rowStart ; x--)

            System.out.print(matrix[x][colStart]+" ");

        printSpiral(matrix, rowStart + 1, colStart + 1, rows - 1, cols - 1);
    }
}
