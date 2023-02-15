package CompareList;

import java.util.*;

public class CompareList {

	public static void main(String args[]) {
		
		Scanner sc  = new Scanner(System.in);
		
		ArrayList<String> iPL14 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 14:");
		iPL14.add(sc.nextLine());
		iPL14.add(sc.nextLine());
		iPL14.add(sc.nextLine());
		iPL14.add(sc.nextLine());
		iPL14.add(sc.nextLine());
		
		ArrayList<String> iPL15 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 15:");
		iPL15.add(sc.nextLine());
		iPL15.add(sc.nextLine());
		iPL15.add(sc.nextLine());
		iPL15.add(sc.nextLine());
		iPL15.add(sc.nextLine());
		
		iPL15.retainAll(iPL14);        
		System.out.println("Consistent Scorer: "); 
		for(String name : iPL15) {
		System.out.println(name);  
		}
	}
	
}
