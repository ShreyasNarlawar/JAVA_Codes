

public class Numbers03_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=args.length;i++) {
			boolean ans = isPrime(Integer.parseInt(args[i]));
			if(ans) {
				sum = sum + Integer.parseInt(args[i]);
			}
		}
	}

	public static boolean isPrime(int n) {
		for(int a =1;a<=n;a++) {
			
		}
		return false;
		
	}

}
