//write a program to accept numbers through commandline 
//arguments, add only prime numbers
class AddNumbers3{
	//check whether number is prime
   public static boolean isPrime(int n){
      for(int i=2;i<n;i++){
	     if(n%i==0){
		    return false;
		 }
	  }
	  return true;
   }
   
   public static void main(String[] args){
      int sum=0;
	  for(int i=0;i<arr.length;i++){
	   ///check whether the number is prime or not
	     boolean ans=isPrime(Integer.parseInt(args[i]));
		 if(ans){ 
			sum=sum+Integer.parseInt(args[i]); ///ans==true
		 }
	        
	  }
	  System.out.println("Sum:" +sum);
   }
}
