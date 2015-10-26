public class Factorial 
{ 
	public static void main(String[] args) 
	{
        	Factorial factorial = new Factorial();
		factorial.launch();
	}

	private void launch() {
		//System.out.println("Enter the number for factorial");
		//int myInt = System.console().readLine();
		System.out.println("result is:"+factorial(5));
		System.out.println(factorial(5));
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
	}
}

