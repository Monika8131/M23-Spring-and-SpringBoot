package com.cg.springioc;

public class Airtel implements Sim
{

	Airtel()
	{
		System.out.println("Airtel constructor called");
	}
	public void calling() {
		System.out.println("Calling using Airtel Sim");
		
	}

	public void data() {
		System.out.println("Data using Airtel Sim");
		
	}
	

}
