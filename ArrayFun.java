/*
 * Created on: Apr 4, 2025
 *
 * ULID: ojreic1
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <insert class description here>
 *
 * @author Olivia Reich, Andrew Babb and George walker;
 *
 */
import java.util.Scanner;

public class ArrayFun

{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] array = new int[100];
		int arrayLength = fillArray(array, scan);

		System.out.println("\nNumber of values entered into the array: " + arrayLength);

		System.out.print("Product of the array elements: " + computeProduct(array, arrayLength));
		System.out.print("\nEnter an integer to check for multiples: ");
		int factor = scan.nextInt();
		System.out.println("Numbers of muntilpes of " + factor + ": " + countMultiples(array, arrayLength, factor));
		System.out.println("The array values: " + printArray(array, arrayLength));

	}

	private static int fillArray(int[] array, Scanner scan)
	{
		int count = 0, value = 0;
		System.out.print("Please enter an integer or -999 to stop: ");
		value = scan.nextInt();

		while (value != -999)
		{
			array[count] = value;
			count++;
			System.out.print("Please enter an integer or -999 to stop: ");
			if (value != -999)
			{
				value = scan.nextInt();
			}
		}
		return count;
	}

	private static int computeProduct(int[] array, int arrayLength)
	{
		int total = 1;
		for (int i = 0; i < arrayLength; i++)
		{
			total *= array[i];

		}
		return total;
	}

	private static int countMultiples(int[] array, int num, int factor)
	{
		int countFactor = 0;
		for (int i = 0; i < num; i++)
		{
			if (array[i] % factor == 0)
			{
				countFactor++;
			}
		}
		return countFactor;
	}

	private static String printArray(int[] array, int num)
	{
		String arrayPrint = "";
		for (int i = 0; i < num; i++)
		{
			arrayPrint = arrayPrint + "\n" + (array[i]);
		}
		return arrayPrint;
	}
}
