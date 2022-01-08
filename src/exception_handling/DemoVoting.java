package exception_handling;

public class DemoVoting {

    public void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("You are not eligible for voting");
        }
        else{
            System.out.println("Welcome to Voting Application");
        }
    }

    public static void main(String args[]){
        DemoVoting obj=new DemoVoting();
        try{
            obj.checkAge(17);
        } catch (InvalidAgeException e){
            e.printStackTrace();
        }
    }
}
