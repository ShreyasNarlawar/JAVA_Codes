															
public class VariableArguments {
	public static int add(int x, int y, int ...arr) {
		int sum= x+y;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		//for each loop added in java 1.5
		// for(int n:arr) { //[10,20,30,40]
			
		// 	sum+=n;
		// }
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("sum of 2 numbers: "+add(10,20));
		System.out.println("sum of 3 numbers: "+add(10,20,45));
		System.out.println("sum of 5 numbers: "+add(10,20,1,2,3));
	}

}
