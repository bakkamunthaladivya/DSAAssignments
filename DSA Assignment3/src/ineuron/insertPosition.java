package ineuron;

public class insertPosition {
	public static int searchInsert(int[] nums, int target) {
		 int start = 0;
		 int end = nums.length-1;
		 while (start <= end) {
		 int mid = start + (end-start)/2;
		 if (nums[mid] == target) return mid;
		 else if (nums[mid] > target) end = mid-1;
		 else start = mid+1;
		 }
		 return start;
		 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,5,6};
		int target=5;
		int ans=searchInsert(nums,target);
		System.out.println(ans);

	}

}
