import java.util.*;
public class CrickterId{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        if(n<0){
            System.out.println("Invalid array size");
            System.exit(0);
        }
        System.out.println("Enter Crickter id and score: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<0){
                    System.out.println("Invalid Input");
                    System.exit(0);
                }
            }
        System.out.println("Enter given max score: ");
        int score=sc.nextInt();
        if(score<0){
            System.out.println("Invalid Score");
            System.exit(0);
        }else{
            for(int i=1;i<n;i++){
                if(arr[i]>score){
                    System.out.println(arr[i-1]);
                }
                i++;
            }
        }

    }
}