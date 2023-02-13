import java.util.*;

public class MatchMain{

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the match format");
    System.out.println("1.ODI");
    System.out.println("2.T20");
    System.out.println("3.Test");
    int n=sc.nextInt();

    if(n==1){
        ODIMatch odimatch=new ODIMatch();
        System.out.println("Enter the Current Score:");
        int currentscore=sc.nextInt();
        odimatch.setcurrentscore(currentscore);
        System.out.println("Enter the Current Over:");
        float currentover=sc.nextFloat();
        odimatch.setcurrentover(currentover);
        System.out.println("Enter the Target Score:");
        int target=sc.nextInt();
        odimatch.settarget(target);
        double reqRunrate=odimatch.calulateRunRate();
        int balls=odimatch.caluculateBalls();
        odimatch.display(reqRunrate,balls);
    }else if(n==2){
        T20Match t20match =new T20Match();
        System.out.println("Enter the Current Score:");
        int currentscore=sc.nextInt();
        t20match.setcurrentscore(currentscore);
        System.out.println("Enter the Current Over:");
        float currentover=sc.nextFloat();
        t20match.setcurrentover(currentover);
        System.out.println("Enter the Target Score:");
        int target=sc.nextInt();
        t20match.settarget(target);
        double reqRunrate = t20match.calulateRunRate();
        int balls = t20match.caluculateBalls();
        t20match.display(reqRunrate,balls);
    }else if(n==3){
        TestMatch  testmatch=new TestMatch();
        System.out.println("Enter the Current Score:");
        int currentscore=sc.nextInt();
        testmatch.setcurrentscore(currentscore);
        System.out.println("Enter the Current Over:");
        float currentover=sc.nextFloat();
        testmatch.setcurrentover(currentover);
        System.out.println("Enter the Target Score:");
        int target=sc.nextInt();
        testmatch.settarget(target);
        double reqRunrate=testmatch.calulateRunRate();
        int balls=testmatch.caluculateBalls();
        testmatch.display(reqRunrate,balls);
    }else{
        System.out.println("Invalid Input");
        System.exit(0);
    }
}

}