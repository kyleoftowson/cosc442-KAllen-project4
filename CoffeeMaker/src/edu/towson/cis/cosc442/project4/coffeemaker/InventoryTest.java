package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 3/19/18 9:15 PM
 * @author Kyle
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {

		Inventory result = new Inventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getMilk());
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}
	@Test
	public void testEnoughIngredients_3()
		throws Exception {
		Inventory i = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtSugar(1);
		r.setAmtMilk(1);
		r.setAmtChocolate(1);
		r.setAmtCoffee(1);
		i.setChocolate(1);
		i.setCoffee(1);
		i.setMilk(1);
		i.setSugar(0);
		boolean result = i.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}

	@Test
	public void testEnoughIngredients_8Greaterthan(){
		Inventory i=new Inventory();
		Recipe r = new Recipe();
	
		r.setAmtCoffee(7);	
		i.setCoffee(9);
		i.setMilk(6);
		r.setAmtMilk(6);
		i.setSugar(1);
		r.setAmtSugar(1);
		i.setChocolate(3);
		r.setAmtChocolate(2);
		assertTrue(i.enoughIngredients(r));
		r.setAmtCoffee(7);	
		i.setCoffee(9);
		i.setMilk(3);
		r.setAmtMilk(2);
		i.setSugar(2);
		r.setAmtSugar(1);
		i.setChocolate(3);
		r.setAmtChocolate(2);
		assertTrue(i.enoughIngredients(r));
		r.setAmtCoffee(7);	
		i.setCoffee(9);
		i.setMilk(8);
		r.setAmtMilk(6);
		i.setSugar(7);
		r.setAmtSugar(3);
		i.setChocolate(3);
		r.setAmtChocolate(2);
		assertTrue(i.enoughIngredients(r));
		r.setAmtCoffee(7);	
		i.setCoffee(9);
		i.setMilk(8);
		r.setAmtMilk(6);
		i.setSugar(2);
		r.setAmtSugar(1);
		i.setChocolate(4);
		r.setAmtChocolate(1);
		assertTrue(i.enoughIngredients(r));
	}
	@Test
	public void testEnoughIngredients_8Equal(){
		Inventory i=new Inventory();
		Recipe r = new Recipe();
	
		r.setAmtCoffee(7);	
		i.setCoffee(7);
		i.setMilk(8);
		r.setAmtMilk(6);
		i.setSugar(2);
		r.setAmtSugar(1);
		i.setChocolate(3);
		r.setAmtChocolate(2);
		assertTrue(i.enoughIngredients(r));
		r.setAmtCoffee(7);	
		i.setCoffee(9);
		i.setMilk(6);
		r.setAmtMilk(6);
		i.setSugar(2);
		r.setAmtSugar(1);
		i.setChocolate(3);
		r.setAmtChocolate(2);
		assertTrue(i.enoughIngredients(r));
		r.setAmtCoffee(7);	
		i.setCoffee(9);
		i.setMilk(8);
		r.setAmtMilk(6);
		i.setSugar(3);
		r.setAmtSugar(3);
		i.setChocolate(3);
		r.setAmtChocolate(2);
		assertTrue(i.enoughIngredients(r));
		r.setAmtCoffee(7);	
		i.setCoffee(9);
		i.setMilk(8);
		r.setAmtMilk(6);
		i.setSugar(2);
		r.setAmtSugar(1);
		i.setChocolate(4);
		r.setAmtChocolate(4);
		assertTrue(i.enoughIngredients(r));
	}
	
	@Test
	public void testEnoughIngredients_9()
		throws Exception {
		Inventory i = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtSugar(1);
		r.setAmtMilk(1);
		r.setAmtChocolate(1);
		r.setAmtCoffee(1);
		i.setChocolate(1);
		i.setCoffee(1);
		i.setMilk(0);
		i.setSugar(1);
		boolean result = i.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}
	@Test
	public void testEnoughIngredients_7()
		throws Exception {
		Inventory i = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtSugar(1);
		r.setAmtMilk(1);
		r.setAmtChocolate(1);
		r.setAmtCoffee(1);
		i.setChocolate(1);
		i.setCoffee(0);
		i.setMilk(1);
		i.setSugar(1);
		boolean result = i.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}
	@Test
	public void testEnoughIngredients_6()
		throws Exception {
		Inventory i = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtSugar(1);
		r.setAmtMilk(1);
		r.setAmtChocolate(1);
		r.setAmtCoffee(1);
		i.setChocolate(0);
		i.setCoffee(1);
		i.setMilk(1);
		i.setSugar(1);
		boolean result = i.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}
	@Test
	public void testEnoughIngredients_0(){
		Inventory i=new Inventory();
		Recipe r = new Recipe();
	
		r.setAmtCoffee(7);	
		i.setCoffee(3);
		i.setMilk(8);
		r.setAmtMilk(6);
		i.setSugar(2);
		r.setAmtSugar(1);
		i.setChocolate(3);
		r.setAmtChocolate(2);
		assertFalse(i.enoughIngredients(r));
		r.setAmtCoffee(7);	
		i.setCoffee(9);
		i.setMilk(4);
		r.setAmtMilk(6);
		i.setSugar(2);
		r.setAmtSugar(1);
		i.setChocolate(3);
		r.setAmtChocolate(2);
		assertFalse(i.enoughIngredients(r));
		r.setAmtCoffee(7);	
		i.setCoffee(9);
		i.setMilk(8);
		r.setAmtMilk(6);
		i.setSugar(2);
		r.setAmtSugar(3);
		i.setChocolate(3);
		r.setAmtChocolate(2);
		assertFalse(i.enoughIngredients(r));
		r.setAmtCoffee(7);	
		i.setCoffee(9);
		i.setMilk(8);
		r.setAmtMilk(6);
		i.setSugar(2);
		r.setAmtSugar(1);
		i.setChocolate(3);
		r.setAmtChocolate(4);
		assertFalse(i.enoughIngredients(r));
	}

	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getChocolate();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getCoffee();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getMilk();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getSugar();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = -1;

		fixture.setChocolate(chocolate);

		assertTrue(fixture.getChocolate()==0);
		
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = 1;

		fixture.setChocolate(chocolate);
		assertTrue(fixture.getChocolate()==1);
	}
	@Test
	public void testSetChocolate_5()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = 0;

		fixture.setChocolate(chocolate);
		assertTrue(fixture.getChocolate()==0);
	}
	@Test
	public void testSetChocolate_50()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = -50;

		fixture.setChocolate(chocolate);
		assertTrue(fixture.getChocolate()==0);
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int coffee = -1;

		fixture.setCoffee(coffee);

		assertTrue(fixture.getCoffee()==0);
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int coffee = 1;

		fixture.setCoffee(coffee);

		assertTrue(fixture.getCoffee()==1);
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int milk = -1;

		fixture.setMilk(milk);

		assertTrue(fixture.getMilk()==0);
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int milk = 1;

		fixture.setMilk(milk);
		assertTrue(fixture.getMilk()==1);
		
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int sugar = -1;

		fixture.setSugar(sugar);

		assertTrue(fixture.getSugar()==0);
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int sugar = 1;

		fixture.setSugar(sugar);

		assertTrue(fixture.getSugar()==1);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}