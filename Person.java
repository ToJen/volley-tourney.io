/**
This class serves as a superclass for Organizer, 
Coach and Referee classes. It is mainly used to 
store and retrieve data for each of them, and to 
specify their roles in the tournament system.

@author  various
@version 1.0
@since   2016-11-07
*/

public class Person
{
	/* instance variables */
	private String name;
	private int id;
	private String email;
	private String username;
	private String password;

	// counter to determine id of the object
	private static int count = 0;

	/**
	This serves as the constructor for our Person class.

	@param name 	The person's name
	@param email    The person's email
	@param username The person's account username
	@param password The person's account password
	*/
	public Person(String name, String email, String username, String password)
	{
		this.name = name;
		this.id = count++;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	/**
	This method returns the name of the person.

	@return String The person's name
	*/
	public String getName()
	{
		return name;
	}

	/**
	This method returns the ID of the person.

	@return String The person's ID
	*/
	public int getID()
	{
		return id;
	}
	
	/**
	This method returns the email of the person.

	@return String The person's email
	*/
	public String getEmail()
	{
		return email;
	}

	/**
	This method returns the account username of the person.

	@return String The person's account username
	*/
	public String getUsername()
	{
		return username;
	}
	
	/**
	This method returns the account password of the person.

	@return String The person's account password
	*/
	public String getPassword()
	{
		return password;
	}
}