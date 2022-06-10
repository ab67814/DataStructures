package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum {

	public static void main(String[] args) {
		//fourSum(arr,target can be 1 to k)
	}
	 public static List<List<Integer>> fourSum(int[] nums, int target) {
	        Arrays.sort(nums);
	        return kSumHelper(nums, target, 4, 0);
	    }
	    
	    public static List<List<Integer>> kSumHelper(int[] nums, int target, int k, int si) {
	        int n = nums.length;
	        
	        if(k==2) {
	            return twoSum(nums,target,si);
	        }
	        List<List<Integer>> res = new ArrayList<>();
	        
	        if(n-si < 0) return res;
	            
	        for(int i= si; i<= n-k; i++) {
	            if(i!=si && nums[i]==nums[i-1]) continue;
	            int val = nums[i];
	            List<List<Integer>> subRes = kSumHelper(nums, target - val, k-1, i+1);
	            for(List<Integer> list: subRes) {
	                list.add(val);
	                res.add(list);
	            }
	        }   
	        return res;

	    }
	    
	     public static List<List<Integer>> twoSum(int[] nums, int target, int si){
	         int n = nums.length;
	         List<List<Integer>> res = new ArrayList<>();

	         if(n-si < 2) return res;
	         
	         int left = si;
	         int right = n-1;
	         
	         while(left < right) {
	             if(left != si && nums[left]==nums[left-1]) {
	                 left++;
	                 continue;
	             }
	             int sum = nums[left] + nums[right];
	             if(sum==target) {
	                 List<Integer> subRes = new ArrayList<>();
	                 subRes.add(nums[left]);
	                 subRes.add(nums[right]);
	                 res.add(subRes);
	                 left ++;
	                 right --;
	             } else if(sum > target) {
	                 right--;
	             } else {
	                 left++;
	             }
	         }
	         
	         return res;
	     }
}
