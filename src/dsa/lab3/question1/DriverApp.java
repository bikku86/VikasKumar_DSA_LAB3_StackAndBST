package dsa.lab3.question1;

import java.util.Scanner;

public class DriverApp {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String expression containing Brackets");
		String inputString = scanner.next();

		BalancingBrackets brackets = new BalancingBrackets();


		if(brackets.StringChecker(inputString))
			System.out.println("The entered String expression has Balanced Brackets");
		else
			System.out.println("The entered String expression do not contain Balanced Brackets");


		scanner.close();

	}


}
