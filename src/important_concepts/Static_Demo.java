package important_concepts;
// Static Keyword: Compile Time binding.... It can be called using Class_Name only, without creating object


public class Static_Demo {
    // we can not use non-static data inside static method
    // we can't override static method bcoz it doesn't make any sense
    public static String name="Java";
    int age=33;             // this age can't be used inside static method

    public static void message(){
        System.out.println("Hello Java");
    }

    public static void main(String[] args){
        System.out.println(Static_Demo.name);
        Static_Demo.message();
    }
}
