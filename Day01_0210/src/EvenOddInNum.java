import java.util.*;

class EvenOddInNum{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

	isEven(num);
}
    
    public static void isEven(int n){
	int temp = 0;
        int count = 0;
        int cnt = 0;
        while(n != 0){
           temp = n % 10;
            n = n / 10;

            if(temp % 2 == 0){
                count++;	
	    }
	    else
	       cnt++;
   	}

        System.out.println("Even numbers are :"+ count);
        System.out.println("Odd numbers are :"+ cnt);
    } 
}