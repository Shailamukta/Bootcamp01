package oopExam;

public class Iphone6 extends Iphone5 {
	public void compass() {
		System.out.println(
				"The Compass app shows you the direction iPhone is pointing, your current location, and elevation.");
	}

	/*
	 * We can use oop Inheritance feature here.who is the parent class and who is
	 * the child class and child class can inherite the properties of parent class.
	 */

	/*
	 * Polymorphism is the ability of an object to take on many forms.Static
	 * Polymorphism or early binding or method overloading or compile time
	 * polymorphism: happens in compile time.Dynamic Polymorphism or late binding or
	 * method overriding or run time polymorphism: happens in Run time.
	 * 
	 */

	public int materials(int ramPrice, int cameraPrice) {
		int totalPrice = ramPrice + cameraPrice;
		System.out.println("Total price will be " + totalPrice);
		return totalPrice;

	}

	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int totalPrice2 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("Total price will be " + totalPrice2);
		return totalPrice2;
	}

	public void materials() {
		System.out.println("This is a void type method. ");

	}

	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice, int keyboardPrice) {
		int totalPrice3 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + keyboardPrice;
		return totalPrice3;
	}

	public final int materials(int ramPrice, String ProcessorPrice, int keyboardPrice, int cameraPrice) {
		int totalPrice4 = ramPrice + Integer.parseInt(ProcessorPrice) + keyboardPrice + cameraPrice;
		return totalPrice4;
	}

	public static int materials(int ramPrice, String ProcessorPrice, int keyboardPrice, int cameraPrice,
			float mousePrice) {
		int totalPrice5 = ramPrice + Integer.parseInt(ProcessorPrice) + keyboardPrice + cameraPrice + (int) mousePrice;
		return totalPrice5;
	}

}
