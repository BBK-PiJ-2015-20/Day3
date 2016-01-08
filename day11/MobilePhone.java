public class MobilePhone extends OldPhone{
	
	private int[] lastNumbers = new int[10];
	
	int counter = 0;
	
	public void call(String number){
		super.call(number);
		counter++;
		int num = Integer.parseInt(number);
		if(counter > lastNumbers.length)
		{
			for(int i = 0; i<lastNumbers.length-1;i++)
			{
				lastNumbers[i] = lastNumbers[i+1];
			}		
			lastNumbers[lastNumbers.length-1] = num;			
		}
		else
		{
			lastNumbers[counter-1] = num;
		}
		
	}		
	
	void ringAlarm(String s1){
		
	}
	
	void playGame(String s2){
		
	}
	
	void printLastNumbers(){
		System.out.println("#######################");
		for(int i = 0; i<lastNumbers.length;i++)
		{
			System.out.println(lastNumbers[i]);
		}				
	}
	
}