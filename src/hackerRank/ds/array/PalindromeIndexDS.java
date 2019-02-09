package hackerRank.ds.array;

import java.util.Scanner;

public class PalindromeIndexDS {
	
	static boolean  isPalindrome(String s) {
		  int n = s.length();
		  for (int i=0;i<(n / 2) + 1;++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no of test cases");
		Scanner in = new Scanner(System.in);
		String testcaseno = in.nextLine();
		for (int i=0;i<Integer.parseInt(testcaseno);i++) {
			String strng = in.nextLine();
			if(isPalindrome(strng)) {
				System.out.println("-1");
			}else{
				for (int j=0;j<strng.length();j++) {
					StringBuffer palndrome = new StringBuffer(strng);
					if (isPalindrome(palndrome.deleteCharAt(j).toString())){
						System.out.println(j);
						break;
					}
				}
			}
		}
		in.close();

	}

}
