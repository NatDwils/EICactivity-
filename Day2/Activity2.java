import java.util.*;
public class Activity2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num =sc.nextInt();
        if(num<0){
            System.out.println("Number too small");
        }else
        if(num>32767){
            System.out.println("Number too large");
        }else
        if(num%2==0){
            System.out.println("Yes");
        }else
        {
            System.out.println("No");
        }
    }
}