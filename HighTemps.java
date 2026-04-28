/*
 * Created on: Apr 18, 2025
 *
 * ULID: ojreic1
 * Class: IT 168 
 */
package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * reads file for temperatures and records occurrences.
 *
 * @author Olivia Reich and George Walker;
 *
 */
public class HighTemps
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc = null;
		int[] tempCount = new int[151];
		try
		{
			sc = new Scanner(new File("temps.txt"));
			while (sc.hasNextInt())
			{
				int temp;
				temp = sc.nextInt();
				tempCount[temp + 40]++;
			}
		} catch (FileNotFoundException fnfe)
		{
			System.out.println(fnfe.getMessage());

		}
		System.out.println("Temperatures\tNumber of Days");
		for (int i = 0; i < tempCount.length; i++)
		{
			if (tempCount[i] > 0)
			{
				System.out.println((i - 40) + "\t\t" + tempCount[i]);
			}
		}
	}

}
