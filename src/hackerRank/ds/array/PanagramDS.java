package hackerRank.ds.array;

import java.util.Scanner;

public class PanagramDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string/Sentence");
		Scanner in = new Scanner(System.in);
		String isPanagram = in.nextLine();
		in.close();
		int i =97;
		while (i!=122) {
			char c = (char)i;
			if (isPanagram.toLowerCase().contains(String.valueOf(c))){
				i++;
			}else{
				break;
			}
			
		}
		if(i==122){
			System.out.println("pangram");
		}else {
			System.out.println("not pangram");
		}

	}

}
