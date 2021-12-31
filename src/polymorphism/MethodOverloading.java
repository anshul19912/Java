package polymorphism;

//Method Overloading means using the same method with different parameters
//This is also called compile time polymorphism bcoz during the time of compilation we can tell which method to execute by seeing the code
//Method Overloading can only be done in Same Class
public class MethodOverloading {
    //Same Method with different parameters

    public void m1(){
        System.out.println("This is m1 method");
    }

    //overload m1
    public void m1(int a){
        System.out.println("This is m1 overloaded method");
    }
    //overload m1 again
    public void m1(String s){
        System.out.println("This is m1 overloaded method with String");
    }
    public void m1(String x, int y){
        System.out.println("This is m1 overloaded method with String and int");
    }

    public static void main(String[] args){
        MethodOverloading obj= new MethodOverloading();
        obj.m1();
        obj.m1(33);
        obj.m1("Anshul Singh");
        obj.m1("Bhagat Singh", 9);
    }
}
