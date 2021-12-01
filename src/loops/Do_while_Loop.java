package loops;

public class Do_while_Loop {

    public static void main(String[] args) {
    /* SYNTAX :do { CODE; inc/dec}
                 while (condition);*/

        int i = 0;
        do {
            System.out.println("HEllo Java in do while increment " + i);
            i++;
        }
        while (i < 3);

        int j=3;
        do{
            System.out.println("Hello Java in do while decrement "+j);
            j--;
        }
        while(j>0);
    }
}
