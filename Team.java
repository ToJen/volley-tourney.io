import java.util.ArrayList;

/**
This class is used to store the details of a team
registered in a volleyball tournament.

@author  various
@version 1.0
@since   2016-11-07
*/

public class Team
{
	/* instance variables */
    private String name;
    private Coach coach;
    private int rank;
    private ArrayList<String> players;

    /**
	This serves as the constructor for our Team class.

	@param name    The team's name
	@param coach   The coach of the team
	@param players The players on the team
	*/
    public Team(String name, Coach coach, ArrayList<String> players) 
    {
    	this.name = name;
    	this.coach = coach;
    	this.players = players;
    }

    /**
	This method returns the name of the team.

	@return String The team's name
	*/
    public String getName()
    {
    	return name;
    }

    /**
	This method returns the coach of the team.

	@return Coach The coach of the team
	*/
    public Coach getCoach()
    {
    	return coach;
    }

    /**
	This method returns the rank of the team.

	@return int The rank of the team
	*/
    public int getRank()
    {
    	return rank;
    }

    /**
	This method sets the rank of the team.

	@param rank The rank of the team
	*/
    public void setRank(int rank)
    {
    	this.rank = rank;
    }

    /**
	This method is used to specify how to print a Team object.

	@return String The string representation of a Team object
	*/
    public String toString()
    {
    	return players.toString();
    }

}
