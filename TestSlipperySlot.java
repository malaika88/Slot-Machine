import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

//import org.junit.BeforeClass;
import org.junit.Test;

public class TestSlipperySlot 
{
	// create new SlipperySlot object to call payOff on
	private SlipperySlot slippery = new SlipperySlot();
	
	// checks first, sixth, and eight rules
	@Test
	public void allFive() 
	{
		int[] testArray = new int [] {4,4,4,4,4};
		assertEquals(1000010, slippery.payOff(testArray));  
	}
	//checks checks second and seventh rules 
	@Test
	public void fourofKind () 
	{
		int[] testArray = new int [] {6,6,6,6,42};
		assertEquals(10002, slippery.payOff(testArray)); 
	}
	//tests third and sixth rules
	@Test
	public void fullHouse()
	{
		int[] testArray = new int [] {5,5,5,36,36};
		assertEquals(5007, slippery.payOff(testArray)); 
	}
	// tests fourth and sixth rules 
	@Test
	public void threeOfKind()
	{
		int[] testArray = new int [] {3,7,7,7,9};
		assertEquals(107, slippery.payOff(testArray));  
	}
	// test fifth, sixth, seventh, and eight rules 
	@Test
	public void twoOfKind()
	{
		int[] testArray = new int [] {1,2,3,3,42};
		assertEquals(22, slippery.payOff(testArray));  
	}
	// tests fifth, sixth, and eighth rules 
	@Test
	public void twoDoubles()
	{
		int[] testArray = new int [] {1,1,3,3,5};
		assertEquals(20, slippery.payOff(testArray)); 
	}
	//checks sixth and eighth rules
	@Test
	public void powerSquare()
	{
		int[] testArray = new int [] {17,22,25,32,35};
		assertEquals(10, slippery.payOff(testArray));  
	}
	// checks sixth, seventh, and eighth rules 
	@Test
	public void fortyTwo()
	{
		int[] testArray = new int [] {3,4,17,19,42};
		assertEquals(12, slippery.payOff(testArray)); 
	}
	
	
	
}

	