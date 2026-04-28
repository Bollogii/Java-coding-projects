package com.chateausylvania.libraryapp;

public class LIbrarian
{
	int employeeID;
	String name;
	String specialty;
	Address address;

	// Autogenerate constructor(s)

	public LIbrarian(int employeeID, String name, String specialty, Address address)
	{
		this.employeeID = employeeID;
		this.name = name;
		this.specialty = specialty;
		this.address = new Address(address.getStreetNumber(), address.getStreetName(), address.getCity(),
				address.getCountry(), address.getPostcode());
	}

	// Autogenerate getters and setters

	public int getEmployeeID()
	{
		return employeeID;
	}

	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSpecialty()
	{
		return specialty;
	}

	public void setSpecialty(String specialty)
	{
		this.specialty = specialty;
	}

	public Address getAddress()
	{
		return new Address(address.getStreetNumber(), address.getStreetName(), address.getCity(), address.getCountry(),
				address.getPostcode());
	}

	public void setAddress(Address address)
	{
		this.address = new Address(address.getStreetNumber(), address.getStreetName(), address.getCity(),
				address.getCountry(), address.getPostcode());
	}

}
