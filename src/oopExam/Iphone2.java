package oopExam;

public class Iphone2 extends Iphone1 {

	public char userofIphone2 = 'F';

	public Iphone2() {
		super();
		super.regularClassInfo();
		super.youtube();
		super.interfaceInfo();
		super.call();
		super.camera();
		super.battery();
		super.message();
		super.pagerInfo();
		super.appleWatchInfo();
		super.wakitokiInfo();
		super.watchInfo();
		super.digitalWatchInfo();
		super.abstractClassInfo();
		super.appleWatchSeries5Info();

		super.model = "Apple";
		super.yearOfEstablishment = 2001;
		System.out.println("Phone Model: " + model + ".The Year of Establishment in " + yearOfEstablishment);

		System.out.println("This is a default constructor from Regular Class Iphone2.");
	}

	public Iphone2(char userofIphone2) {
		super();
		super.regularClassInfo();
		super.youtube();
		super.interfaceInfo();
		super.call();
		super.camera();
		super.battery();
		super.message();
		super.pagerInfo();
		super.appleWatchInfo();
		super.wakitokiInfo();
		super.watchInfo();
		super.digitalWatchInfo();
		super.abstractClassInfo();
		super.appleWatchSeries5Info();
		super.model = "Apple";
		super.yearOfEstablishment = 2001;

		this.userofIphone2 = userofIphone2;
		System.out.println("Phone Model: " + model + ".The Year of Establishment in " + yearOfEstablishment);
		System.out.println("The User of Iphone2 is  ." + userofIphone2);
	}

	public void iphone2Info() {
		super.regularClassInfo();
		super.youtube();
		super.interfaceInfo();
		super.call();
		super.camera();
		super.battery();
		super.message();
		super.pagerInfo();
		super.appleWatchInfo();
		super.wakitokiInfo();
		super.watchInfo();
		super.digitalWatchInfo();
		super.abstractClassInfo();
		super.appleWatchSeries5Info();
		super.model = "Apple";
		super.yearOfEstablishment = 2001;
		System.out.println("Phone Model: " + model + ".The Year of Establishment in " + yearOfEstablishment);

		System.out.println("This is a void type method. ");
	}

	public void iphone2Info(char userofIphone2) {
		super.regularClassInfo();
		super.youtube();
		super.interfaceInfo();
		super.call();
		super.camera();
		super.battery();
		super.message();
		super.pagerInfo();
		super.appleWatchInfo();
		super.wakitokiInfo();
		super.watchInfo();
		super.digitalWatchInfo();
		super.abstractClassInfo();
		super.appleWatchSeries5Info();
		super.model = "Apple";
		super.yearOfEstablishment = 2001;

		System.out.println("Phone Model: " + model + ".The Year of Establishment in " + yearOfEstablishment);
		System.out.println("The User of Iphone2 is  " + userofIphone2);
	}

	public void dropbox() {
		System.out.println(
				"Dropbox is one of a Important features of iphone where we can store and share files.All of our files are backed up to the cloud and available in online.");
	}

}
