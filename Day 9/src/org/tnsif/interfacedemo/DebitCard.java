package org.tnsif.interfacedemo;

public interface DebitCard {
	/*by default all the variables insidean interface is private
	 * static final and if it final then we must have to initialize
	 * value for that variable
	 */
	long cardno=5689895623L;
	//we can't use 
	void displayCardDetails();
	
	default void display()
	{
		System.out.println("default method");
	}
	static void print()
	{
		System.out.println("static method");
	}
}
