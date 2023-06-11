package ineuron;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quadruplets {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		 int n=nums.length;
		 Arrays.sort(nums);
		 List<List<Integer>> ans=new ArrayList<>();
		 if(n==0||n<3){
		 return ans;
		 }

		 for(int i=0;i<n;i++){
		 for(int j=i+1;j<n;j++){
		 int low=j+1;
		 int high=n-1;
		 int sum=target-nums[i]-nums[j];
		 while(low<high){
		 if(nums[low]+nums[high]==sum){
		 List<Integer> temp=new ArrayList<>();
		temp.add(nums[i]);
		temp.add(nums[j]);
		temp.add(nums[low]);
		temp.add(nums[high]);
		ans.add(temp);
		 while(low<high&&nums[low]==nums[low+1]){
		 low++;
		 }
		while(low<high&&nums[high]==nums[high-1]){
		 high--;
		 }
		low++;
		high--;
		 }
		else if(nums[low]+nums[high]<sum){
		 low++;
		 }
		else{
		 high--;
		 }
		 }
		 while(j+1<n&&nums[j+1]==nums[j]){
		 j++;
		 }
		 }
		 while(i+1<n&&nums[i+1]==nums[i]){
		 i++;
		 }
		 }
		 return ans;
		 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,0,-1,0,-2,2};
		int target=0;
		List ans=fourSum(nums,target);
		System.out.println(ans);
		

	}

}
