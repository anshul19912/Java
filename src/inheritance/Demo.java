package inheritance;
//Inheritance is a mechanism in which one class acquires the property of another class
public class Demo {

    public void m1(){
        System.out.println("Inside m1 method of parent class");
    }
    public void m2(){
        System.out.println("Inside m2 method of parent class");
    }
    public void m3(){
        System.out.println("Inside m3 method of parent class");
    }

    public static void main(String[] args){
        Demo obj= new Demo();
        obj.m1();

    }
}
