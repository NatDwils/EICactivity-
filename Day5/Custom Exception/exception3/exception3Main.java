package exception3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        try{
	            System.out.println("Enter the Player Name:");
				String name =br.readLine().trim();
	            System.out.println("Enter the Player Age:");
				int age = Integer.parseInt(br.readLine().trim());

	            if(age<19){
	                throw new CustomException("Custom Exception : Invalid Age Range Exception");
	            }else{
	                System.out.println("Player name: " + name);
				    System.out.println("Player age: " + age);
	            }

	        }catch(CustomException | NumberFormatException | IOException  e){
	            System.out.println(e.getMessage());
	        }
	}

}
