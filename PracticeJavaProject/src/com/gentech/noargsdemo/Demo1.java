package com.gentech.noargsdemo;
class Desktop {
	String brand;
	String model;
	int ramSizeGB;
	String isSSDSupported;
	Desktop(){
		brand="lenovo";
		model="S320";
		ramSizeGB=128;
		isSSDSupported="yes";
		System.out.println("Brand:"+brand);
		System.out.println("model no.:"+model);
		System.out.println("ramSize:"+ramSizeGB+" GB");
		System.out.println("Is this SSD supported:"+isSSDSupported);
		System.out.println("-----------------------------------------------------------------------------------------	");		
	}

}
class LaptopClassDemo {
	String brand;
	String model;
	double screenSizeInches;
	int batteryCapacity;
	LaptopClassDemo(){
		brand="dell";
		model="S20";
		screenSizeInches=14.5;
		batteryCapacity=8000;
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Screen Size:"+screenSizeInches+" inches");
		System.out.println("Battery capacity:"+batteryCapacity);
		System.out.println("-----------------------------------------------------------------------------------------	");	

	}

}
class MobileDeviceClassDemo {
	String brand;
	String model;
	String operatingSystem;
	String isMobileDataEnabled;
	MobileDeviceClassDemo(){
		brand="Samsung";
		model="GalaxyS30";
		operatingSystem="Android";
		isMobileDataEnabled="No";
		System.out.println("Brand:"+brand);
		System.out.println("Model :"+model);
		System.out.println("OS :"+operatingSystem);
		System.out.println("Is the MobileData enabled:"+isMobileDataEnabled);

	}
}
public class Demo1 {

	public static void main(String[] args) {
		Desktop D=new Desktop();

		LaptopClassDemo L=new LaptopClassDemo();

		MobileDeviceClassDemo M=new MobileDeviceClassDemo();


	}

}
