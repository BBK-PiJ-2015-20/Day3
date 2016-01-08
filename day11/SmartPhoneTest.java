public class SmartPhoneTest{
	public static void main (String[] args){
			MobilePhone myPhone = new SmartPhone();
			myPhone.call("123");
			myPhone.ringAlarm("Birds");
			myPhone.playGame("Chess");
			testPhone(myPhone);
	}
	
	public static void testPhone(Phone p){
		p.call("123");
	}
}