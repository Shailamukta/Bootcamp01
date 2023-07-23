package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int totalPrice = ramPrice / 2 + cameraPrice;
		System.out.println("Total price will be " + totalPrice);
		return totalPrice;

	}

	@Override
	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int totalPrice2 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + 20;
		System.out.println("Total price will be " + totalPrice2);
		return totalPrice2;
	}

	@Override
	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice, int keyboardPrice) {
		int totalPrice3 = ramPrice + cameraPrice * 2 + Integer.parseInt(ProcessorPrice) + keyboardPrice;
		return totalPrice3;
	}

}
