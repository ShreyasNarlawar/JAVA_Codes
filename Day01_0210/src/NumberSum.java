class NumberSum{

	public static void main(String[] args){

	if(args.length == 0){
	    System.out.println("No Input is given");
	  } else{
	      int sum = 0;
	      for(int i = 0; i < args.length; i++){
	      sum = sum +Integer.parseInt(args[i]);
	      }
 	   System.out.println("The sum is :"+sum);
	}
        
    }
}