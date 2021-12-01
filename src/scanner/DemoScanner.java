package scanner;
import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {
        //Syntax:  ClassName objName = new ClassName();
        Scanner sc = new Scanner(System.in);  //create object of scanner class

        System.out.println("Enter your Name");
        String name=sc.nextLine();
        System.out.println("You have entered name : "+ name);

        System.out.println("Enter you age");
        int age=sc.nextInt();
        System.out.println("You have entered age: "+age);

        System.out.println("Enter you salary");
        float sal=sc.nextFloat();
        System.out.println("You have entered salary: Rs."+sal);


    }
}
