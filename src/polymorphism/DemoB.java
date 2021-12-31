package polymorphism;

//Methodd OVerriding is Redefining parent class method by changing the body of method
//Method Overrriding can only be done in child class only

public class DemoB extends DemoA{

    @Override
    public void m1(){
        System.out.println("This is m1 method of DemoB Child Class");
    }

    public static void main(String[] args){

        DemoB obj= new DemoB();
        obj.m1();

        //Runtime Polymorphism
        DemoA parentobj= new DemoA();
        parentobj.m1();              // we are making object of parent class. hence it will call parent clas method

        DemoA parentobj1= new DemoB(); // we are making object of child class. hence it will call child clas method
        parentobj1.m1();

        // DemoB parentobj= new DemoA();       this will give error bcoz child class can't take place of parent class
        // parentobj.m1();
    }
}
