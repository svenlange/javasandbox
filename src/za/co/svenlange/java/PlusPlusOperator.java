package za.co.svenlange.java;

public class PlusPlusOperator {
	
	private int a = 1;

	public static void main(String[] args) {
		PlusPlusOperator b = new PlusPlusOperator();
		System.out.println(++b.a);
		System.out.println(b.a++);
	}
	
}