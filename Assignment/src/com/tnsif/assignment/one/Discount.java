package com.tnsif.assignment.one;

public class Discount {
	public double calculateDiscount(Bero bObj)
	{
		double discount;
		if(bObj.getBeroType().equals("Steel Bero"))
		{
			discount=(bObj.getPrice()*10)/100;
			return discount;
		}
		else if(bObj.getBeroType().equals("WeeodenBero"))
		{
			discount=(bObj.getPrice()*15)/100;
			return discount;
		}
		else
		{
			return 0;
		}
	}
}