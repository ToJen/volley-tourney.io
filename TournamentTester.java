import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
The purpose of this class is to simply serve as a tester for our volleyball 
tournament system. It aims to show the executable architecture.

@author  various
@version 1.0
@since   2016-11-07 
*/

public class TournamentTester
{
	public static void main(String[] args) 
	{
		System.out.println("Simulating tournament creation...\n");
		Organizer org = new Organizer("John Doe", "jdoe@email.com", "john", "jdoe");
		Tournament tourney = new Tournament(org, "Tourney", 2, Tournament.Format.DIVISIONS);

		System.out.println("New tournament created!");
		System.out.println(tourney);
		System.out.println("");

		System.out.println("Simulating registration...\n");
		Coach coach1 = new Coach("Donald Trump", "dtrump69@email.com", "trump", "kitty");

		ArrayList<String> trumpTeam = new ArrayList<String> (Arrays.asList("donald", "eric", "tiffany", "ivanka", "melania", "john"));
		Team trump = new Team("Trumps", coach1, trumpTeam);
		tourney.registerTeam(trump);

		System.out.println("Coach " + coach1.getName() + " has registered their team: " + trump);

		Coach coach2 = new Coach("Hillary Clinton", "hclinton@email.com", "hillary", "flotus");

		ArrayList<String> clintonTeam = new ArrayList<String> (Arrays.asList("bill", "john", "jane", "dave", "peter", "lebron"));
		Team clinton = new Team("Clintons", coach2, clintonTeam);
		tourney.registerTeam(clinton);

		System.out.println("Coach " + coach2.getName() + " has registered their team: " + clinton + "\n");

		System.out.println("Simulating match creation...\n");

		Referee ref = new Referee("John Oliver", "oliver@mail.com", "oliver", "rigged");

		Date date = new GregorianCalendar(2016, Calendar.DECEMBER, 12).getTime();
		Team[] teams = {trump, clinton};

		Match match = new Match("CBS", date, ref, teams);

		System.out.println("Match has been set between " + trump.getName() + " and " + clinton.getName() + "!\n");

		System.out.println("Simulating updating of score and final results...\n");

		match.updateScore(20,25);

		System.out.println(match.getScore());
		System.out.println(match.getWinner().getName() + " won!");
	}
}