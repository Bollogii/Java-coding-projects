/*
 * Created on: Apr 1, 2025
 *
 * ULID: ojreic1
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * a class for bicycle objects
 *
 * @author Olivia Reich;
 *
 */
public class Bicycle
{
	private String type;
	private int wheelSize;
	private boolean assembled;
	private char gender;

	/**
	 * 
	 * @param type
	 * @param wheelSize
	 * @param assembled
	 * @param gender
	 * 
	 *                  constructor that takes all variables listed
	 */

	public Bicycle(String type, int wheelSize, boolean assembled, char gender)
	{
		this.type = type;
		this.wheelSize = wheelSize;
		this.assembled = assembled;
		this.gender = gender;

	}

	/**
	 * 
	 * @param bike
	 * 
	 *             constructor that uses the bicycle object
	 */
	public Bicycle(Bicycle bike)
	{
		this.type = bike.type;
		this.wheelSize = bike.wheelSize;
		this.assembled = bike.assembled;
		this.gender = bike.gender;

	}

	/**
	 * getter for types
	 * 
	 * @return returns types
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * setter for type
	 * 
	 * @param type
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * getter for wheel size
	 * 
	 * @return returns wheel size
	 */
	public int getWheelSize()
	{
		return wheelSize;
	}

	/**
	 * setter for wheel size
	 * 
	 * @param new wheel size
	 */
	public void setWheelSize(int wheelSize)
	{
		this.wheelSize = wheelSize;
	}

	/**
	 * getter for assembled
	 * 
	 * @return returns if assembled
	 */
	public boolean isAssembled()
	{
		return assembled;
	}

	/**
	 * setter for assembled
	 * 
	 * @param assembled
	 */
	public void setAssembled(boolean assembled)
	{
		this.assembled = assembled;
	}

	/**
	 * getter for gender
	 * 
	 * @return returns gender
	 */
	public char getGender()
	{
		return gender;
	}

	/**
	 * setter for gender
	 * 
	 * @param gender
	 */
	public void setGender(char gender)
	{
		this.gender = gender;
	}

	/**
	 * toString method
	 * 
	 * @Override
	 */
	public String toString()
	{
		String genderStr = (gender == 'm') ? "Male" : "Female";
		return "Type: " + type + " Wheel Size: " + wheelSize + " Assembled: " + assembled + " Gender: " + genderStr;
	}

}
