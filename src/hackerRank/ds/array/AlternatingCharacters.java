package hackerRank.ds.array;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of test cases");
		Scanner in = new Scanner(System.in);
		String testCasesCount = in.nextLine();
		for (int i=0;i<Integer.parseInt(testCasesCount);i++) {
			String inpstrings = in.nextLine();
			int countstodelete = 0;
			for (int j=0;j<inpstrings.length();j++) {
				if(j+1<inpstrings.length() && inpstrings.charAt(j)==inpstrings.charAt(j+1)) {
					countstodelete ++;
				}
			}
			System.out.println(countstodelete);
		}
		in.close();

	}

}
