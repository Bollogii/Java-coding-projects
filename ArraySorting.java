package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Program that works with arrays of integers including sorting and merging
 * sorted arrays
 * 
 * @author Mary Elaine Califf and Olivia Reich and Nelofar Iqbalzada
 *
 */
public class ArraySorting
{
	/**
	 * This method read the Array from the file. than store it as an array.
	 * 
	 * @param theArray
	 * @param inputFileName
	 * @return the array length.
	 */
	public static int readArray(int[] theArray, String inputFileName)
	{
		int i = 0;
		try
		{
			Scanner scan = new Scanner(new File(inputFileName));

			while (scan.hasNextInt() && i < theArray.length)
			{
				theArray[i] = scan.nextInt();
				i++;
			}
			return i;
		}

		catch (FileNotFoundException fnfe)
		{
			fnfe.getMessage();
		}
		return i;
	}

	// read the contents of the specified file into theArray and return the number
	// of elements read
	// you may assume that the array will be big enough
	// you must handle relevant exceptions

	/**
	 * this method use the selection sort algorithm on the array.
	 * 
	 * @param theArray
	 * @param numValues
	 */
	public static void selectionSort(int[] theArray, int numValues)
	{

		for (int i = 0; i < numValues - 1; i++)
		{
			int minIndex = i;
			for (int j = i + 1; j < numValues; j++)
			{
				if (theArray[j] < theArray[minIndex])
				{
					minIndex = j;

				}
			}
			int temp = theArray[minIndex];
			theArray[minIndex] = theArray[i];
			theArray[i] = temp;
		}

	}

	/**
	 * this methods prints the array method.
	 * 
	 * @param theArray
	 * @param numValues
	 * @param outputFileName
	 */
	public static void writeArray(int[] theArray, int numValues, String outputFileName)
	{

		try
		{
			PrintWriter pw = new PrintWriter(outputFileName);
			for (int i = 0; theArray[i] != 0; i++)
			{
				pw.println(theArray[i]);

			}
			pw.close();
		} catch (FileNotFoundException e)
		{

			e.printStackTrace();
		}

		// write the first numValues elements of theArray to the specified file
		// you must handle relevant exceptions

	}

	/**
	 * 
	 * @param arr1
	 * @param size1
	 * @param arr2
	 * @param size2
	 * @param mergedArr
	 * @return
	 */
	public static int mergeArrays(int[] arr1, int size1, int[] arr2, int size2, int[] mergedArr)
	{

		int index1 = 0;
		int index2 = 0;
		int mergedCount = 0;

		while (index1 < size1 && index2 < size2)
		{
			if (arr1[index1] <= arr2[index2])
			{
				mergedArr[mergedCount] = arr1[index1];
				index1++;

			} else
			{
				mergedArr[mergedCount] = arr2[index2];
				index2++;

			}
			mergedCount++;

		}
		while (index1 < size1)
		{
			mergedArr[mergedCount] = arr1[index1];
			index1++;
			mergedCount++;

		}

		while (index2 < size2)
		{
			mergedArr[mergedCount] = arr2[index2];
			index2++;
			mergedCount++;
		}
		return mergedCount;

	}

	public static void main(String[] args)
	{
		// Test just the reading and writing -- check contents of numbersout.txt
		int[] array1 = new int[100];
		int numElems1 = readArray(array1, "numbers.txt");
		writeArray(array1, numElems1, "numbersout.txt");

		// Test the sorting -- check contents of sortedout.txt
		selectionSort(array1, numElems1);
		writeArray(array1, numElems1, "sortedout.txt");

		// Read second array and test merging -- check contents of mergedout.txt
		int[] array2 = new int[100];
		int numElems2 = readArray(array2, "numbers2.txt");
		int[] array3 = new int[200];
		int numElems3 = mergeArrays(array1, numElems1, array2, numElems2, array3);
		writeArray(array3, numElems3, "mergedout.txt");

	}
}
