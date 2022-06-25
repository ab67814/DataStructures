package leetcode.problems;

public class SearchInsertPos {

	public static void main(String[] args) {
		int a[] = {1,3,5,6};
		searchInsert(a,2);
	}

    public static int searchInsert(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
