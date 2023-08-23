package Abstraction;

public class abstraction {

	public static void main(String[] args) {
		// Abstraction : To reduce complexity .
		// abstract means concept. abstract ka object ni ban skta.
		// abstract ke children ka object bana skte ho.
		// abstract ki koi definition ni hoti.
		// abstract method ko override krna pdhta h.
		// isko implementation vo dere honge jo isko abstract krenge.
		// ab sirf child ke object banane honge.
		// abstraction function banane ke lie uski class ko bhi abstract krna jaroori h.
		
		MercedesBenz m = new MercedesBenz();
		m.start();
	}

}

class BMW extends Car{
	@Override
	void start() {
		System.out.println("BMW IS GERMAN");
	}
}

class MercedesBenz extends Car{
	@Override
	void start() {
		System.out.println("MERC BENZ IS ALSO GERMAN");
	}
	
}

abstract class Car { // car ek concept h iska object banake koi fayda ni h.
	int price; 
	abstract void start();
	
	void breaks() { // concrete functions
		System.out.println("Car window breaks");
	}
//	{
//		System.out.println("Car engine starts");
//	}
}