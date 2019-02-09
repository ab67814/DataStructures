package hackerRank.ds.array;

import java.util.Scanner;

public class MilitaryTimeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give Input");
		Scanner in = new Scanner(System.in);
		String time = in.nextLine();
		if (time.contains("PM")) {
			String[] splitvalue = time.replace("PM","").split(":");
			int split = Integer.parseInt(splitvalue[0]);
			split = split + 12;
			System.out.println(split+":"+splitvalue[1]+":"+splitvalue[2]);
		}
		in.close();

	}

}
