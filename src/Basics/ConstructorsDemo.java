package Basics;

public class ConstructorsDemo {
	
	
	///same name as classs name
	//it wont have return type 
	//how to call
	public ConstructorsDemo() {
		System.out.println("Im a constructor");
	}
	
	public void nonstaticDemo() {
		System.out.println("I am a non static");
	}
	
	public static void main(String[] args) {
		ConstructorsDemo con = new ConstructorsDemo();
		con.nonstaticDemo();
		
		new ConstructorsDemo().nonstaticDemo();
	} 

}
