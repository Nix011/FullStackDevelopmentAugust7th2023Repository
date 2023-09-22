package com.gentech.programs;

public class TrafficSignal {

	public static void main(String[] args) {
		String S=args[0];
		//System.out.println("enter either of the traffic lights as follows: red or yellow or green");
		switch(S)
		{
		case "red": case "RED": case "Red":
			System.out.println("Stop");
			break;
		case "yellow": case "YELLOW":case "Yellow":
			System.out.println("Get Ready");
			break;
		case "green":case "GREEN": case "Green":
			System.out.println("Go!!!");
			break;
		default:
			System.out.println("invalid entry of value");
		}

	}

}
