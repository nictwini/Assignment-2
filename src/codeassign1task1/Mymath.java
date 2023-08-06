package codeassign1task1;

public class Mymath {
	public  void Add(int a, int b) {
		System.out.println(a + b);
	}
	public void Subtract(int a, int b) {
		System.out.println(a - b);
	}
	public void Multiply(int a, int b) {
		System.out.println(a * b);
	}
	// division
	public void Divide(int a, int b) {
		System.out.println(a / b);
	}
	public void Quadratic(int a, int b, int c) {
		System.out.println("x = " + (-1 * b) + Math.sqrt((b * b) - (4 * a * c) ) / (2 * a)
				+ ", " + ((-1 * b) - Math.sqrt((b * b) - (4 * a * c) ) / (2 * a)));
	}
	public void Hypotenus(int a, int b) {
		System.out.println("The hypotenus is " + Math.sqrt((a * a)+(b * b)));	
	
	}
	public void Temp(int a, int b) {
		b = (a - 32) * 5 / 9;
		System.out.println("Celsius = " + b);
	}
	public void Squareroot(int a) {
		System.out.println("The square root of " + a + " is: " + Math.sqrt(a));
	}
}
