
public class factorialOfN {
	static int factorial(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=factorial(n);
		System.out.println(ans);

	}

}
