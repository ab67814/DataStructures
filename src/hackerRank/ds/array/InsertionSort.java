package hackerRank.ds.array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of Array");
		Scanner in = new Scanner(System.in);
		int arraySize = in.nextInt();
		int[] arrayElement = new int[arraySize];
		System.out.println("Enter the sequence");
		for (int i=0;i<arraySize;i++) {
			arrayElement[i] = in.nextInt();
		}
		int arrayElement1[] = Arrays.copyOf(arrayElement, arrayElement.length);
		for (int j=arraySize-1;j>0;j--) {
			if (arrayElement[j]<arrayElement[j-1]){
				int element = arrayElement[j-1];
				arrayElement[j-1]= arrayElement[j];
				arrayElement[j] = element;
				arrayElement1[j] = arrayElement1[j-1];
				for (int k=0;k<arraySize;k++) {
					System.out.print(arrayElement1[k]+" ");
				}
				System.out.println();
			}else {
				for (int l=0;l<arraySize;l++) {
					System.out.print(arrayElement[l]+" ");
				}
				System.out.println();
			}
		}
		in.close();
	}

}
