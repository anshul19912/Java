package class_and_object;

public class DemoDog {

    /* todo    Member function or method -- capabilities
            // Syntax : access_specifier return_type  method_name (parameter) {}
             //access_specifier -> public , private , protected, default   THEORY PART
            //return_type   -> output of function or method :  void : no return type
            //method_name -> can be anything: it should be meaningful
            // parameter ->  input parameter : optional
      */

 //capabilities
    // run , bark , sleep , eat

    // Syntax : access_specifier return_type  method_name (parameter) {CODE}

    public void run(){

        System.out.println("inside Run Method, Dog is running..... ");
    }

    public void bark (){

        System.out.println("inside Bark Method, Dog is Barking..... ");
    }

    public void sleep(){

        System.out.println("inside Sleep Method, Dog is Sleeping..... ");
    }
    public static void main(String[] args) {
        //Step 1- create object, step 2 calling

        //step:1
        // classname objName= new CLassName();
        DemoDog obj= new DemoDog();

        //step 2 :
        // objName.methodName();
        obj.run();// calling run method

        //calling bark method
        obj.bark();

        // calling sleep method
        obj.sleep();
    }


}
