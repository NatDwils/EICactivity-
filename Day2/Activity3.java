import java.util.*;
public class Activity3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0,a;
        System.out.println("Enter Number:");
        int num =sc.nextInt();
        if(num<0||num>32767){
            System.out.println("Invalid Input");
        }else{
            while(num!=0){
                a=num%10;//last digit
                num=num/10;//removing last digit
                if(a%2!=0){
                    sum+=a;
                }

            }
            System.out.println("Sum of odd number:"+sum);
        }
    }
}