package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LogFileAnalyzerScanner
{
	public static void main(String[] args)
	{
		// Initialize counters for INFO and ERROR
		int infoCount = 0;
		int errorCount = 0;
		int total = 0;
		double percentInfo;
		double percentError;
		String errorType = "";
		try
		{
			// Define input and output file names
			Scanner scan = new Scanner(new File("server_log.txt"));
			FileWriter fw = new FileWriter("log_summary.txt", false);
			PrintWriter pw = new PrintWriter(fw);

			// Use Scanner to read the input file line-by-line
			while (scan.hasNextLine())
			{
				String line = scan.nextLine();

				// Count occurrences of [INFO] and [ERROR]
				if (line.contains("INFO"))
				{
					infoCount++;
					total++;
				}
				if (line.contains("ERROR"))
				{
					errorCount++;
					total++;
					// adds the line the error occurred on and the error message associated to a
					// string to print later
					errorType += "\nError message on line " + total + " is: " + line.substring(8);

				}

			}
			// Write the summary to the output file
			percentInfo = (double) infoCount / total;
			percentError = (double) errorCount / total;
			pw.println("[INFO] instances: " + infoCount + " Percent: " + percentInfo + "%");
			pw.println("[ERROR] instances: " + errorCount + " Percent: " + percentError + "%");
			pw.println(errorType);

			System.out.println("[INFO] instances: " + infoCount + " [ERROR] instances: " + errorCount + errorType
					+ " Find summary in log_summary.txt");
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
/**
 *  for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
 */
}
