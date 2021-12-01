package loops;

public class WhileLoop {
    public static void main(String[] args){

        //syntax:  while(condition) { CODE; increment/decrement }

        int i=0;
        while(i<6){
            System.out.println(i);
            i++;
        }

        int j=6;
        while(j>0){
            System.out.println(j);
            j--;
        }
    }
}


/*  infinite loop
     while(true){
     System.out.println("Infinita Loop");
     }
 */