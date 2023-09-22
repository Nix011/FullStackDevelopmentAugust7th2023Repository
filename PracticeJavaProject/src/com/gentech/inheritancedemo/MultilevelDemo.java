package com.gentech.inheritancedemo;
class bank
{
	String bankname;
	void bankdetails(String bankname)
	{
		System.out.println("bank name:"+bankname);
	}
}
class account extends bank
{
	void details(int accid,String acc_type)
	{
		System.out.println("account details: account id="+accid+" account type="+acc_type);
	}
}
class branch extends account
{
	void location(String lname,int lid)
	{
		System.out.println("branch details: location name="+lname+" location id="+lid);
	}
}
public class MultilevelDemo {
	public static void main(String[] args) {
		branch m1=new branch();
		m1.bankdetails("SBI");
		m1.details(10, "RD");
		m1.location("Blore",101);
		
	}

}
