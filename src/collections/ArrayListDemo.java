package collections;
import java.util.ArrayList;

public class ArrayListDemo {

    public void demo() {

        //Collection obj_name = new Collection();

        ArrayList arrayList = new ArrayList();

        // add:  to add data
        arrayList.add("Java");              // index 0
        arrayList.add("Spring Boot");       // index
        arrayList.add("Spring");            // index 0

        // get: to read dataa
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(0));

        // remove method is used to delete elements inside list
        arrayList.remove(0);              //this will remove "Java" hence spring boot becomes 0 index
        System.out.println(arrayList.get(0));     // now this will print spring bott


        for (Object var : arrayList) {         // Object  can accept any type of value
            System.out.println("Inside advanced for loop " + var);
        }
        System.out.println("printing size of array list: "+arrayList.size());
    }


    //Generics : only a particular type of data can be stored in a list

    public void demoWithGenerics(){

        // Collection_Name <datatype> objName= new Collection_name();
        ArrayList <String> arrayList= new ArrayList();
        arrayList.add("Java");
        arrayList.add("Spring Boot");
        arrayList.add("Cloud");
        arrayList.add("Spring");
       // arrayList.add(5);   we cannot add this bcoz datatype is not string

        for (String var: arrayList){
            System.out.println("Inside demoWithGenerics " +var);
        }

        ArrayList <Integer> marksList= new ArrayList();
        marksList.add(45);
        marksList.add(98);
        marksList.add(79);

        for(Integer var:marksList){
            System.out.println("Inside demoWithGenerics for marksList "+var);
        }
    }


    public static void main(String[] args) {

       ArrayListDemo obj=new ArrayListDemo();
        obj.demo();
        obj.demoWithGenerics();
    }
}
