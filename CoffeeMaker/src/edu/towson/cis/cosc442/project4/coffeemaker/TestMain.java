package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class TestMain.
 */
public class TestMain {
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		
		
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	/**
	 * Adds the recipe 1.
	 */
	@Test
	public void addRecipe1() {
		 
		CoffeeMaker Coffee=new CoffeeMaker();
		Main.coffeeMaker=Coffee;
		String s="";
		s+="1 ";
		s+="Coffee "+
		"50 ";
		s+="3 ";
		s+="1 ";
		s+="1 ";
		s+="0 ";
		s+= "------";
	
		
		 
		 
		
		Main.scan=new Scanner(s);
		Main.mainMenu();
		assertTrue(Main.coffeeMaker.getRecipeForName("Coffee").getName().equals("Coffee"));
		
	}

	/**
	 * Delete recipe 1.
	 */
	@Test
	public void deleteRecipe1() {
		addRecipe1();

		  
		String s="";
		s+="2 "
		
		+ "4 "
	
		+"-----";
		
		Main.scan=new Scanner(s);
		Main.mainMenu();
		assertTrue(Main.coffeeMaker.getRecipeForName("Coffee").getAmtMilk()==0);
	}

	/**
	 * Edits the recipe 1.
	 */
	@Test
	public void editRecipe1() {
		addRecipe1();
		
		
		  
		String s="";
		s+="3 "
		+ "4 "		
		+ "Coffee "
		+ "50 "
		+ "3 "
		+ "1 "
		+ "2 "
		+ "0 "
		+"-----";
		
		Main.scan=new Scanner(s);
		Main.mainMenu();
		assertTrue(Main.coffeeMaker.getRecipeForName("Coffee").getAmtSugar()==2);
		
	}

	/**
	 * Purchase beverage 1.
	 */
	@Test
	public void purchaseBeverage1() {
		addRecipe1();
		String s="";
		s+="6 ";
		s+="4 "+
		"500000 ";
	
		
		s+= "------";
		
		
		 
		 
		
		Main.scan=new Scanner(s);
		
		int milk=Main.coffeeMaker.checkInventory().getMilk();
		Main.mainMenu();
		
		assertFalse(Main.coffeeMaker.checkInventory().getMilk()==milk);

	}
	
	/**
	 * Purchase beverage 2.
	 */
	@Test
	public void purchaseBeverage2() {
		addRecipe1();
		String s="";
		s+="6 ";
		s+="4 "+
		"9 ";
	
		
		s+= "------";
		
		
		 
		 
		
		Main.scan=new Scanner(s);
		
		int milk=Main.coffeeMaker.checkInventory().getMilk();
		Main.mainMenu();
		
		assertTrue(Main.coffeeMaker.checkInventory().getMilk()==milk);
	}

	/**
	 * Check inventory.
	 */
	@Test
	public void checkInventory() {
		CoffeeMaker Coffee=new CoffeeMaker();
		Main.coffeeMaker=Coffee;
		String s="";
		s+="4 ";
		s+="3 "+
		"5 ";
		s+="4 ";
		s+="7 ";
		
		s+= "------";
		
		
		 
		 
		
		Main.scan=new Scanner(s);
		Main.mainMenu();
		assertTrue(Main.coffeeMaker.checkInventory().getChocolate()==22);
	}

	/**
	 * Adds the inventory 1.
	 */
	@Test
	public void addInventory1() {
		CoffeeMaker Coffee=new CoffeeMaker();
		Main.coffeeMaker=Coffee;
		String s="";
		s+="4 ";
		s+="3 "+
		"5 ";
		s+="4 ";
		s+="7 ";
		
		s+= "------";
	
		
		 
		 
		
		Main.scan=new Scanner(s);
		Main.mainMenu();
		
		
		assertTrue(Main.coffeeMaker.checkInventory().getCoffee()==18);
	
	}



}
