package ineuron;

public class range {

	public static int smallestRange(int[] nums,int k) {
		int max,min;
		max=min=nums[0];
		for(int i=0;i<nums.length;i++) {
			max=Math.max(max, nums[i]);
			min=Math.min(min, nums[i]);
		}
		int  diff=(max-k)-(min+k);
		if(diff>0)
			return diff;
		else
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1};
		int k=0;
		int ans=smallestRange(nums,k);
		System.out.println(ans);
		

	}

}
