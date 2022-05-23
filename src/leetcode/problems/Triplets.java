package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {

	//https://www.youtube.com/watch?v=U_UBg8jenpE
	
	public static void main(String[] args) {
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		System.out.println("sum is " + Triplets.threeSum(arr));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (nums.length < 3)
			return res;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] > 0)
				break;
			if (i == 0 || (nums[i] != nums[i - 1]) ) {
				int lo = i + 1, hi = nums.length - 1, sum =- nums[i];
				while (lo < hi) {
					if (nums[lo] + nums[hi] == sum) {
						res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
						while (lo < hi && nums[lo] == nums[lo + 1])
							lo++;
						while (lo < hi && nums[hi] == nums[hi - 1])
							hi--;
						lo++;
						hi--;
					} else if (nums[lo] + nums[hi] < sum)
						lo++;
					else
						hi--;
				}
			}
		}
		return res;
	}

}
