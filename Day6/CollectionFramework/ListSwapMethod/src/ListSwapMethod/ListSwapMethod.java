package ListSwapMethod;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class ListSwapMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> teamName = new ArrayList<String>();
		System.out.println("Enter Team Names :");
		teamName.add(sc.nextLine());
		teamName.add(sc.nextLine());
		teamName.add(sc.nextLine());
		teamName.add(sc.nextLine());
		teamName.add(sc.nextLine());
		
		System.out.println("Enter Swap Positions :");
		int p1=sc.nextInt();
		int p2=sc.nextInt();
		
		Collections.swap(teamName, p1, p2);
		
		System.out.println("Final Result :");
		for(String teamNames : teamName) {
			
        System.out.println(teamNames);
		
		}
		

	}

}
