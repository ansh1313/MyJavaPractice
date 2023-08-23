package Abstraction;

public class Interfaces implements vehicle, Person{

	public static void main(String[] args) {
		
		// interface ke jo bhi method/functions honge vo by default abstract/public honge.
		// abstract ke under hum functions bana skte h, and interfaces me ni bana skte.
		// to implement interfaces use implements keyword.
		// ek class ke multiple parent ni ho skte, isliye usko tackle krne ke lie interfaces banaye gye h.

	}

	@Override //it is nothing but just an annotation.
	// override tells that function is meant to be override.
	public void start() {
		System.out.println("Vehicle Crash");
	}
	
	@Override
	public void walk() {
		System.out.println("TrAnSfOrMeRs");
	}

}

interface vehicle{
	void start();
}

interface Person{
	void walk();
}