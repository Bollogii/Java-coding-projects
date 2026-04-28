package com.chateausylvania.libraryapp;

public class MainLibraryApplication
{

	public static void main(String[] args)
	{

		Address address3 = new Address(11, "Lincoln Street", "Cambridge", "UK", "ABCD 123");
		Author dickens1 = new Author(98882, "Charles Dickens", "7-February-1812", "9-June-1870", address3);
		Address address1 = new Address(10, "Downing Street", "London", "UK", "SW1A 2AA");
		Address address2 = new Address(15, "Westwood Circle", " Birmingham", "UK", "XYZ 987");
		LIbrarian librarian1 = new LIbrarian(2232, "Libby the Librarian", "engineering", address2);
		Book book1 = new Book("5438156794", "Great Expectation", 312, "drama", false, 'P', dickens1);
		Library library1 = new Library(202, "Franklin Library", book1, address1, librarian1);

		System.out.println(library1);
		System.out.println(librarian1);
		System.out.println(book1);
		System.out.println(dickens1);

		address1.setPostcode("a different postcode");
		address2.setStreetName("new Street");
		address3.setCity("Portsmouth");

		System.out.println("\n" + library1);
		System.out.println(librarian1);
		System.out.println(book1);
		System.out.println(dickens1);

		/**
		 * 
		 * Write statements to print the Library, Librarian, Book and Author you just
		 * created.
		 * 
		 * Run the program and take a screenshot of the console.
		 * 
		 * Make the following additions to your MainLibraryApplications
		 * 
		 * Change the postcode of address1 to something else
		 * 
		 * Change the streetName of address2 to something else
		 * 
		 * Change the city of address3 to Portsmouth.
		 * 
		 * Add print statements to print out the Library, Librarian, Book and Author
		 * again.
		 * 
		 * Run the program again, and take a screenshot of the console.
		 * 
		 * Paste both screenshots into a Word document, and provide an explanation of
		 * the results
		 * 
		 * Submit to the link in the assignment in Module 10. It's worth 50 points.
		 * 
		 */
	}

}
