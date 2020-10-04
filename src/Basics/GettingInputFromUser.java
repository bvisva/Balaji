package Basics;

import java.util.Scanner;

public class GettingInputFromUser {
	
	public static void main(String[] args) {
		//Scanner
		System.out.println("Pls enter the value for a");
		Scanner scan = new Scanner(System.in);
		int a;
		a=scan.nextInt();
		System.out.println("The User input "+a);
	}

}
