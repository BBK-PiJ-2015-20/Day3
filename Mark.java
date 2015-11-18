public class Mark{
	
	private static int dist = 0;
	private static int pass = 0;
	private static int fail = 0;
	private static  int inv = 0;
	public int mark;
	
	public Mark(int mark){
		this.mark = mark;
		this.checkMark(mark);
	}
	
	public void checkMark(int mm){
		
	}
	
	public static void main (String[] args){
		
		int mm;
	do{
		Mark m = new Mark(Integer.parseInt(System.console().readLine()));
		mm = m.mark;
		checkMark(mm);
		
	}
	while( mm != -1);
	/** test push
	**/
	
	
	
	}
}