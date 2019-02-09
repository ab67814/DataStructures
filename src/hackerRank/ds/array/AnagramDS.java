package hackerRank.ds.array;

import java.util.Scanner;

public class AnagramDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please give input as String");
		Scanner in = new Scanner(System.in);

		String firstString = in.nextLine();
		String secondString = in.nextLine();
		in.close();
		
		StringBuffer firstStringB = new StringBuffer(firstString.replaceAll("\\s", "").toLowerCase());
		StringBuffer secondStringB = new StringBuffer(secondString.replaceAll("\\s", "").toLowerCase());
		
		for (int i = 0;i<firstStringB.length();i++) {
			for (int j = 0;j<secondStringB.length();j++) {
				if (firstStringB.charAt(i) == secondStringB.charAt(j)) {
					firstStringB = firstStringB.deleteCharAt(i);
					secondStringB = secondStringB.deleteCharAt(j);
				}
			}
		}
		
		System.out.println((firstStringB.length() + secondStringB.length()));
		
	}

}
