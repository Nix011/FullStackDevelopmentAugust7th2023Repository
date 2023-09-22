package com.gentech.parameterizedconstructor;
class TwoWheelers {
	String type;
	int engineCapacity;
	String hasStorage;
	String fuelType;
	TwoWheelers(String t,int ec,String storage,String ft){
		type=t;
		engineCapacity=ec;
		hasStorage=storage;
		fuelType=ft;
		System.out.println("Two wheeler type:"+type);
		System.out.println("Engine capacity:"+engineCapacity);
		System.out.println("Does it have storage space:"+hasStorage);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("-----------------------------------------------------------------");
	}
}
class FourWheeler {
	String type;
	int seatingCapacity;
	String isSUV;
	String fuelType;
	FourWheeler(String t,int seat,String suv,String ft){
		type=t;
		seatingCapacity=seat;
		isSUV=suv;
		fuelType=ft;
		System.out.println("Four wheeler type:"+type);
		System.out.println("Seating capacity:"+seatingCapacity);
		System.out.println("Is this an SUV:"+isSUV);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("-----------------------------------------------------------------");
	}
}
class HeavyVehicle {
	String type;
	double maxPayload;
	String fuelType;
	int numAxles;
	HeavyVehicle(String t,double max,String ft,int axels){
		type=t;
		maxPayload=max;
		fuelType=ft;
		numAxles=axels;
		System.out.println("Heavy vehicle type:"+type);
		System.out.println("Maximum Payload: "+maxPayload+"tons");
		System.out.println("Fuel type:"+fuelType);
		System.out.println("Number of axels:"+numAxles);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		TwoWheelers tw = new TwoWheelers("scooter", 125, "yes", "petrol");

		FourWheeler fw = new FourWheeler("SUV", 6, "yes", "diesel");

		HeavyVehicle hv=new HeavyVehicle("tractor", 4.5, "petrol", 2);


	}

}
