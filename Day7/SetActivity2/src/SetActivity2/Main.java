package SetActivity2;

import java.util.*;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter the number of matches: ");
		int n = sc.nextInt();
		
		List<Match> matches = new ArrayList<>();
		
		for(int i =0; i<n; i++) {
			   System.out.println("Enter match date in (yyyy-MM-dd)");
	            String matchDateString = sc.next();
	            System.out.println("Enter Team 1");
	            String teamOne = sc.next();
	            System.out.println("Enter Team 2");
	            String teamTwo = sc.next();

	            LocalDate matchDate = LocalDate.parse(matchDateString);
	            Match match = new Match(matchDate, teamOne, teamTwo);
	            matches.add(match);
	}
		
		Collections.sort(matches);

     System.out.println("Match Details");
     for (Match match : matches) {
         System.out.println(match);
     }
		

	}

}
