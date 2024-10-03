
public class VariableArgAdd {
	public static void main(String[] args) {
		
		System.out.println("Addition of Two Num :"+add(1,2));
		System.out.println("Addition of Four Num :"+add(5,7,4,2));
		System.out.println("Addition of Nine Num :"+add(4,8,7,5,1,4,4,2,3));
	}
	public static int add(int a , int b , int...arr) {
		int sum=0;
		sum=a+b;
		for(int i=0 ; i<arr.length;i++) {
			sum += arr[i];
		}
		
		return sum;
		
	}
}
