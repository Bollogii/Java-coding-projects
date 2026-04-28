/*
 * Created on: Apr 21, 2025
 *
 * ULID: ojreic1
 * Class: IT 168 
 */
package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Olivia Reich;
 *
 */
public class MoreFiles
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			Scanner scan = new Scanner(new File("data.txt"));
			FileWriter fw = new FileWriter("numbers.txt", false);
			PrintWriter pw = new PrintWriter(fw);

			while (scan.hasNextInt())
			{
				int num = scan.nextInt();
				pw.println(num);
			}
			System.out.println("complete");
			scan.close();
			pw.close();

		} catch (FileNotFoundException fnfe)
		{
			System.err.println(fnfe.getMessage());
		} catch (IOException ioe)
		{
			System.err.println(ioe.getMessage());
		}

	}

}
