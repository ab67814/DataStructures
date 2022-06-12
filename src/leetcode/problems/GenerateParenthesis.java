package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(2));
	}
	
	 public static List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<String>();
	        backtrack(list, "", 0, 0, n);
	        return list;
	 }
	 
	 public static void backtrack(List<String> list, String str, int open, int close, int max){
	        
		 	//base case
	        if(str.length() == max*2){
	            list.add(str);
	            return;
	        }
	        
	        if(max > open )
	            backtrack(list, str+"(", open+1, close, max);
	        if(open > close)
	            backtrack(list, str+")", open, close+1, max);
	    }

}
