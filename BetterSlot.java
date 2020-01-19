import java.util.Arrays;
import java.util.Random; 
public class BetterSlot{
		public int[] pullTheLever() 
		{
			int [] entry = new int[5]; 
			Random rand = new Random();  // create random number object 
			
			for(int i = 0; i< entry.length; i++)
			{
				int thisEntry = rand.nextInt(50); // create random number 0-49
				thisEntry +=1; //adjust the number so range is from 1-50
				entry[i]= thisEntry; // populate the list with the random numbers
			}
			payOff(entry);// call payOff with the random array as the paramter
			return entry;
		}// end of pulltheLever
	public int payOff(int[]m)
	{
		int earning = 0; 
		Arrays.sort(m); // sort the list to make finding pairs and matches easier
		// naming each value in the list to make comparisons easier 
		int first = m[0]; 
		int second = m[1]; 
		int third = m[2]; 
		int fourth = m[3]; 
		int fifth = m[4]; 
		
		//if first in last number same in ordered list then all 5 are the same 
		if(first == fifth)
		{
			earning += 1000000; 
		}
		
		//if 1 and 4 or 2 and 5 are the same in an ordered list then so are the value in btw
		else if(first == fourth ||second == fifth)
		{
			earning += 10000; 
		}
		//if 1-3, 2-4, or 3-5 are the same then look for the pair to determine if it is a fullHouse or emptyHouse
		else if(first == third || second == fourth || third == fifth)// find first pair
		{
			if ((first == third && fourth == fifth)|| (third == fifth && first == second))// 3 match check for if there is another pair
			{
				earning += 5000; 
			}
			else// if no other pair besides 3 match 
			{
				earning += 100; 
			}
		}
		// check if any items next to each other are the same to find the pairs 
		else if(first == second || second == third || third == fourth || fourth == fifth)
		{
			earning += 10; 
		}
		// values for perfect_square less than 50 {1^2, 2^2, 3^2, 4^2, 5^2, 6^2, 7^2) 
		boolean perfect_square = false; 
		for(int i = 0; i< m.length; i++)
		{
			if((m[i] == 1) || (m[i] == 4 )|| (m[i] == 9) || (m[i] == 16) || (m[i]==25)|| (m[i] == 36) || (m[i]== 49))
			{
				perfect_square = true; 
			}
		}
		if (perfect_square == true)// use boolean to avoid double counting same award 
		{
			earning+= 7; 
		}
		
		// look through the whole list to see if there are any 42s
		boolean fortyTwo= false; 
		for(int i = 0; i< m.length ; i++)
		{
			if(m[i] == 42)
			{
				fortyTwo = true; 
			}
		}
		if(fortyTwo == true)// use boolean to avoid double counting same award 
		{
			earning += 2; 
		}
		//values that are power of 2 less than 50 { 2^0, 2^1, 2^2, 2^3, 2^4, 2^5}
		boolean power2 = false; 
		for(int i = 0; i < m.length; i++ )
		{
			if((m[i] == 1) || (m[i] == 2) || (m[i] == 4) ||(m[i]==8) || (m[i] == 16) || (m[i] == 32))
			{
				power2= true;
			}
		}
		if(power2 == true)// use boolean to avoid double counting same award 
		{
			earning += 3; 
		}
		return earning; 
	}// end of payOff 
}// end of class BetterSlot
	