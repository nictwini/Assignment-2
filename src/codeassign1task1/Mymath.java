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
		System.out.println((-1 * b) + Math.sqrt((b * b) - (4 * a * c) ) / (2 * a));
		
		//x = -b +/- square root of b squared - 4ac/ 2a
	}
}
