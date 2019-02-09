package hackerRank.ds.array;

import java.util.Scanner;

public class DiagonalDifferenceDS {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of matrix");
		Scanner in = new Scanner(System.in);
		int matrixSize = in.nextInt();
		int matrix[][]=new int[matrixSize][matrixSize];
		for (int i=0;i<matrixSize;i++) {
			for (int j=0;j<matrixSize;j++) {
				matrix[i][j]= in.nextInt();
			}
		}
		in.close();
		int lefttotal=0;
		int righttotal=0;
		// Left Diagonal Total 
		for (int k=0;k<matrixSize;k++) {
			for (int l=0;l<matrixSize;l++) {
				if (k==l) {
					lefttotal = lefttotal + matrix[k][l];
				}
			}
		}
		// Right Diagonal Total
		for (int m=0;m<=matrixSize;m++) {
			for (int n=matrixSize-1;n>=0;n--) {
				if (m==((matrixSize-1)-n)) {
					righttotal = righttotal + matrix[m][n];
				}
			}
		}
		//Diagonal Difference 
		System.out.println("Diagonal Difference = "+Math.abs(lefttotal-righttotal));

	}
	
}
