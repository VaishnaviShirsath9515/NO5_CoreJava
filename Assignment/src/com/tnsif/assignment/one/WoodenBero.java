package com.tnsif.assignment.one;

public class WoodenBero extends Bero{
	private String woodType;

	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType=woodType;
	}

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

	@Override
	public void calculatePrice() {
		if(woodType=="Ply Wood")
		{
			price=15000;
		}
		else if(woodType=="Teak Wood")
		{
			price=12000;
		}
		else if(woodType=="Engineered Wood")
		{
			price=10000;
		}
	}
}