package class_and_object;

public class Calculator {

    public int add(){
        int a=6,b=52;

        return a+b;
    }
    public int sub(){
        int a=34,b=14;

        return a-b;
    }
    public int  mul(){
        int a=3,b=12;

        return a*b;
    }
    public float div(){
        float a=57,b=6;

        return a/b;
    }

    public static void main(String[] args){

        Calculator obj=new Calculator();

        int add=obj.add();
        int sub= obj.sub();
        int mul= obj.mul();
        float div= obj.div();

        System.out.println("Addition is :" +add);
        System.out.println("Subtraction is :" +sub);
        System.out.println("Multiplicatoin is :" +mul);
        System.out.println("Division is :" +div);
    }
}
