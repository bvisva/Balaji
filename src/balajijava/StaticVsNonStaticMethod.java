package balajijava;

public class StaticVsNonStaticMethod {
	
	public static void testStaticMethod() {
		System.out.println("I am from testStaticMethod - Static Method");
	}
	
	public void testNonStaticMethod() {
		System.out.println("I am from testNonStaticMethod - Non Static Method");
	}
	
	public static void main(String args[]) {
		testStaticMethod();
		new StaticVsNonStaticMethod().testNonStaticMethod();
	}

}
