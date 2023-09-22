package com.gentech.classDemo2;
class Desktop {
	String brand;
	String model;
    int ramSizeGB;
    String isSSDSupported;

}
class LaptopClassDemo {
	String brand;
    String model;
    double screenSizeInches;
    int batteryCapacity;

}
class MobileDeviceClassDemo {
	String brand;
    String model;
    String operatingSystem;
    String isMobileDataEnabled;

}
public class Demo1 {

	public static void main(String[] args) {
		Desktop D=new Desktop();
		D.brand="lenovo";
		D.model="S320";
		D.ramSizeGB=128;
		D.isSSDSupported="yes";
		System.out.println("Brand:"+D.brand);
		System.out.println("model no.:"+D.model);
		System.out.println("ramSize:"+D.ramSizeGB+" GB");
		System.out.println("Is this SSD supported:"+D.isSSDSupported);
		System.out.println("-----------------------------------------------------------------------------------------	");	
		LaptopClassDemo L=new LaptopClassDemo();
		L.brand="dell";
		L.model="S20";
		L.screenSizeInches=14.5;
		L.batteryCapacity=8000;
		System.out.println("Brand:"+L.brand);
		System.out.println("Model:"+L.model);
		System.out.println("Screen Size:"+L.screenSizeInches+" inches");
		System.out.println("Battery capacity:"+L.batteryCapacity);
		System.out.println("-----------------------------------------------------------------------------------------	");	
		MobileDeviceClassDemo M=new MobileDeviceClassDemo();
		M.brand="Samsung";
		M.model="GalaxyS30";
		M.operatingSystem="Android";
		M.isMobileDataEnabled="No";
		System.out.println("Brand:"+M.brand);
		System.out.println("Model :"+M.model);
		System.out.println("OS :"+M.operatingSystem);
		System.out.println("Is the MobileData enabled:"+M.isMobileDataEnabled);


	}

}
