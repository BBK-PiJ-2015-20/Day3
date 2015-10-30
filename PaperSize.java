public class PaperSize 
{ 
	public static void main(String[] args) 
	{
        	PaperSize paperSize = new PaperSize();
		paperSize.launch();
	}
	

	private void launch() {
		
		Paper paper = new Paper();
		double  x0 = 841;
		double y0 = 1189;
		
		System.out.println("Enter the the paper size to calculate dimensions");
		String str = System.console().readLine();
		
		
		
	}

	class Paper {
 double x;
 double y;
	
}

	
}

