package Basics;

public class MoreAboutMethods {
	
	//static 
	//non static - dynamic
	
	public static  void staticDemo() {
		System.out.println("Im a static Method");
	}
	
	
	public void nonStaticDemo() {
		System.out.println(" Im a non static method ");
	}
	
	
	public static void  main(String args []) {
		
		//
		staticDemo();
		MoreAboutMethods.staticDemo();
		
		new MoreAboutMethods().nonStaticDemo();
	}
	
	

}
