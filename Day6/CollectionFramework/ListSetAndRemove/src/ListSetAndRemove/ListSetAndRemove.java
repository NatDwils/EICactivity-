package ListSetAndRemove;

import java.util.*;

public class ListSetAndRemove {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> details = new ArrayList<String>();
		
		System.out.println("Enter the player details::");
		
		System.out.println("Enter player name: ");
		details.add(sc.nextLine());
		
		System.out.println("Enter age: ");
		details.add(sc.nextLine());
		
		System.out.println("Enter Country: ");
		details.add(sc.nextLine());
		
		System.out.println("Player Details: ");
		for (String detail : details) {
		  System.out.println(detail);
		}
		
		System.out.println("Enter Skill: ");
		String skill = sc.nextLine();
		
		System.out.println("Enter the position to add the skill: ");
		int position = sc.nextInt();
		details.add(position, skill);
		
		System.out.println("Player Details: ");
		for (String detail : details) {
		  System.out.println(detail);
		}
		
		System.out.println("Enter the position of the detail to be removed: ");
		position = sc.nextInt();
		details.remove(position);
		
		System.out.println("Player Details: ");
		for (String detail : details) {
			System.out.println(detail);
			
		}

		
	}

}
