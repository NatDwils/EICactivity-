
public class Company{
    private String name;
    private String employees;
    private String teamlead;
     public Company(String name, String employees,String teamlead) {
        this.name = name;
        this.employees = employees;
        this.teamlead = teamlead;
    }
    public void getdetails(){
        System.out.println("Company Name: "+name);
        System.out.println("Team Member: "+employees);
        System.out.println("TeamLead: "+teamlead);
    }
}