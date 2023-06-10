package ineuron;

import java.util.HashSet;
import java.util.Set;

public class Candy {
	  public static int distributeCandies(int[] candyType) {
	        Set<Integer> s = new HashSet<>();
	        for (int c : candyType) {
	            s.add(c);
	        }
	        return Math.min(candyType.length /2, s.size());
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candyType= {1,1,2,2,3,3};
		int ans=distributeCandies(candyType);
		System.out.println(ans);
		

	}

}
