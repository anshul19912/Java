package conditional_statement;

public class DemoIfAndElse {

    public static void main(String[] args) {

        int age=15;

        //SYNTAX : if(condition){ code to be executed } else {}
       if (age>18){

           System.out.println("Person is Young");
       }
       else {
           System.out.println("Person is Child");
       }

       int a=9;
       int b=6;

       if(a<b){
           System.out.println("A is less than B");
       }
       else {
           System.out.println("A is not less than B");
       }

       String city="Delhi";

       if (city=="Pune"){
           System.out.println("You are in Pune ....");
       }
       else {
           System.out.println("You are not in Pune ....");
       }

    }
}
