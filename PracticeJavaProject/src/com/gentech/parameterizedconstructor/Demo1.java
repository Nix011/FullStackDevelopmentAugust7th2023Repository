package com.gentech.parameterizedconstructor;
class Desktop {
	String brand;
	String model;
	int ramSizeGB;
	String isSSDSupported;
	Desktop(String bname,String mname,int size,String SSD){
		brand=bname;
		model=mname;
		ramSizeGB=size;
		isSSDSupported=SSD;
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
	LaptopClassDemo(String bname,String mname,double ssize,int battery){
		brand=bname;
		model=mname;
		screenSizeInches=ssize;
		batteryCapacity=battery;
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
	MobileDeviceClassDemo(String bname,String mname,String os,String mobile){
		brand=bname;
		model=mname;
		operatingSystem=os;
		isMobileDataEnabled=mobile;
		System.out.println("Brand:"+brand);
		System.out.println("Model :"+model);
		System.out.println("OS :"+operatingSystem);
		System.out.println("Is the MobileData enabled:"+isMobileDataEnabled);

	}
}
public class Demo1 {

	public static void main(String[] args) {
		Desktop D=new Desktop("lenovo","S800", 128, "yes");

		LaptopClassDemo L=new LaptopClassDemo("dell", "S340", 14.5, 8000);

		MobileDeviceClassDemo M=new MobileDeviceClassDemo("Samsung", "GalaxyS30","Android","yes");


	}

}
