/*
 * Created on: Apr 10, 2025
 *
 * ULID: ojreic1
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * driver class using both the Bicycle class and BicycleInventory class to make
 * a search engine of bikes.
 *
 * @author Olivia Reich;
 *
 */

public class BicycleDriver
{

	private static Scanner scan = new Scanner(System.in);
	private static BicycleInventory inventory = new BicycleInventory();

	public static void main(String[] args)
	{

		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Welcome, " + name + "!");

		inventory.generateInventory();

		Bicycle[] selectedBikes = new Bicycle[0];

		boolean running = true;
		while (running)
		{
			menuOptions();
			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();
			scan.nextLine(); // Consume newline

			if (choice == 1)
			{
				selectedBikes = processByWheelSize();
			}

			else if (choice == 2)
			{
				selectedBikes = processByType();
			}

			else if (choice == 3)
			{
				selectedBikes = processByGender();
			}

			else if (choice == 4)
			{
				selectedBikes = processByAssemble();
			}

			else if (choice == 5)
			{
				selectedBikes = processByAllCriteria();
			}

			else if (choice == 6)
			{
				outputList(inventory.getBikes());
			}

			else if (choice == 7)
			{
				running = false;
				System.out.println("Goodbye!");
			}

			else
			{
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void menuOptions()
	{
		System.out.println("1- List inventory by wheel size \r\n" + "2- List inventory by type \r\n"
				+ "3- List inventory by gender \r\n" + "4- List inventory by assembled \r\n"
				+ "5- List inventory by all criteria \r\n");
	}

	private static Bicycle[] processByWheelSize()
	{
		System.out.print("Enter the wheel size--29, 26, 20, or 16:");
		int temp = scan.nextInt();
		int wheelSize = 0;
		boolean correct = false;
		while (correct == false)
		{
			if (temp == 29 || temp == 26 || temp == 20 || temp == 16)
			{
				wheelSize = temp;
				correct = true;
			} else
			{
				System.out.print("invaliud wheel size, please choose again: ");
				temp = scan.nextInt();
			}
		}

		System.out.print("Enter number of bikes: ");
		int number = scan.nextInt();
		scan.nextLine();

		Bicycle[] bikes = inventory.getChoices(wheelSize, number);
		outputList(bikes);
		return bikes;
	}

	private static Bicycle[] processByType()
	{
		String type = determineType();

		System.out.print("Enter number of bikes: ");
		int number = scan.nextInt();
		scan.nextLine();

		Bicycle[] bikes = inventory.getChoices(type, number);
		outputList(bikes);
		return bikes;
	}

	private static Bicycle[] processByGender()
	{
		System.out.print("Enter gender (m/f): ");
		char gender = scan.next().charAt(0);

		System.out.print("Enter number of bikes: ");
		int number = scan.nextInt();
		scan.nextLine();

		Bicycle[] bikes = inventory.getChoices(gender, number);
		outputList(bikes);
		return bikes;
	}

	private static Bicycle[] processByAssemble()
	{
		System.out.print("Enter assembled status (true/false): ");
		boolean assembled = scan.nextBoolean();

		System.out.print("Enter number of bikes: ");
		int number = scan.nextInt();
		scan.nextLine();

		Bicycle[] bikes = inventory.getChoices(assembled, number);
		outputList(bikes);
		return bikes;
	}

	private static Bicycle[] processByAllCriteria()
	{
		System.out.print("Enter the wheel size--29, 26, 20, or 16:");
		int temp = scan.nextInt();
		int wheelSize = 0;
		boolean correct = false;
		while (correct == false)
		{
			if (temp == 29 || temp == 26 || temp == 20 || temp == 16)
			{
				wheelSize = temp;
				correct = true;
			} else
			{
				System.out.print("invaliud wheel size, please choose again: ");
				temp = scan.nextInt();
			}
		}

		String type = determineType();

		System.out.print("Enter gender (m/f): ");
		char gender = scan.next().charAt(0);

		System.out.print("Enter assembled status (true/false): ");
		boolean assembled = scan.nextBoolean();

		System.out.print("Enter number of bikes: ");
		int number = scan.nextInt();
		scan.nextLine(); // Consume newline

		Bicycle[] bikes = inventory.getChoices(type, wheelSize, assembled, gender, number);
		outputList(bikes);
		return bikes;
	}

	private static String determineType()
	{
		System.out.println("Select a bicycle type: \r\n" + "1- mountain \r\n" + "2- road \r\n" + "3- hybrid \r\n"
				+ "4- city \r\n" + "5- kids \r\n" + "6- tandem");

		int choice = scan.nextInt();
		scan.nextLine(); // Consume newline

		if (choice == 1)
		{
			return "mountain";
		} else if (choice == 2)
		{
			return "road";
		} else if (choice == 3)
		{
			return "hybrid";
		} else if (choice == 4)
		{
			return "city";
		} else if (choice == 5)
		{
			return "kids";
		} else if (choice == 6)
		{
			return "tandem";
		} else if (choice == 7)
		{
			return "BMX";
		} else
		{
			System.out.println("Invalid choice. Defaulting to 'road'.");
			return "road";
		}
	}

	private static void outputList(Bicycle[] bikes)
	{
		if (bikes == null || bikes.length == 0)
		{
			System.out.println("Not enough bikes found with the specified criteria.");
		}

		int i = 0;
		while (i < bikes.length)
		{
			if (bikes[i] != null)
			{
				System.out.println(bikes[i]);
			} else
			{
				System.out.println("Bike not found");
			}
			i++;
		}

	}
}
