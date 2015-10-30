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
		System.out.println(validity(str));
				
	}
	//check the input validity
		public Boolean validity(String str){
		 Boolean valid = false;
		 String str1 = str.substring(0, 1);
		  if (str1.equals("A"))
		  {
			String str2 = str.substring(1);
			int l = str2.length();
			int i;
			int j = 0;
			String str3;
			 if(l == 1){
				for(i=0; i<9; i++){
				 if (str2.substring(0, 1).equals("+i+"))
					
					valid = true;		 
				}
			}			
			else {
			 int t = 0;
			  for(i=0; i<l; i++){				
				j++;
				str3 = str2.substring(i, j);
				 if(str3.equals("0"))
				 t++;				  
			   if (t == l){
				valid = true;
				}
			 }
			}
		  
		}
		return valid;	
		}

	class Paper {
 double x;
 double y;
	
}

	
}

