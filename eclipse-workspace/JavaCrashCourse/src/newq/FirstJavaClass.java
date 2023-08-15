package newq;
import java.util.Scanner;
public class FirstJavaClass {

	public static void main(String[] args) {
		//System.out.println("Guransh Singh");
		
		// Data Types
		// Primitive Data types are types in which size is defined by java.
		// Non Primitive types are defined by the user.
		// int[4 bytes], float, string, long[8 bytes], double, boolean, byte, short
		// Syntax for data types
		// [datatype name] [variable name] = [variable value]
		// variable name rule :> Alphanumeric characters are alphabets and digits.
		// variable name should start with alphabet or _ or $.
		// variable name cannot start with no.
		// you cannot use keywords for declaring variable like void, main
		/*
		int marks = 18;
		float AvgMarks = 19.24f; // normal value is double, so use f to declare float.
		char grade = 'A'; // always comes in single quotes
		String name = "Guransh"; // double quotes
		boolean isvalid = false;
		long bigno = 9247522222666554l; // use l for long no.
		System.out.println(bigno); // use ctrl + space to write other half of code you want to print.
		*/
		
		//Operators
		// Arthmetic operators [+,-,*,/,++,--,%]
		// Assignment operator [=] 
		// variable name should be always camel case [means first word of variable should be small and second word should be capslock.
		// to do typecasting we would first () and operator name in it.
		//int firstno = 12234;
		//int secondno = 5563;
		//int sum = firstno % secondno; // % modulus gives us remainder
		//double sum1 = (double)firstno / (double)secondno; // / divide gives us quotient
		//System.out.println(sum); // use sysout then press ctrl + space to write println in full line
		//System.out.println(sum1); // to get result in double we will typecast it 
		//int a  = 123;
		//a++; // a = a + 1; ye iske neeche waali value update kr dega
		//++a; // current value me hi update kr dega
		//System.out.println(a);
		
		//Taking User Input
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter your half age:");
		//int age = sc.nextInt();
		//float age = sc.nextFloat();
		//System.out.println("Enter name:");
		//String name = sc.nextLine();
		//System.out.println("Your current age is:");
		//System.out.println(2*age);
		//System.out.println(name);
		
		// Conditional Statements
		// divide the program flow in 2 parts
		//Scanner sc = new Scanner(System.in);
		//int age = 14;
		//System.out.println("Enter  Your Age :");
		//int age = sc.nextInt();
		//if(age >= 18) {
		//	System.out.println("You can drive");
	//	}else {
	//		System.out.println("You cannot drive");
	//	}	
		
		// Conditional Operators
		// [>] [<] [>=] [<=] [==] [!=]
		//System.out.println(18 != 56);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your Grade :");
//		//String grade = sc.nextLine();
//		char grade = 'B';
//		if(grade == 'A') {
//			System.out.println("Good");
//		} else if (grade == 'B') {
//			System.out.println("Avg");
//		} else {
//			System.out.println("Sorry bhenchod lode lag gye!!");
//		}
		
		// Switch-Case
		// Instead of writing many if..else statements, you can use the switch statement. 
		// The switch statement selects one of many code blocks to be executed
		// The break statement is used inside the switch to terminate a statement sequence.
		// agar grade specify ni hoga then ye default me chle jayega
		
//		char grade = 'D';
//		switch(grade) {
//		case 'A':
//			System.out.println("Grade is good");
//			break;
//		case 'B':
//			System.out.println("Grade is avg");
//			break;
//		case 'C':
//			System.out.println("Grade ache la lode");
//			break;
//		default:
//			System.out.println("kuch na hona");
//		}
		
		// Logical Operators [&&, ||, !]
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(!(age > 18)) {
//			System.out.println("you can vote");
//		}
//		else {
//			System.out.println("you cannot vote");
//		}
		
		// Loops (for, while, do-while)
		// steps 1. initializing variable 2. increment variable 3. in which condition we want to exit the loop
		//   start    stop   end
		/*for(int i = 0; i < 4; i++) {
			System.out.println("Guransh " + i);
		} */
		/*
		int a = 18;
		while(a <= 100) { // while true means it will run forever
			System.out.println(a);
			a++;
//			if(a > 100) {
//				break;
//			}
		} */
		
		//do while we use when we want to run our loop atleast once 
		
//		int a = 58;
//		do {
//			System.out.println(a);
//			a++;
//		}
//		while(a < 100);
		
		// continue will skip the iteration
		// break is used to get out of loop
//		int a = 28;
//		while(a <= 88) {
//			a++;
//			if(a == 38) continue;
//			System.out.println(a);
//		}
		
		// Arrays
		// we use new keyword create new object or call new constructor
		// 1st way of initializing array
//		int marks[] = new int[5];
//		marks[0] = 23;
//		marks[1] = 58;
//		marks[2] = 47;
//		marks[3] = 36;
//		marks[4] = 64;
		
		// 2nd way of initializing array
//		int marks[] = {21,58,66,35,85};
//		
//		for(int i=0; i<marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		
		// Matrix [2D Array]
//  	int  a[][] = new int[2][3];
//		int a[] [] = {
//				{
//					1,2 // row, column
//				}, {
//					3,4
//				}
//		};
//		System.out.println(a[1][1]);	
		
//		System.out.println(avg(14,2)); // Methods
		
		// Exception Handling [it will not crash and handle it by using try and catch]
		int a[] = new int[3];
		try {
		System.out.println(2/0);
		} catch(Exception e) { // if we use only Exception, it will catch any type of exception
		System.out.println("it will not execute");
		System.out.println(e.getLocalizedMessage());
		System.out.println("divide wali error");
		}
	}
	
	// Methods [ piece of code which is repeating so we want to write it once and call it everytime]
	
	// static in void main means is method ko use krne ke lie is class ka object banane ki jaroort ni
	// public keyword means class ke bahar bhi access ho skta h
	// void means kuch bhi return ni krna
	// main(string args) string ka array input le rha hoga
	// static sirf static variables ko hi access kr skte h 
	// static non-static variables ko call ni kr skta bcz non-static apke  objects access krte h
	
	// syntax
	// returnType functionName (arguments) {}
	
//	static int avg(int firstNo, int secondNo) {
//		int sum = firstNo + secondNo;
//		return sum/2;
//	}
}
