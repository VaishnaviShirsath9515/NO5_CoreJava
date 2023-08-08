package org.tnsif.interfacedemo;

public class InterfaceExcutor {
	public static void main(String[] args) {
		
		SBIDebitCard s=new SBIDebitCard();
		s.displayCardDetails();
		
		s.display();
		/*print() is a static method inside an interface, 
		 * to call print() method, we have to use interfacename.method
		 * name();
		 */
		DebitCard.print();
		
		CheesePopCorn c=new CheesePopCorn();
		c.displayReceipe();
		
		Person p=new Person();
		p.showDrinkName();
	}

}
