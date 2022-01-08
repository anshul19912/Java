package exception_handling;

public class Demo {

    public void divide(int a,int b){
        int result=0;
        try{
            result=a/b;
        }
        catch (Exception obj){
            System.out.println("Exception occured");
        }

        // finally block executes always whether there is exception or not
        finally {
            System.out.println("This is going to execute everytime.");
        }
        System.out.println("Result is "+result);
    }

    public static void main(String[] args){
        Demo obj= new Demo();
        obj.divide(2,0);
    }
}
