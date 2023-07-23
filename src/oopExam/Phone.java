package oopExam;

/*Inheritance is a mechanism where a new class inherits the properties and methods of other classes. 
-- Parents class: The class from which a subclass/child class is derived is called a parent class or base class or superclass. 
-- Child class: A class derived from another class is called a Child class or Subclass.
There are some types of Inheritance:
 -- Single Inheritance: When a derived class inherits properties and behavior from a single parent class/base class/superclass, it is called single inheritance.
-- Multi-Level Inheritance: A derived class created from another derived class is called Multi Level Inheritance.
-- Hierarchical Inheritance: More than one derived class created from a single base class is called Hierarchical Inheritance.
-- Multiple Inheritance: Classes that combine aspects of multiple classes and their corresponding hierarchies.
 */

public interface Phone extends Pager, Wakitoki {

	/*
	 * Inside Interface, variable can not be declared.we must have to initialize.The
	 * variables inside Interface are final and static in nature.
	 */

	/*
	 * Interfaces cannot have constructors.Interface doesn't have method body like
	 * classes.
	 */
	public void interfaceInfo();

	public void call();

	public abstract void message();

	public abstract void camera();

	public default void battery() {
		System.out.println(
				"battery is a non-abstract and default type method in interface which are implemented in nature,It comes from Java 1.8. ");
	}

	public static void wireless() {
		System.out.println(
				"wireless is a non-abstract and static type method in interface which are implemented in nature,It comes from Java 1.8. ");
	}

}
