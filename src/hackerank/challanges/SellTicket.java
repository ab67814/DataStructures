package hackerank.challanges;

import java.util.Scanner;

public class SellTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long a[] = new long[(int) n];
		for(int j= 0;j<n;j++)  {
			a[j]= sc.nextLong();
		}
		
		long total = 0;
		long lastval = a[a.length-1];
		for (long i=0;i<m;i++) {
			total = total + lastval;
			lastval--;
		}
		System.out.println(+total);
		sc.close();
	}

}
