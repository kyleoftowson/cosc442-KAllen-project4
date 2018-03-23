package edu.towson.cis.cosc442.project4.coffeemaker;



// TODO: Auto-generated Javadoc
/**
 * The class <code>RecipeFactory</code> implements static methods that return instances of the class <code>{@link Recipe}</code>.
 *
 * @author Kyle
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 3/19/18 9:13 PM
 */
public class RecipeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 3/19/18 9:13 PM
	 */
	private RecipeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Recipe}</code>.
	 *
	 * @return the recipe
	 * @generatedBy CodePro at 3/19/18 9:13 PM
	 */
	public static Recipe createRecipe() {
		return new Recipe();
	}
}