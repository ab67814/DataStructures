package hackerRank.ds.array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give Input for search");
		Scanner in = new Scanner(System.in);
		int searchNO = in.nextInt();
		int inpNo = in.nextInt();
		int searchArray[] = new int[inpNo];
		for (int j=0;j<inpNo;j++) {
			searchArray[j] = in.nextInt();
		}
		for (int i=0;i<inpNo;i++) {
			if (searchArray[i]== searchNO) {
				System.out.println(i);
			}
		}
		in.close();

	}

}
