import java.util.*;
import java.io.*;


public class RoomateSelection 
{
	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> singles = new ArrayList<String>();
		ArrayList<String> doubles = new ArrayList<String>();
		Random rand = new Random();
		int index = 0;
		
		names.add("Shreyas");
		names.add("Evan");
		names.add("Gary");
		names.add("Josh");
		names.add("Ben");
		names.add("Gabe");
		names.add("Pramath");
		names.add("Duncan");
		
		for(int i = 8; i > 4; i--)
		{
			index = rand.nextInt(names.size());
			singles.add(names.remove(index));
		}
		
		for (int j = 4; j > 0; j--)
		{
			doubles.add(names.remove(0));
		}
		
		System.out.print("Singles: ");
		int ind1 = 0;
		
		while(singles.size() > 0)
		{
			System.out.print(singles.remove(0));//0 used to be ind1
			
			if(ind1 != 3)
			{
				System.out.print(", ");
			}
			ind1++;
		}
		
		System.out.println();
		System.out.print("Doubles: ");
		int ind2 = 0;
		
		while(doubles.size() > 0)
		{
			System.out.print(doubles.remove(0)); //0 used to be ind2
			
			if(ind2 != 3)
			{
				System.out.print(", ");
			}
			ind2++;
		}
	}
}
