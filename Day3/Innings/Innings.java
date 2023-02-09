
public class Innings{
    private String teamname;
    private String inningsname;
    private int runs;
     public Innings(String teamname, String inningsname,int runs) {
        this.teamname = teamname;
        this.inningsname = inningsname;
        this.runs = runs;
    }
    public void displayInningsDetails(){
        System.out.println("Employee Details");
        System.out.println("Name: "+teamname);
        System.out.println("Scored: "+runs);
        if(inningsname.equalsIgnoreCase("FIRST")){
        System.out.println("Needed "+(runs+1)+" to win");
        }else if(inningsname.equalsIgnoreCase("SECOND")){
            System.out.println("Match ended.");
        }else{
            System.exit(0);
        }
    }
}