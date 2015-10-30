import java.io.*;
public class PaperSize 
{ 
	public static void main(String[] args) 
	{
        	PaperSize paperSize = new PaperSize();
		paperSize.launch();
	}
	

	private void launch() {
		
		double  x0 = 841;
		double y0 = 1189;
		Paper paper = new Paper();
		paper.x = x0;
		paper.y = y0;
		
		System.out.println("Enter the the paper size to calculate dimensions");
		String str = System.console().readLine();
		//System.out.println("initial dimesnions are: x"+paper.x+" and "+paper.y);
		
		//check the input validity
		String str1 = str.substring(0, 1);
		//System.out.println(str1);
		if (str1.equals("A")){
			System.out.println("valid");
		}
			
		
		
		
		
		
	}

	class Paper {
 double x;
 double y;
	
}

	
}

