import java.util.*;
public class InningsMain{
    public static void main(String[] args){
        String teamname,inningsname;
        int runs;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the team name : ");
        teamname=sc.nextLine();
        System.out.println("Enter the session : ");
        inningsname=sc.nextLine().toLowerCase();
        if(! inningsname.matches("first|second")){
            System.out.println("Invalid Session");
            System.exit(0);
        }
        System.out.println("Enter the Score : ");
        runs=sc.nextInt();
        Innings innings = new Innings(teamname,inningsname,runs);
        innings.displayInningsDetails();
        
    }
}