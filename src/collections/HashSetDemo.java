package collections;
import java.util.HashSet;

//hashset only stores unique value other than array list which stores duplicate values
public class HashSetDemo {

    public void demo(){

        HashSet <String > course=new HashSet<>();

        course.add("Java");
        course.add("Java");            //it will ignore this
        course.add("Spring");
        course.add("Spring");          //it will ignore this
        course.add("Spring Bot");
        course.add("Cloud and Microservice ");

        for(String var:course){
            System.out.println(var);
        }
    }

    public static void main(String[] args){

        HashSetDemo obj=new HashSetDemo();
        obj.demo();
    }
}
