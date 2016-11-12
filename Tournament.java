import java.util.ArrayList;

/**
This class is the foundation of our volleyball tournament system.
The class has many responsibilities such as holding tournament details, 
registration of teams and setting of brackets according to the chosen
format.

@author  various
@version 1.0
@since   2016-11-07
*/

public class Tournament
{
	/* instance variables */
	private ArrayList<Match> matches;
	private ArrayList<Team> teams;
	private Organizer organizer;
	private String name;
	private int id;
	private Format format;
	private int numTeams;

	// counter to determine id of the object
	private static int count = 0;

	/**
	This enum is used to store the available formats of a 
	volleyball tournament in our system.
	*/
	public enum Format
	{
		DIVISIONS, ROUND_ROBIN, DOUBLE_ELIMINATION;
	}

	/**
	This serves as the constructor for our Tournament class.

	@param organizer The organizer of the tournament
	@param name      The name of our tournament
	@param numTeams  The number of teams allowed for registration
	@param format    The format of the tournament
	*/
	public Tournament(Organizer organizer, String name, int numTeams, Format format)
	{
		this.id = count++;
		this.organizer = organizer;
		this.name = name;
		this.numTeams = numTeams;
		this.format = format;
		this.teams = new ArrayList<Team>(numTeams);
	}

	/**
	This method returns the name of the tournament.

	@return String The tournament name
	*/
	public String getName()
	{
		return name;
	}

		/**
	This method returns the id of the tournament.

	@return int The tournament ID
	*/
	public int getID()
	{
		return id;
	}

	/**
	This method returns all matches to be played in the tournament.

	@return ArrayList<Match> The tournament matches
	*/
	public ArrayList<Match> getMatches()
	{
		return matches;
	}

	/**
	This method returns the teams registered in the tournament.

	@return ArrayList<Team> The registered teams
	*/
	public ArrayList<Team> getTeams()
	{
		return teams;
	}

	/**
	This method returns the number of teams registered.

	@return int The number of registered teams
	*/
	public int getNumTeams()
	{
		return numTeams;
	}

	/**
	This method returns the organizer of the tournament.

	@return Organizer The tournament organizer
	*/
	public Organizer getOrganizer()
	{
		return organizer;
	}

	/**
	This method returns the format of the tournament.

	@return String The tournament format
	*/
	public String getFormat()
	{
		switch(format)
		{
			case DIVISIONS:
				return "Divisions";
			case ROUND_ROBIN:
				return "Round Robin";
			default:
				return "Double Elimination";
		}
	}

	/**
	This method is used to set the brackets of the tournament,
	based on the format of the tournament.
	*/
	/*public void setBracket(Format format, Match match) 
	{
		// to be completed in project development
	}*/

	/**
	This method is used to register a team into the tournament.

	@param team The team to be registered
	*/
	public void registerTeam(Team team) 
	{
		teams.add(team);
	}

	/**
	This method is used to specify how to print a Tournament object.

	@return String The string representation of a Tournament object
	*/
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		str.append("Name: ");
		str.append(this.getName());
		str.append("\nOrganizer: ");
		str.append(this.getOrganizer().getName());
		str.append("\nNo. of Teams: ");
		str.append(this.getNumTeams());
		str.append("\nFormat: ");
		str.append(this.getFormat());
		str.append("\n");

		return str.toString();
	}

}
