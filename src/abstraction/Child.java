package abstraction;

public class Child extends DemoAbstractMethod{


    @Override
    public void m1() {
        System.out.println("This is m1 of child");
    }

    public static void main(String[] args){

        Child obj=new Child();
        obj.m1();
        obj.m2();
    }
}
