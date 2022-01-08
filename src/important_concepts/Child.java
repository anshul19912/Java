package important_concepts;

public class Child extends Static_Demo{

    public static void message(){
        System.out.println("Hello Java from Child");
    }

    public static void main(String[] args){
        Child obj=new Child();
        Child.message();
    }
}
