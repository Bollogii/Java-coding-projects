package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * this class manages array through methods
 * 
 * @author Mary Elaine Califf and George Walker and Olivia Reich;
 *
 */
public class ArrayManager
{
	// declare instance variables here
	private int count;
	private int[] intArray;

	public ArrayManager()
	{
		this.intArray = new int[100];
		this.count = 0;
	}

	public void fillArray()
	{
		int curVal;

		Scanner input = null;
		try
		{
			input = new Scanner(new File("data.txt"));
			this.count = 0;

			while (input.hasNextInt() && count < intArray.length)
			{
				curVal = input.nextInt();
				intArray[count] = curVal;
				count++;

			}
			input.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("Could not find data.txt file");
			System.exit(1);
		}
	}

	public int findSmallest()
	{

		int small = 0;
		for (int i = 0; i < intArray.length; i++)
		{
			small = intArray[i];
			for (int j = 0; j < intArray.length; j++)
			{
				if (small > intArray[j])
				{
					small = intArray[j];
				}
			}

		}
		return small;
	}

	public int findLargest()
	{

		int large = 0;
		for (int i = 0; i < intArray.length; i++)
		{
			large = intArray[i];
			for (int j = 0; j < intArray.length; j++)
			{
				if (large < intArray[j])
				{
					large = intArray[j];
				}
			}

		}
		return large;
	}

	public int findIndex(int target)
	{

		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] == target)
			{

				return i;
			}

		}
		return -1;
	}

}
