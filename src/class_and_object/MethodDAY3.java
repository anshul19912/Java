package class_and_object;
public class MethodDAY3 {

    public void m1(String name){
        System.out.println("This is m1 methd "+name);
    }
    public void m2(int age){
        System.out.println("This is m2 method "+age);
    }
    public void m3(int a,String b){
        System.out.println("This is m3 method " +a + " " +b);
    }
    public static void main(String[] args){
        MethodDAY3 obj=new MethodDAY3();

        obj.m1("Anshul Singh");
        obj.m2(19);
        obj.m3(20,"Shirley");

    }

}
