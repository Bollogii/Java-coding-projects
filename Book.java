package com.chateausylvania.libraryapp;

public class Book
{
	String isbn;
	String title;
	int numPages;
	String genre;
	boolean audio;
	char rating; // G=general, P=parental, M=mature, R=restricted, N=NC17
	Author author;

	// Autogenerate constructor(s)

	public Book()
	{

	}

	public Book(String isbn, String title, int numPages, String genre, boolean audio, char rating, Author author)
	{
		this.isbn = isbn;
		this.title = title;
		this.numPages = numPages;
		this.genre = genre;
		this.audio = audio;
		this.rating = rating;
		this.author = new Author(author.getAuthorID(), author.getName(), author.getBirthday(), author.getDateOfDeath(),
				author.getAddress());

	}

	// Autogenerate getters and setters

	/**
	 * @return the isbn
	 */
	public String getIsbn()
	{
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the numPages
	 */
	public int getNumPages()
	{
		return numPages;
	}

	/**
	 * @param numPages the numPages to set
	 */
	public void setNumPages(int numPages)
	{
		this.numPages = numPages;
	}

	/**
	 * @return the genre
	 */
	public String getGenre()
	{
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	/**
	 * @return the audio
	 */
	public boolean isAudio()
	{
		return audio;
	}

	/**
	 * @param audio the audio to set
	 */
	public void setAudio(boolean audio)
	{
		this.audio = audio;
	}

	/**
	 * @return the rating
	 */
	public char getRating()
	{
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(char rating)
	{
		this.rating = rating;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor()
	{
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author)
	{
		this.author = author;
	}

	@Override
	public String toString()
	{
		return "Book [isbn=" + isbn + ", title=" + title + ", numPages=" + numPages + ", genre=" + genre + ", audio="
				+ audio + ", rating=" + rating + ", author=" + author + "]";
	}

}
