
public class PowerOfTwo {
	static boolean power(int n) {
		if(n<=0) {
			return false;
		}
		if(n==1)
			return true;
		if(n%2==0)
			return power(n/2);
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=64;
		boolean ans=power(n);
		System.out.println(ans);
		

	}

}
