public class SmartPhone extends MobilePhone{
	void browseWeb(String s3){
	}
	
	public void call(String number){
		if(number.substring(0,2).equals("00") ){
			System.out.println("calling " + number + " through internet to save money");
		}
		else {
			super.call(number);
		}
	}
	
}