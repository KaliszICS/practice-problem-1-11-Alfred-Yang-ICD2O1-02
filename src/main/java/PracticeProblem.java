import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		double num;
		System.out.print("Input a number: ");
		num = input.nextDouble();
		input.nextLine();
		System.out.println(Math.abs(num));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		System.out.print("Input a number: ");
		num1 = input.nextDouble();
		input.nextLine();
		System.out.print("Input another number: ");
		num2 = input.nextDouble();
		input.nextLine();
		System.out.println(Math.floor(num1/num2));
		System.out.println(Math.ceil(num1/num2));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		double squares;
		System.out.print("Input a number: ");
		squares = input.nextDouble();
		input.nextLine();
		System.out.println(Math.round(Math.sqrt(squares)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		double base;
		double expo;
		System.out.print("Input a number: ");
		base = input.nextDouble();
		input.nextLine();
		System.out.print( "Input another number: ");
		expo = input.nextDouble();
		input.nextLine();
		System.out.println(Math.pow(base, expo));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		double max;
		double min;
		System.out.print("Input a number: ");
		num1 = input.nextDouble();
		input.nextLine();
		System.out.print( "Input another number: ");
		num2 = input.nextDouble();
		input.nextLine();
		System.out.print("Input one more number: ");
		num3 = input.nextDouble();
		input.nextLine();
		max = Math.max(num1, num2);
		max = Math.max(max, num3);
		min = Math.min(num1, num2);
		min = Math.min(min, num3);

		System.out.println(max);
		System.out.println(min);
	}

}