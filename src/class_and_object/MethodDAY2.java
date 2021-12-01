package class_and_object;

public class MethodDAY2 {

    public int addition(){
        int a=5,b=13;
        int result=a+b;

        return result;
    }

    public String Message(){
        String msg="Welcome to Java";

        return msg;
    }

    public double Price(){
        double price=4587.78;

        return price;
    }

    public static void main(String[] args){

        MethodDAY2 obj=new MethodDAY2();

        int add= obj.addition();
        System.out.println("Addition is "+add);

        String msg=obj.Message();
        System.out.println("Message is "+msg);

        double price=obj.Price();
        System.out.println("Price is "+price);
    }
}
