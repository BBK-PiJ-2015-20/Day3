public class Hello 
{ 
	public static void main(String[] args) 
	{
        	//System.out.println("Hello world!");
		for(int i=0; i<5; i++)
		{
			String myStr = System.console().readLine();
			System.out.println("Hello " + myStr);
		}
	}
}

