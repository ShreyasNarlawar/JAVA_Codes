
public class MethodOverLoad01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st : "+add(4,5));
		System.out.println("2nd : "+add(7,1,5));
		System.out.println("3rd : "+add(8,1,7,2));
		System.out.println("4th : "+add((byte)4,(byte)7,(byte)3));

	}


	private static int add(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		int sum=i+j+k+l;
		return sum;
	}

	private static long add(long i, long j, long k) {
		// TODO Auto-generated method stub
		long sum=i+j+k;
		return sum;
	}

	private static Integer add(Integer i, Integer j) {
		// TODO Auto-generated method stub
		int sum = i+j;
		return sum;
	}
	private static int add(byte a, byte b, byte c) {
		int sum = a + b + c;
			return sum;
		}
	

}
