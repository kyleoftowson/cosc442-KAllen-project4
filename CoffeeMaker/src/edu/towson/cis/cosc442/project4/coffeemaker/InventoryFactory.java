package edu.towson.cis.cosc442.project4.coffeemaker;



// TODO: Auto-generated Javadoc
/**
 * The class <code>InventoryFactory</code> implements static methods that return instances of the class <code>{@link Inventory}</code>.
 *
 * @author Kyle
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 3/19/18 9:13 PM
 */
public class InventoryFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 3/19/18 9:13 PM
	 */
	private InventoryFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Inventory}</code>.
	 *
	 * @return the inventory
	 * @generatedBy CodePro at 3/19/18 9:13 PM
	 */
	public static Inventory createInventory() {
		return new Inventory();
	}
}