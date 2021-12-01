package conditional_statement;

public class Day2 {

    public static void main(String[] args) {

        int a= 1;
        int b=-4;

        if( a>0 && b>0 ){

            System.out.println("AND a and b are greater than zero ");
        }
        else {
            System.out.println("AND a  b are not greater than zero ");
        }

        if(a>0 || b>0){

            System.out.println("OR Operator a and b are greater than zero ");
        }
        else {
            System.out.println("OR Operator a  b are not greater than zero ");
        }


        int age=15;

        if (!(age<18)){

            System.out.println("Person is Young");
        }
        else {

            System.out.println("Age is less than 18 , Person is not Young");
        }

    }




}
