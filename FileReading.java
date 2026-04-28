package edu.ilstu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReading
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		try
		{
			FileWriter fw = new FileWriter("poem.txt", false);
			PrintWriter pw = new PrintWriter(fw);

			String poemLine = "";

			System.out.print("please enter the first line of your Limerick: ");
			poemLine = scan.next();
			pw.println(poemLine);

			for (int i = 0; i < 4; i++)
			{
				System.out.print("\nplease enter the next line of your Limerick: ");
				poemLine = scan.next();
				pw.println(poemLine);
			}
			pw.close();
			scan.close();
		} catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}

	}

}
