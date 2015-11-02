public class Myscript {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(1, 2));
		String str = System.console().readLine();
		int n = Integer.parseInt(str);
		double d = Double.parseDouble(str);
	}
}