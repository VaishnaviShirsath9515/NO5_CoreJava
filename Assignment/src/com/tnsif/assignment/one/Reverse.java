package com.tnsif.assignment.one;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		boolean count=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		int j=n-1;
		System.out.println("Numbers said by Pinky : ");
		int pinky[]=new int[n];
		for(int i=0; i<n;i++)
		{
			pinky[i]=sc.nextInt();
		}
		System.out.println("Numbers said by Mary : ");
		int mary[]=new int[n];
		for(int i=0; i<n;i++)
		{
			mary[i]=sc.nextInt();
		}
		for(int i=0;i<pinky.length;i++,j--)
		{
			if(pinky[i]!=mary[j])
			{
				count=false;
			}
		}
		if(count==true)
		{
			System.out.println("Yes, it is in reverse order....");
		}
		else
		{
			System.out.println("No, it is not in reverse order....");
		}
		sc.close();
	}
}