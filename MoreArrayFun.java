/*
 * Created on: Apr 18, 2025
 *
 * ULID: ojreic1
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * driver class that uses the ArrayManager class
 *
 * @author Olivia Reich and George Walker;
 *
 */
public class MoreArrayFun
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayManager array1 = new ArrayManager();

		array1.fillArray();

		System.out.println("The smallest in array is: " + array1.findSmallest());
		System.out.println("The largest in array is: " + array1.findLargest());

		System.out.print("Please enter values (-999 to quit): ");
		int val = scan.nextInt();

		while (val != -999)
		{
			int index = array1.findIndex(val);
			if (index != -1)
			{
				System.out.println("The index  of your number is: " + array1.findIndex(val));
			} else
			{
				System.out.println("Number not found");
			}
			System.out.print("Please enter values (-999 to quit): ");
			val = scan.nextInt();
		}
	}

}
