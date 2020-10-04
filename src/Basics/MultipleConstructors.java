package Basics;

public class MultipleConstructors {
	
	

	
	public MultipleConstructors(int a) {
		System.out.println("I am a integer constructor");
	}
	
	public MultipleConstructors(double a) {
		System.out.println("I am a double constructor");
	}

	public MultipleConstructors(String a) {
		System.out.println("I am a string constructor");
	}
	
	public static void main(String[] args) {
		MultipleConstructors con = new MultipleConstructors(0);
		MultipleConstructors conn = new MultipleConstructors(88.88);
	}

}
