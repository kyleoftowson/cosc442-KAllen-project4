package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The class <code>RecipeTest</code> contains tests for the class <code>{@link Recipe}</code>.
 *
 * @author Kyle
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 3/19/18 9:15 PM
 */
public class RecipeTest {
	
	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		
		assertEquals(false, result);
	}
	
	/**
	 * Test equals 4.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setName(null);
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		
		assertEquals(false, result);
	}
	
	/**
	 * Test equals 5.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setName("food");
		Recipe r = RecipeFactory.createRecipe();
		r.setName("food1");
		boolean result = fixture.equals(r);

		
		assertEquals(false, result);
	}
	
	/**
	 * Test equals 6.
	 */
	@Test
	public void testEquals_6(){
		Recipe r3=new Recipe();
		Recipe r4=new Recipe();
		r4.setName("Bob");
		assertFalse(r3.equals(r4));
		
	}
	

	/**
	 * Run the int getAmtChocolate() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testGetAmtChocolate_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getAmtChocolate();

		
		assertEquals(0, result);
	}
	

	/**
	 * Run the int getAmtCoffee() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testGetAmtCoffee_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getAmtCoffee();

		
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtMilk() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testGetAmtMilk_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getAmtMilk();

		
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtSugar() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testGetAmtSugar_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getAmtSugar();

		
		assertEquals(0, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		String result = fixture.getName();

		
		assertEquals(null, result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getPrice();

		
		assertEquals(0, result);
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetAmtChocolate_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = -1;

		fixture.setAmtChocolate(amtChocolate);
		assertTrue(fixture.getAmtChocolate()==0);
		
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetAmtChocolate_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = 1;

		fixture.setAmtChocolate(amtChocolate);
		assertTrue(fixture.getAmtChocolate()==1);
		
	}
	
	/**
	 * Test set amt chocolate 3.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSetAmtChocolate_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = 0;

		fixture.setAmtChocolate(amtChocolate);
		assertTrue(fixture.getAmtChocolate()==0);
		
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetAmtCoffee_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = -1;

		fixture.setAmtCoffee(amtCoffee);

		assertTrue(fixture.getAmtCoffee()==0);
	}
	
	/**
	 * Test set amt coffee 3.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testSetAmtCoffee_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = 0;

		fixture.setAmtCoffee(amtCoffee);

		assertTrue(fixture.getAmtCoffee()==0);
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetAmtCoffee_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = 1;

		fixture.setAmtCoffee(amtCoffee);

		assertTrue(fixture.getAmtCoffee()==1);
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetAmtMilk_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtMilk = -1;

		fixture.setAmtMilk(amtMilk);

		assertTrue(fixture.getAmtMilk()==0);
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetAmtMilk_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtMilk = 1;

		fixture.setAmtMilk(amtMilk);

		assertTrue(fixture.getAmtMilk()==1);
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetAmtSugar_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtSugar = -1;

		fixture.setAmtSugar(amtSugar);

		assertTrue(fixture.getAmtSugar()==0);
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetAmtSugar_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtSugar = 1;

		fixture.setAmtSugar(amtSugar);

		assertTrue(fixture.getAmtSugar()==1);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		String name = "";

		fixture.setName(name);

	
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		Recipe fixture = new Recipe();
		int price = -1;

		fixture.setPrice(price);

		assertTrue(fixture.getPrice()==0);
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testSetPrice_2()
		throws Exception {
		Recipe fixture = new Recipe();
		int price = 1;

		fixture.setPrice(price);

		assertTrue(fixture.getPrice()==1);
	}
	
	/**
	 * Test set price 3.
	 */
	@Test
	public void testSetPrice_3() {
		Recipe fixture = new Recipe();
		int price = 0;

		fixture.setPrice(price);

		assertTrue(fixture.getPrice()==0);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		String result = fixture.toString();

		
		assertEquals(null, result);
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
		
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/19/18 9:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RecipeTest.class);
	}
}