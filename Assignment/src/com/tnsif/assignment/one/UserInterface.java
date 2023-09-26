package com.tnsif.assignment.one;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		String name, address, beroType, beroColour, woodType;
		long phone;
		int beroHeight;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.println("Enter Phone Number : ");
		phone=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Address : ");
		address=sc.nextLine();
		System.out.println("Enter Bero Type : ");
		beroType=sc.nextLine();
		CustomerDetails c=new CustomerDetails(name, phone, address);
		
		if(beroType.equals("Wooden Bero"))
		{
			System.out.println("Enter Bero Colour : ");
			beroColour=sc.next();
			System.out.println("Enter Wood Type : ");
			woodType=sc.next();
			
			Bero b=new WoodenBero(beroType,beroColour,woodType);
			b.calculatePrice();
			Discount d= new Discount();
			System.out.println("Amount needs to be paid : "+(b.getPrice()-d.calculateDiscount(b)));
		}
		
		else if(beroType.equals("Steel_Bero"))
		{
			System.out.println("Enter Bero Colour : ");
			beroColour=sc.next();
			System.out.println("Enter Steel Height : ");
			beroHeight=sc.nextInt();
			
			Bero b=new SteelBero(beroType, beroColour, beroHeight);
			b.calculatePrice();
			Discount d=new Discount();
			System.out.println("Amount needs to be paid : "+(b.getPrice()-d.calculateDiscount(b)));
		}
		else
		{
			System.out.println(beroType+" is an invalid bero type");
		}
	}
}