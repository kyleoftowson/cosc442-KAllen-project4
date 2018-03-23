package edu.towson.cis.cosc442.project4.coffeemaker;



// TODO: Auto-generated Javadoc
/**
 * The class <code>CoffeeMakerFactory</code> implements static methods that return instances of the class <code>{@link CoffeeMaker}</code>.
 *
 * @author Kyle
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 3/19/18 9:13 PM
 */
public class CoffeeMakerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 3/19/18 9:13 PM
	 */
	private CoffeeMakerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CoffeeMaker}</code>.
	 *
	 * @return the coffee maker
	 * @generatedBy CodePro at 3/19/18 9:13 PM
	 */
	public static CoffeeMaker createCoffeeMaker() {
		return new CoffeeMaker();
	}
}