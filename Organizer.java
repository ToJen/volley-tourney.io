/**
This class stores the details of a tournament organizer.

@author  various
@version 1.0
@since   2016-11-07
*/

public class Organizer extends Person
{
	/**
	This serves as the constructor for our Organizer class.
	In addition to the following parameters, it also sets
	the id of the organizer based on the counter.

	@param name 	The organizer's name
	@param email    The organizer's email
	@param username The organizer's account username
	@param password The organizer's account password
	*/
	public Organizer(String name, String email, String username, String password)
	{
		super(name, email, username, password);
  	}
}
