package inheritance;

public class DemoImpl extends Demo{

    public void m4(){
        System.out.println("Inside m4 method of child class");
    }
    public static void main(String[] args){

    DemoImpl obj= new DemoImpl();
    obj.m1();
    obj.m2();
    obj.m3();
    obj.m4();

    }
}

