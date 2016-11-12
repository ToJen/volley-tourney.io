/**
This class stores the details of a referee.

@author  various
@version 1.0
@since   2016-11-07
*/

public class Referee extends Person
{
	/**
	This serves as the constructor for our Referee class.
	In addition to the following parameters, it also sets
	the id of the referee based on the counter.

	@param name 	The referee's name
	@param email    The referee's email
	@param username The referee's account username
	@param password The referee's account password
	*/
	public Referee(String name, String email, String username, String password)
 	{
    	super(name, email, username, password);
  	}
}
