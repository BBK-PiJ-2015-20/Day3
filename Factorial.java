public class Factorial 
{ 
	public static void main(String[] args) 
	{
        	//System.out.println("Enter the number for factorial");
		//int myInt = System.console().readLine();

		System.out.println("result is:"+factorial(5));
		
	}

	public void aMethod(){
	}

	public int factorial(int n) {
		if (n == 1){
		 	return 1;
		} else {
		 	 int fact = n * factorial(n-1);
			  return fact;			
		 	
		}
		System.out.println(factorial(n));
	}
}

