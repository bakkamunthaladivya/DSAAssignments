package ineuron;

public class UniqueOne {
	public static int singleOne(int[] nums) {
		 int ans=0; //since XOR with 0 returns same number
		 for(int i=0; i<nums.length; i++){
		 ans ^= nums[i]; // ans = (ans) XOR (array element at i)
		 }
		 return ans;
		 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {2,2,1};
		int ans=singleOne(nums);
		System.out.println(ans);
	}

}
