package loops;

public class ForLoop {

    public static void main(String[] args){

        //syntax: increment for loop
        //    for(int i=initial_value; condition; increment) { CODE }

        for(int i=0;i<5;i++){
            System.out.println("Hello increment for loop "+i);
        };

        //syntax: decrement for loop
        //    for(int i=initial_value; condition; decrement) { CODE }

        for (int i=5;i>0;i--){
            System.out.println("Hello increment for loop " +i);
        }
    }
}
