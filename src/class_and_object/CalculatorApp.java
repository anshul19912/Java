package class_and_object;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorApp {

    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public float div(float a, float b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator2 obj = new Calculator2();

        char opt;
        do {
            System.out.println("Enter the he first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();

            System.out.println("Enter the operation: ");
            char choice = sc.next().charAt(0);   //1- addition   2-subtraction 3- multi  4-division


            int add = obj.add(num1, num2);
            int sub = obj.sub(num1, num2);
            int mul = obj.mul(num1, num2);
            float div = obj.div(num1, num2);

            if (choice == '+') {
                System.out.println("Addition is: " + add);
            } else if (choice == '-') {
                System.out.println("Subtraction is: " + sub);
            } else if (choice == '*') {
                System.out.println("Multiplication is: " + mul);
            } else if (choice == '/') {
                System.out.println("Division is: " + div);
            }

            System.out.println("Do you want to continue: (Y/N)");
            opt = sc.next().charAt(0);
        }
        while (opt == 'Y' || opt=='y');


    }




}
