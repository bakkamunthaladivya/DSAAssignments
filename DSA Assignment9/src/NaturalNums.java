
public class NaturalNums {
	static int sum(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return n+sum(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=sum(n);
		System.out.println(ans);

	}

}
