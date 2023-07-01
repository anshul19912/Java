package loops;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();

         for(int i=2;i<n;i++){
             if(n%i==0){
                 System.out.println(n +" is not a prime number");
                 break;                   // to come out from for loop
             }
             else{
                 System.out.println(n +" is a prime number");
                 break;
             }
         }


    }
}
