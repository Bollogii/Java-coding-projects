package com.chateausylvania.libraryapp;

public class Author
{
	int authorID;
	String name;
	String birthday;
	String dateOfDeath;
	Address address;

	// Autogenerate constructor(s)

	public Author()
	{

	}

	public Author(int authorID, String name, String birthday, String dateOfDeath, Address address)
	{
		this.authorID = authorID;
		this.name = name;
		this.birthday = birthday;
		this.dateOfDeath = dateOfDeath;
		this.address = new Address(address.getStreetNumber(), address.getStreetName(), address.getCity(),
				address.getCountry(), address.getPostcode());

	}

	// Autogenerate getters and setters
	/**
	 * @return the authorID
	 */
	public int getAuthorID()
	{
		return authorID;
	}

	/**
	 * @param authorID the authorID to set
	 */
	public void setAuthorID(int authorID)
	{
		this.authorID = authorID;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the birthday
	 */
	public String getBirthday()
	{
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday)
	{
		this.birthday = birthday;
	}

	/**
	 * @return the dateOfDeath
	 */
	public String getDateOfDeath()
	{
		return dateOfDeath;
	}

	/**
	 * @param dateOfDeath the dateOfDeath to set
	 */
	public void setDateOfDeath(String dateOfDeath)
	{
		this.dateOfDeath = dateOfDeath;
	}

	/**
	 * @return the address
	 */
	public Address getAddress()
	{
		return new Address(address.getStreetNumber(), address.getStreetName(), address.getCity(), address.getCountry(),
				address.getPostcode());
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address)
	{
		this.address = new Address(address.getStreetNumber(), address.getStreetName(), address.getCity(),
				address.getCountry(), address.getPostcode());
	}

	@Override
	public String toString()
	{
		return "Author [authorID=" + authorID + ", name=" + name + ", birthday=" + birthday + ", dateOfDeath="
				+ dateOfDeath + ", address=" + address + "]";
	}

}
