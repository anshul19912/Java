package collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args){

        //Syntax: HashMap <DataType_Key, DataType_Value> objName = new HashMap();

        HashMap <Integer, String> course = new HashMap<>();

        //add
        course.put(1,"Java");
        course.put(2,"Spring");
        course.put(3,"Spring Boot");
        course.put(4,"Microservice and Cloud");

        //  get/read              -- to read any value we should know key value
        System.out.println(course.get(3));
        System.out.println(course.get(2));
        System.out.println(course.get(1));

        //remove
        course.remove(1);         // remove Java
        System.out.println(course.get(1));      // prints nothing bcoz value at 1 hasbeen removed

        //iterating HashMap
        for(Integer var:course.keySet()){
            System.out.println("Priting inside for Each Loop: "+course.get(var));
        }




    }
}


//        how to iterate any map in Java

//        iterate over Map.entrySet() using for-Each loop:
//        for (Map.Entry<Integer, String> var: course.entrySet() ){
//        System.out.println(var.getValue());
//        }
//
//        //using forEach(action) method:
//        course.forEach((k,v)->System.out.println("Using lambda key " +k +" and value " +v));
//
//        //iterate over keys or values using keyset() & values() methods
//        for(Integer var:course.keySet()){
//        System.out.println("key:" +var);
//        }
//        for(String var: course.values()){
//        System.out.println("value: "+var);
//        }