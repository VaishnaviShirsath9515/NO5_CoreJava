package org.tnsif.introduction;
//program to demonstrate on 
public class DataTypeDemo {

	public static void main(String[] args) {
		//integer will give us the values in whole number
		//float and double will gives us the value in decimal point
		
		/*if we use in programming division '/', it prints only
		 * quotient value and modulo will print '%', prints 
		 * remainder value =
		 */
		
		int num1=5/2;
		float num2=103/45;
		/*if we use 'd' after any number for double type it will give
		 * the precision upto 16 decimal places
		 */
		double num3=10d/3d;
		/*if we use 'f' after any number for float type it will give
		 * the precision upto 7 decimal places
		 */
		float num4=14f/3f;
		
		System.out.println("The value1 is : "+num1);
		System.out.println("The value2 is : "+num2);
		System.out.println("The value3 is : "+num3);
		System.out.println("The value4 is : "+num4);
	}

}
