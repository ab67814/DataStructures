package hackerRank.ds.array;

import java.util.Scanner;

public class ArrayDs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Scanner rev = new Scanner(System.in);
		System.out.println("Please provide no of inputs");
		int nip =in.nextInt();
		in.close();
		int[] data = new int[nip];
		data[0] = 2;
		for (int i=0;i<nip;i++) {
			System.out.println("Please provide input for reversing");
			data[i] = rev.nextInt();
		}
		rev.close();
		for (int i=nip;i>0;i--) {
			System.out.println("the array value is"+data[i]);
		}
	}

}
