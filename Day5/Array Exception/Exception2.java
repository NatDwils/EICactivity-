package Day5;

import java.io.*;;

public class Exception2 {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the number of overs:");
			int runs = Integer.parseInt(br.readLine().trim());
			System.out.println("Enter the number of runs for each over:");
			int runeach[] = new int[runs];
			for(int i =0; i<runs;i++) {
				runeach[i] = Integer.parseInt(br.readLine().trim());
			}
			System.out.println("Enter the over number:");
			int overs = Integer.parseInt(br.readLine().trim());
			
			System.out.println("Run scored in this over:" + runeach[overs-1]);
		}
		catch(IOException | NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass());
		}
    }
}
