package hackerRank.ds.array;

import java.util.Scanner;

public class StaircaseDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please provide no of inputs");
		int nip =in.nextInt();
		int k = nip;
		for (int i=0;i<nip;i++) {
			for (int m=0;m<nip;m++) {
				if (m==(k-1)){
					for (int j=0;j<=i;j++) {
						System.out.print("#");
					}
				}else {
					System.out.print(" ");
				}
			}
			k--;
			System.out.println("");
		}
        in.close();
	}

}
