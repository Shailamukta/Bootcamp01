package oopExam;

public class Iphone1 extends AppleWatch implements Phone {
	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;
	public String model;
	public int yearOfEstablishment;

	public Iphone1() {
		System.out.println("This is a default constructor from Regular Class Iphone1.");
	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
	}

	public int getPrice() {
		return price;
	}

	public String getInfo() {
		return info;
	}

	public char getUser() {
		return user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {
		System.out.println(
				"A regular class can inherit only one (regular class or one abstract class) by extends keyword.a regular class can inherit more than one Interface.Implements keyword is used to inherit Interface in regular class.");
	}

	public static void youtube() {
		System.out.println("Youtube is a very popular and useful features in Iphone now a days.");
	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagerInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void wakitokiInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void digitalWatchInfo() {
		// TODO Auto-generated method stub

	}

}
