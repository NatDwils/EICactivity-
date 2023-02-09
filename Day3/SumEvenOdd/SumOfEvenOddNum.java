import java.util.*;
public class SumOfEvenOddNum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number elements: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid array size");
            System.exit(0);
        }else{
        int arr[]=new int[n];
        int sumEven=0,sumOdd=0;
            System.out.println("Enter list of elements: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<0){
                    System.out.println("Invalid Input");
                    System.exit(0);
                }else{
                    if(arr[i]%2==0){
                        sumEven+=arr[i];
                    }else{
                        sumOdd+=arr[i];
                    }

                }
            } 
            
                    if(sumEven>sumOdd){
                        System.out.println("Maximum of number is : "+sumEven);
                    }else{
                        System.out.println("Maximum of number is: "+sumOdd);
                    } 
        }       
    }
}