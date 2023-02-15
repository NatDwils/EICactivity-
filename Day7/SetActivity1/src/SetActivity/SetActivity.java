package SetActivity;

import java.util.*;

public class SetActivity {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of players: ");
		int n = sc.nextInt();
		
		Set<String> playersName = new HashSet<String>();
		
		System.out.println("Enter the players name: ");
		for (int i = 0; i <=n; i++) {
		    String name = sc.nextLine();
		    playersName.add(name);
		}
		
		
		
		for(String names : playersName) {
			System.out.println(names);
		}
		
	}
}
