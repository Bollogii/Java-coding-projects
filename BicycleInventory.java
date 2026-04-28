/*
 * Created on: Apr 9, 2025
 *
 * ULID: ojreic1
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Random;

/**
 * class to fill the inventory with bicycle objects
 *
 * @author Olivia Reich;
 *
 */
public class BicycleInventory

{
	private Bicycle[] bicycles;
	private int arraySize;

	/**
	 * Default constructor
	 */
	public BicycleInventory()
	{
		bicycles = new Bicycle[100];
		arraySize = 0;
	}

	/**
	 * fills an array with randomly generated bicycle objects
	 */
	public void generateInventory()
	{
		Random rand = new Random();

		String[] types = { "mountain", "road", "hybrid", "city", "kids", "tandem", "BMX" };
		int[] wheelSizes = { 29, 26, 20, 16 };
		char[] genders = { 'm', 'f' };

		for (int i = 0; i < 25; i++)
		{
			String type = types[rand.nextInt(types.length)];
			int wheelSize = wheelSizes[rand.nextInt(wheelSizes.length)];
			boolean assembled = rand.nextBoolean();
			char gender = genders[rand.nextInt(genders.length)];
			bicycles[arraySize++] = new Bicycle(type, wheelSize, assembled, gender);
		}
	}

	/**
	 * 
	 * @param type
	 * @param number
	 * @return
	 * 
	 *         returns the bikes matching the type criteria
	 */
	public Bicycle[] getChoices(String type, int number)
	{
		return getChoices(type, -1, false, ' ', number);
	}

	/**
	 * 
	 * @param wheelSize
	 * @param number
	 * @return
	 * 
	 *         returns the bikes matching the wheel size criteria
	 */
	public Bicycle[] getChoices(int wheelSize, int number)
	{
		return getChoices(null, wheelSize, false, ' ', number);
	}

	/**
	 * 
	 * @param assembled
	 * @param number
	 * @return returns the bikes matching the assembled criteria
	 */

	public Bicycle[] getChoices(boolean assembled, int number)
	{
		return getChoices(null, -1, assembled, ' ', number);
	}

	/**
	 * 
	 * @param gender
	 * @param number
	 * @return returns the bikes matching the gender criteria
	 */
	public Bicycle[] getChoices(char gender, int number)
	{
		return getChoices(null, -1, false, gender, number);
	}

	/**
	 * 
	 * @param type
	 * @param wheelSize
	 * @param assembled
	 * @param gender
	 * @param number
	 * @return
	 * 
	 *         returns the bikes matching all criteria in parameters
	 */

	public Bicycle[] getChoices(String type, int wheelSize, boolean assembled, char gender, int number)
	{
		Bicycle[] result = new Bicycle[number];
		int count = 0;

		for (int i = 0; i < arraySize && count < number; i++)
		{
			Bicycle bike = bicycles[i];
			if ((type == null || bike.getType().equals(type)) && (wheelSize == -1 || bike.getWheelSize() == wheelSize)
					&& (gender == ' ' || bike.getGender() == gender) && (assembled == bike.isAssembled()))
			{
				result[count++] = bike;
			}
		}

		return result;
	}

	/**
	 * getter for bikes
	 * 
	 * @return returns the bicycle object at a given index
	 */

	public Bicycle[] getBikes()
	{
		Bicycle[] copy = new Bicycle[arraySize];
		for (int i = 0; i < arraySize; i++)
		{
			copy[i] = bicycles[i];
		}
		return copy;
	}

	/**
	 * getter for size
	 * 
	 * @return size of array
	 */
	public int getSize()
	{
		return arraySize;
	}
}
