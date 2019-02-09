package hackerRank.ds.array;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of test case");
		Scanner in = new Scanner(System.in);
		String testcaseno = in.nextLine();
		for (int i=0;i<Integer.parseInt(testcaseno);i++) {
			System.out.println("Enter the String to find common char");
			StringBuilder stringone = new StringBuilder(in.nextLine());
			StringBuilder stringtwo = new StringBuilder(in.nextLine());
			int stringflag = 0;
			for (int j=0;j<stringone.length();j++) {
				if(stringtwo.toString().contains(String.valueOf(stringone.charAt(j)))){
					System.out.println("YES");
					stringflag++;
					break;
				}
			}
			if(stringflag==0){
				System.out.println("NO");
			}
		}
		in.close();
	}

}
