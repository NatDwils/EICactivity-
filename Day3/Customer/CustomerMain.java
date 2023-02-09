import java.util.*;
public class CustomerMain{
    public static void main(String[] args){
        String detail,name,address,mobile;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Details: ");
        detail=sc.nextLine();
      
        String arr[] = detail.split(","); 
        
        name= arr[0];
        address= arr[1];
        mobile= arr[2];
        Customer customer = new Customer(name,address,mobile);
        customer.getdetails();
        
    }
}
