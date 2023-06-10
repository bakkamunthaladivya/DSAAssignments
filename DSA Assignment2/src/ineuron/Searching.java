package ineuron;

public class Searching {
	public static int search(int[] nums, int target) {
        int s= 0;
        int e= nums.length-1;
        while(s<=e){
            int mid = (e-s)/2 + s;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                e= mid-1;
            }
            else{
                s= mid+1;
            }
        }
        return -1;
        
    }

	public static void main(String[] args) {
		int[] nums= {-1,0,3,5,9,12};
		int target=9;
		int ans=search(nums,target);
		System.out.println(ans);

	}

}
