import java.util.*;
public class Activity1{
    public static void main(String[] args){
        int salary;
        int numOfShifts;
        double saving;
        double food,travel,shift;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary:");
        salary =sc.nextInt();
        System.out.println("Enter Number of shifts:");
        numOfShifts =sc.nextInt();

        if(salary > 8000)
        {
            System.out.println("Salary too large");
        }else
        if(numOfShifts <= 0)
        {
            System.out.println("Shift too small");
        }else
        if(salary < 0)
        {
            System.out.println("Salary too small");
        }
        else
        {
            food =(0.2*salary);  
            travel =(0.3*salary);
            shift =(0.02*salary)*numOfShifts;
            saving = salary - food - travel + shift;
            System.out.println("Savings: "+saving);
        }

    }
}