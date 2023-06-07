package ineuron;

import java.util.Arrays;

public class ArrayPartition {

	
	  
	  public static int pairs(int[] nums) {
		  int result=0;
	  Arrays.sort(nums);
	  for(int i=0;i<nums.length;i+=2) { result+=nums[i];
	  
	  } return result;
	  
	  }
	  
	  public static void main(String[] args) {
	  
	  int[] nums= {1,4,2,3};
	  
	  int result=pairs(nums); 
	  System.out.println(result);
	  
	  
	  }
	 

}
