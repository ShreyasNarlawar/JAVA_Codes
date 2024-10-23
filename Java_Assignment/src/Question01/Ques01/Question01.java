package Question01.Ques01;

public class Question01 {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
				boolean ans = isPrime(Integer.parseInt(args[i]));
				if(ans) {
					System.out.println(args[i]+"=> Prime ");
				}
				else
					System.out.println(args[i]+"=>Not Prime ");
				
			}
		}
	 
		public static boolean isPrime(int n) {
			if (n <= 1) {
				System.out.println("Division is =>"+n/10);
				return false; 
			}
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					System.out.println("Division is =>"+n/10);
					return false;
				}					
				}
			for(int j=1;j<=10;j++) {
				System.out.println(n+" X "+j+" = "+n*j);						
				}
		return true;
		}
}
			