package oopExam;
/*--An abstract class is a superclass [We can treat an abstract class as a superclass and extend it; its subclasses can override some or all of its inherited abstract methods.] that cannot be instantiated (can’t create objects).
-- Contains both abstract and non abstract methods.
-- Abstract method can not be implemented, can be defined (declared) only
-- Non abstract methods can be implemented, but can not be defined (declared).
--An abstract class can inherit only one abstract class or one regular class,an abstract class can inherit more than one Interface.
--An abstract class can inherit abstract class or regular class by extends key word,and can inherit Interface by implements keyword.
*/

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public int costofAppleWatch;
	public String modelName = "Series8";

	public AppleWatch() {
		System.out.println("This constructer is from Abstract class--AppleWatch.");
	}

	/*
	 * Yes we can instantiate abstract class with the help of concrete class in
	 * TestPhone class.
	 */
	public void abstractClassInfo() {
		System.out.println(
				"An abstract class can inherit only one abstract class or one regular class,and can inherit more than one Interface.");
	}

	public abstract void appleWatchInfo();

}
