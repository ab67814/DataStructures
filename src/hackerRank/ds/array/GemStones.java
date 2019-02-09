package hackerRank.ds.array;

import java.util.Scanner;

public class GemStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of rocks");
		Scanner in = new Scanner(System.in);
		String rockscount = in.nextLine();
		String[] rock = new String[Integer.parseInt(rockscount)];
		for (int i=0;i<Integer.parseInt(rockscount);i++) {
			 rock[i] = in.nextLine();
		}
		int gemcount=0;
		String rocks = rock[0];
			for (int l =0; l<rocks.length();l++) {
				int count = 0;
				for (int k = 1 ; k<Integer.parseInt(rockscount);k++){
					if (rock[k].contains(String.valueOf(rocks.charAt(l)))){
						count ++;
						if (count == (Integer.parseInt(rockscount)-1)) {
							gemcount ++;
							count =0;
						}
					}
				}
			}
			
		System.out.println(gemcount);
		in.close();

	}

}
