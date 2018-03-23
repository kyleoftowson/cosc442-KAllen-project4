package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.Test;

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
	@Test
	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}
	@Test
	public void testaddinventory() {
		cm = new CoffeeMaker();
		assertFalse(cm.addInventory(-1, 1, 1, 1));
		assertFalse(cm.addInventory(1, 1, 1, -1));
		assertFalse(cm.addInventory(1, 1, -1, 1));
		assertFalse(cm.addInventory(1, -1, 1, 1));
		assertTrue(cm.addInventory(1, 1, 1, 1));
		
	}
	
	@Test
	public void testaddinventory1() {
		int milk=cm.checkInventory().getMilk();
		int sugar=cm.checkInventory().getSugar();
		int coffee=cm.checkInventory().getCoffee();
		int choc=cm.checkInventory().getChocolate();
		cm.addInventory(1, 1, 1, 1);
		assertFalse(cm.checkInventory().getCoffee()==coffee);
		assertFalse(cm.checkInventory().getChocolate()==choc);
		assertFalse(cm.checkInventory().getSugar()==sugar);
		assertFalse(cm.checkInventory().getMilk()==milk);
	}
	@Test
	public void testdoesrecipeexist1() {
		Recipe r51=new Recipe();
		Recipe r57=new Recipe();
		r51.setName("La");
		r57.setName("RARA");
		
		cm.addRecipe(r51);
		cm.addRecipe(r57);
		System.out.println(cm.doesrecipeexist(r51));
		assertFalse(cm.doesrecipeexist(r51));
	}
	@Test
	public void testdoesrecipeexist() {
		Recipe r51=new Recipe();
		Recipe r57=new Recipe();
		r51.setName("RARA");
		r57.setName("RDFDRA");
	
		cm.addRecipe(r51);
		System.out.println(cm.doesrecipeexist(r57));
		assertTrue(cm.doesrecipeexist(r57));
	}
	@Test
	public void testAddRecipe3() {
		Recipe r54=new Recipe();
		Recipe r53=new Recipe();
		Recipe r52=new Recipe();
		Recipe r51=new Recipe();
		Recipe r57=new Recipe();
		r54.setName("RARrA");
		r53.setName("RARsA");
		r52.setName("RARdA");
		r51.setName("RARfA");
		r57.setName("RARgA");
		
		cm.addRecipe(r54);
		cm.addRecipe(r53);
		cm.addRecipe(r52);
		cm.addRecipe(r51);
		assertFalse(cm.addRecipe(r57));
		
	}
	public void testAddRecipe4() {
		Recipe r54=new Recipe();
		r54.setName("RtfA");
		Recipe r53=new Recipe();
		r53.setName("RARfdssA");
		Recipe r52=new Recipe();
		r52.setName("ffgghRARA");
		Recipe r57=new Recipe();
		r57.setName("RARrfdghtA");
		
	
		cm.addRecipe(r54);
		cm.addRecipe(r53);
		cm.addRecipe(r52);
		
		assertTrue(cm.addRecipe(r57));
		
	}
	
	@Test
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
	
	*/
	@Test
	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	@Test
	public void testMakeCoffee() {
		assertTrue(cm.makeCoffee(r1, r1.getPrice()-1)==r1.getPrice()-1);
		
		
	}
	@Test
	public void testMakeCoffee1() {
		cm.checkInventory().setCoffee(5);
		assertTrue(cm.makeCoffee(r1, r1.getPrice()+5)==r1.getPrice()+5);
		
	}
	@Test
	public void testMakeCoffee7() {
		r1.setAmtChocolate(4);
		int ch=i.getChocolate();
		int co=i.getCoffee();
		int m=i.getMilk();
		int s=i.getSugar();
		assertTrue(cm.makeCoffee(r1, r1.getPrice()+5)==5);
		m-=1;
		s-=1;
		co-=6;
		ch-=4;
		Inventory ci=cm.checkInventory();
		assertTrue(ci.getCoffee()==co);
		assertTrue(ci.getChocolate()==ch);
		assertTrue(ci.getSugar()==s);
		assertTrue(ci.getMilk()==m);
		
	}
	
	
	
}