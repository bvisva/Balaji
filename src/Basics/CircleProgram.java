package Basics;

public class CircleProgram {

	public static void main(String args[]) {
		
		 //double area = 3.14*6*6;
		//1st way 
		areaCalculate(8);
		double value=55;
		//2nd way 
		areaCalculate(value);
		
		//with help of another method 
		areaCalculate(returnDoubleValue());
		
		
		
		

	}
	
	
	public static void areaCalculate(double radius) {
		double area = 3.14*radius*radius;
		System.out.println(area);
	}
	
	public static double returnDoubleValue() {
		return 333.33;
		
	}

}
