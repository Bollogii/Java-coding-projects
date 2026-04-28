package edu.ilstu;

public class Customer
{
	private int custID;
	private String name;
	private Address address;

	public Customer(int customerID, String custName, Address address)
	{
		this.custID = customerID;
		this.name = custName;
		this.address = address;
	}

	public int getCustID()
	{
		return custID;
	}

	public void setCustID(int custID)
	{
		this.custID = custID;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Customer [custID= " + custID + ",\n name= " + name + ",\n address= " + address + "]";
	}

}
