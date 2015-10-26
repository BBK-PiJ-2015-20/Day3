public class Hanoi 
{ 
	public static void main(String[] args) 
	{
        	Hanoi hanoi = new Hanoi();
		hanoi.launch();
	}

	private void launch() {
		//System.out.println("Enter the number discs");
		int myInt = System.console().readLine();
		System.out.println("result is:"+hanoi(myInt));
		
	}

	public void aMethod(){
	}

	public int hanoi(int n) {
		if (n < 0){
		 	return 0;
		} else {
		 	 int han =  ;
			  return han;					 	
		}
	}
}

