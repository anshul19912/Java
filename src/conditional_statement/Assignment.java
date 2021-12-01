package conditional_statement;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the person's age: ");
        int age= sc.nextInt();

        if(age>=18){
            System.out.println("Person can be issued Driving license");
        }
        else if(age<18 && age>12){
            System.out.println("Person can be issued learning license");
        }
        else{
            System.out.println("Person can't be issued license");
        }

    }
}
