import java.io.*;

public class Exception1{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the total runs scored:");
			int runs = Integer.parseInt(br.readLine().trim());
			System.out.println("Enter the total overs faced:");
			int overs = Integer.parseInt(br.readLine().trim());
			int runRate = (int) runs/overs;
			System.out.println("Current Run Rate:" + runRate);
		}
		catch(IOException | NumberFormatException | ArithmeticException e) {
			System.out.println(e.getClass());
		}
	}

}