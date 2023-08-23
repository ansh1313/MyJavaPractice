package newq;

import encapsulation.Encapsulation;

public class JavaOops {

	public static void main(String[] args) { // classes and objects
//		Person p1 = new Person(); // person ka object banaya (new & p1)
//		p1.age = 24;
//		p1.name = "Guransh";
		
		//Person p2 = new Person(38, "Gurnoor");
		//p2.age = 36;
		//p2.name = "Gurnoor";
		// .
		
		// to access properties and behaviour of objects used we will use dot(.) 
		
	//	System.out.println(p1.age + " " + p1.name);
	//	System.out.println(p2.age + " " + p2.name); // person class kuch bhi ni h, jab person class ke objects banate h uski help se hum cheejo ke saath interact krte h 
		
	//	p1.eat(); // p1 wala jo object h uska eat wala function(method) call krdo
	//	p2.walk(); // p2 wala jo object h uska walk wala function(method) call krdo
	//	p2.walk(4); // it will go to steps because argument is passed to it.
		
	//	System.out.println(Person.count); // it will print 2 bcz count is print 2 times and 2 persons is called
		
		//Developer d1 = new Developer(24, "ansh");
		//Person p1 = d1;
		//d1.walk();
		
		// to call doWork from Encapsulation.java
		Encapsulation obj = new Encapsulation();
		obj.doWork();
	}
}

// Inheritance [ aap ek normal class banate ho, aur jo uski parent class hogi usse aap uski properties ko inherit kr skte ho.]
// to use inheritance in java use extends keyword.
// java me jitne bhi objects hote h sbka parent object hota h.

class Developer extends Person { // person ke jo bhi properties hongi vo developer ke pass bhi ajayegi
	public Developer(int age, String name) {
		super(age, name); // super keyword = apne parent ke constructor ko call krne ke lie kaam ata h, and unki properties ko bhi access kr skte h.
	}
	void walk() {
		System.out.println("Developer " + name + " is walking.");
	}
}

class Person{ //  class person runtime ki memory me koi jagah ni legi but program ki memory me jagah legi
	protected String name; // protected means ki parent ki property sirf child class ko mille.
	// hum name ko sirf iske children(means developer) ko access dena chahte h.
	int age;
	static int count; // static means ab ye class ki property h, object ki property ni h 
	// static ki help se class ke objects and properties bana skte ho.
	
//	public Person() { // constructor is used to make new objects. when you want to initialize your property you will use constructor
//		count++;
//		System.out.println("creating an object"); // it is print 2 times bcz see in line 6 and 10 person is calling default contructor 2 times.
//	}
	
	//public Person(int newAge, String newName) { // constructor overloading
		//this(); // used in 2 ways. agar apko ek constructor se doosra constructor call krna h then you will use (this) keyword.
		// this me humne koi argument pass ni kia jisse 33 line wala constructor call hojayega.
		// then count++ hoga then doosra constructor print hoga.
		// this ki help se aap apni class ke doosre constructor ko call kr skte ho.
		//name = newName;
		//age = newAge; 
		
		// 2nd way of using this keyword
	    // agar apko batana h ki is class ke jo age variable h mujhe is wale age variable me assign krna h (age = age) 
	    // jo pehle wala age h vo issi class ka age h, so use this keyword.
	public Person(int age, String name) {
		//this(); // issi class ke doosre constructor ko call krne ke lie
		this.name = name; // issi class ke doosre parameters ko access krne ke lie
		this.age = age;
	}
	
	void walk() { // no arguments passed
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(name + " is eating.");
	}
	
	void walk(int steps) { //steps argument passed
		System.out.println(name + " walked " + steps + " steps. ");
	} // constructor is used to make new objects (see in line 6 after new person is called which is nothing but calling a constructor.)
	 // it is default constructor and it does not take any argument. 
	
	void doWork() {
		System.out.println("Person is working");
	}
	
}