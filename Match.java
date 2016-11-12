import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

/**
This class is used to store the details of
a match taking place between two teams.

@author  various
@version 1.0
@since   2016-11-07
*/

public class Match
{
	/* instance variables */
    private Referee referee;
    private Team[] teams;
    private String venue;
    private Date schedule;
    private ArrayList<Integer> score;
    private Team winner;
    private Team loser;

    /**
	This serves as the constructor for our Match class.

	@param venue    The venue of the match
	@param schedule The time and date of the match
	@param referee  The referee assigned to the match
	@param teams    The two teams playing the match
	*/
    public Match(String venue, Date schedule, Referee referee, Team[] teams) 
    {
    	this.venue = venue;
    	this.schedule = schedule;
    	this.referee = referee;
    	this.teams = teams;
    	
    	score = new ArrayList<Integer>(Arrays.asList(0,0));
    }

    /**
	This method returns the referee of the match.

	@return Referee The referee of the match
	*/
    public Referee getReferee()
    {
    	return referee;
    }

    /**
	This method returns the first team of the match.

	@return String The name of the first team
	*/
    public String getTeam1()
    {
    	return teams[0].getName();
    }

    /**
	This method returns the second team of the match.

	@return String The name of the second team
	*/
    public String getTeam2()
    {
    	return teams[1].getName();
    }

    /**
	This method returns the venue of the match.

	@return String The venue of the match
	*/
    public String getVenue()
    {
    	return venue;
    }

    /**
	This method returns the date and time the match is
	scheduled to take place on.

	@return Date The schedule of the match
	*/
    public Date getSchedule()
    {
    	return schedule;
    }

    /**
	This method returns the current score of the match.

	@return String The score of the match
	*/
    public String getScore()
    {
    	StringBuilder str = new StringBuilder();
    	str.append(getTeam1());
    	str.append(" ");
    	str.append(score.get(0));
    	str.append("-");
    	str.append(score.get(1));
    	str.append(" ");
    	str.append(getTeam2());

    	return str.toString();
    }

    /**
	This method returns the winner of the match.

	@return Team The winner of the match
	*/
    public Team getWinner()
    {
    	return (score.get(0) > score.get(1)) ? teams[0] : teams[1];
    }

    /**
	This method returns the loser of the match.

	@return Team The loser of the match
	*/
    public Team getLoser() 
    {
    	return (score.get(0) < score.get(1)) ? teams[0] : teams[1];
    }

    /**
	This method updates the score of the match.
	This is to be used by the assigned referee.

	@param s1 The points for the first team
	@param s2 The points for the second team
	*/
 	public void updateScore(int s1, int s2)
 	{
 		score.set(0,s1);
 		score.set(1,s2);
 	}

}