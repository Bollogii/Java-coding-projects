package edu.ilstu;

import java.util.Scanner;

public class March03
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		Address addr1 = new Address("Oakwood", "Geneva", "IL", "USA", "60134", 611);

		Customer cust1 = new Customer(123, "jane doe", addr1);

		System.out.print(cust1);
	}
}
