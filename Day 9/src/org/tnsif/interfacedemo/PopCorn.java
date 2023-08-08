package org.tnsif.interfacedemo;
/*FunctionalInterface:
 * An interface which contains an exactly one abstract 
 * method then that interface is known as functional
 * interface
 */


/*below annotations ensures that we have to use
 * exactly one abstract method inside an interface
 */
@FunctionalInterface
public interface PopCorn {
	//abstract method
	void displayReceipe();
	//void display();
}
