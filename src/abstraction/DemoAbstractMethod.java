package abstraction;
// a class with at least 1 abstract method is known as abstract class
// It provides partial abstraction bcoz it may also have normal method as well
public abstract class DemoAbstractMethod {
    // a method without method body called abstract method
    public abstract void m1();

    public void m2(){
        System.out.println("This is m2 method");
    }

    public static void main(String[] args){
        // we can't create object of abstract class

    }
}
