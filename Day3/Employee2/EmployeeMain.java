import java.util.*;
public class EmployeeMain{
    public static void main(String[] args){
        String name,address,mobile;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name : ");
        name=sc.nextLine();
        System.out.println("Enter the address : ");
        address=sc.nextLine();
        System.out.println("Enter the mobile : ");
        mobile=sc.nextLine();
        Employee employee = new Employee(name,address,mobile);
        employee.getdetails();
        int n;
        do{
        System.out.println("Varify and update details");
        System.out.println("Menu");
        System.out.println("1. Update Employee name"+"\n"+
        "2. Update Employee Address"+"\n"+
        "3. Update Employee mobile"+"\n"+
        "4. All information correct/Exit");
        n=sc.nextInt();
        sc.nextLine();
        switch(n)
        {
            case 1:System.out.println("Current name is: "+name);
                   System.out.println("Enter the name: ");
                   name=sc.nextLine();
                   break;
            case 2:System.out.println("Current address is: "+address);
                   System.out.println("Enter the address: ");
                   address=sc.nextLine();
                   break;
            case 3:System.out.println("Current mobile is: "+mobile);
                   System.out.println("Enter the mobile: ");
                   mobile=sc.nextLine();
                   break;
            case 4:System.out.println("The details are: ");
                   System.out.println("Name: "+name);
                   System.out.println("Address: "+address);
                   System.out.println("Mobile: "+mobile);
                   break;
            default: System.out.println("Invalid Input");
                    break;
        }
        }while(n!=4);
    }
}
