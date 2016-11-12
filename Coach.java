/**
This class stores the details of a coach.

@author  various
@version 1.0
@since   2016-11-07
*/

public class Coach extends Person
{
	/**
	This serves as the constructor for our Coach class.
	In addition to the following parameters, it also sets
	the id of the coach based on the counter.

	@param name 	The coach's name
	@param email    The coach's email
	@param username The coach's account username
	@param password The coach's account password
	*/
  	public Coach(String name, String email, String username, String password)
  	{
		super(name, email, username, password);
  	}
}
