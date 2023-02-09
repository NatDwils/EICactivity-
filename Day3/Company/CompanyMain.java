import java.util.*;
public class CompanyMain{
    public static void main(String[] args){
        String detail,name,employees,teamlead;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Company Name: ");
        name=sc.nextLine();
        System.out.println("Enter Team Name: ");
        detail=sc.nextLine();
        String arr[] = detail.split(","); 
        System.out.println("Enter Team Lead: ");
        teamlead=sc.nextLine();
        if(Arrays.stream(arr).anyMatch(teamlead::equals)){
                    Company company = new Company(name,detail,teamlead);
                    company.getdetails();
                }
               else {
                 System.out.println("Invalid Input");
        }
        
    }
}
