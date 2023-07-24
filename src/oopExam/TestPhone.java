package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		System.out.println(".......Regular class Iphone.....");
		Iphone1 iphone1 = new Iphone1();
		iphone1.setPrice(750);
		iphone1.setInfo("2000");
		iphone1.setUser('F');
		iphone1.setMadeInUSA(false);
		iphone1.regularClassInfo();
		Iphone1.youtube();
		iphone1.call();
		iphone1.interfaceInfo();
		iphone1.message();
		iphone1.camera();
		iphone1.battery();
		iphone1.appleWatchInfo();
		iphone1.abstractClassInfo();
		iphone1.pagerInfo();
		iphone1.wakitokiInfo();
		iphone1.watchInfo();
		iphone1.digitalWatchInfo();
		System.out.println("I bought this phone in" + iphone1.getInfo() + ",the price was" + iphone1.getPrice()
				+ "$,User's Sex:" + iphone1.getUser() + ",made in USA is:" + iphone1.isMadeInUSA());

		System.out.println("\n--------------------- Abstract Class AppleWatch ------------------------\n");
		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		appleWatch.appleWatchSeries5Info();
		appleWatch.watchInfo();
		appleWatch.digitalWatchInfo();

		System.out.println("\n--------------------- Interface Phone ------------------------\n");
		Phone phone = new Iphone1();
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.camera();
		phone.battery();
		Phone.wireless();
		phone.pagerInfo();
		phone.wakitokiInfo();

		System.out.println("\n-------Regular class Iphone2 instantiate ------------------------\n");
		Iphone2 iphone2 = new Iphone2();
		Iphone2 iphone2pera = new Iphone2('F');
		iphone2.iphone2Info();
		iphone2pera.iphone2Info('F');
		iphone2.regularClassInfo();
		Iphone2.youtube();
		phone.interfaceInfo();
		iphone2.call();
		iphone2.camera();
		iphone2.battery();
		iphone2.message();
		iphone2.pagerInfo();
		iphone2.appleWatchInfo();
		iphone2.wakitokiInfo();
		iphone2.watchInfo();
		iphone2.digitalWatchInfo();
		iphone2.abstractClassInfo();
		iphone2.appleWatchSeries5Info();
		iphone2.dropbox();

		Iphone3 iphone3 = new Iphone3();
		iphone3.map();
		iphone3.regularClassInfo();
		Iphone3.youtube();//
		phone.interfaceInfo();
		iphone3.call();
		iphone3.message();
		iphone3.camera();
		iphone3.pagerInfo();
		iphone3.wakitokiInfo();
		iphone3.appleWatchInfo();
		iphone3.watchInfo();
		iphone3.digitalWatchInfo();

		System.out.println("\n.................\n");

		Iphone6 iphone6 = new Iphone6();
		iphone6.compass();
		iphone6.email();
		iphone6.photos();
		iphone6.iphone2Info();
		iphone6.iphone2Info('M');
		iphone6.regularClassInfo();
		Iphone6.youtube();
		iphone6.dropbox();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.battery();
		iphone6.appleWatchInfo();
		iphone6.abstractClassInfo();
		iphone6.pagerInfo();
		iphone6.wakitokiInfo();
		iphone6.watchInfo();
		iphone6.digitalWatchInfo();
		iphone6.appleWatchSeries5Info();
		iphone6.materials();
		iphone6.materials(50, 80);
		iphone6.materials(50, 80, "90");
		iphone6.materials(50, 80, "90", 25);
		iphone6.materials(50, "90", 25, 80);// return type final parameterized method
		Iphone6.materials(50, "90", 25, 80, 5.90f);// return type static parameterized method

		/*
		 * Iphone1 is a parent class and Iphone2 and Iphone3 is a child class.This is a
		 * Hierarchical Inheritance.
		 */

		/*
		 * Ihone1,Iphone2,Iphone4,Iphone5 and Iphone6 this is a example of Multilevel
		 * Inheritance.Here IPhone1 is a parent class and Iphone2,Iphone4,Iphone5 and
		 * Iphone 6 are child class.
		 */
		System.out.println("\n..............Regular class ConfiguredIphone6 Instantiate.......\n");

		ConfiguredIphone6 cI6 = new ConfiguredIphone6();
		cI6.compass();
		cI6.materials();
		cI6.materials(50, 80);
		cI6.materials(50, 80, "90");
		cI6.materials(50, 80, "90", 25);
		cI6.email();
		cI6.photos();
		cI6.iphone2Info();
		cI6.iphone2Info('M');
		cI6.regularClassInfo();
		cI6.dropbox();
		cI6.interfaceInfo();
		ConfiguredIphone6.youtube();
		cI6.call();
		cI6.message();
		cI6.camera();
		cI6.battery();
		cI6.appleWatchInfo();
		cI6.appleWatchSeries5Info();
		cI6.abstractClassInfo();
		cI6.pagerInfo();
		cI6.wakitokiInfo();
		cI6.watchInfo();
		cI6.digitalWatchInfo();

	}

}
