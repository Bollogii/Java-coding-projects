package edu.ilstu;

public class Address
{

	private String streetName;
	private String city;
	private String state;
	private String country;
	private String postalCode;

	private int streetNum;

	public Address(String streetName, String city, String state, String country, String postalCode, int streetNum)
	{
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.streetNum = streetNum;
	}

	public String getStreetName()
	{
		return streetName;
	}

	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}

	public int getStreetNum()
	{
		return streetNum;
	}

	public void setStreetNum(int streetNum)
	{
		this.streetNum = streetNum;
	}

	@Override
	public String toString()
	{
		return "streetName=" + streetName + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", postalCode=" + postalCode + ", streetNum=" + streetNum;
	}

}
