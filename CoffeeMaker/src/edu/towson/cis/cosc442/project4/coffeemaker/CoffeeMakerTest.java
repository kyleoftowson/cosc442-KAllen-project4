package edu.towson.cis.cosc442.project4.coffeemaker;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}

	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}

	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}
	/*public void testexist(){
		CoffeeMaker cm=new CoffeeMaker();
		Recipe r=new Recipe();
		r.setName("Zilch");
		r.setPrice(8);
		r.setAmtCoffee(5);
		r.setAmtSugar(2);
		r.setAmtChocolate(9);
		r.setAmtMilk(5);
		
		assertFalse(cm.doesrecipeexist(r));
		
	}
	*/
/*	public void testexist1(){
		CoffeeMaker cm=new CoffeeMaker();
		
		Recipe r=new Recipe();
		
		r.setName("Zilch");
		r.setPrice(8);
		r.setAmtCoffee(5);
		r.setAmtSugar(2);
		r.setAmtChocolate(9);
		r.setAmtMilk(5);
		
		cm.addRecipe(r);
		assertTrue(cm.doesrecipeexist(r));
	}
	*/public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
}