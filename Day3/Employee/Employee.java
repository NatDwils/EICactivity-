
public class Employee{
    private String name;
    private String address;
    private String mobile;
     public Employee(String name, String address,String mobile) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }
    public void getdetails(){
        System.out.println("Employee Details");
        System.out.println("Name: "+name);
        System.out.println("address: "+address);
        System.out.println("mobile: "+mobile);
    }
}