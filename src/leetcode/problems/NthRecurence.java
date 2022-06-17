package leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class NthRecurence {

	public static void main(String[] args) {
		System.out.println(nthOccurence(1,"Hello World"));
	}
	
	private static char nthOccurence(int k, String source) {
		//if(source==null || source.isEmpty()) return '';
		Map<Character,Integer> hashmap= new HashMap<>();
		Integer count = 0;
		char temp = source.charAt(0);
		int tempCount =1;
		char[] sourceArr = source.toCharArray();
		for (char ch : sourceArr) { 
			count = hashmap.get(ch); 
			if (count == null) { 
				hashmap.put(ch, 1); } 
			else { 
				hashmap.put(ch, ++count);
			} 
			
			if(count!=null && count==2) {
				if( tempCount==k) {
					return ch;
				}
				tempCount++;
			}
			
		}
		return temp;
		
		
	}

}
