package collections;
import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {

    public static void main(String[] args){

        HashMap<Integer, Student> studentHashMap = new HashMap<>();

        Student student1= new Student("Raj",26,"CS");
        Student student2= new Student("Kumar",23,"IT");
        Student student3= new Student("Ramesh",25,"Mechanical");

        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);

        for(Student var: studentHashMap.values()){
            System.out.println("Name: " +var.getName());
            System.out.println("Age: " +var.getAge());
            System.out.println("Department: " +var.getDept());
        }


        //Using ArrayList

        ArrayList<Student> studentArrayList= new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        HashMap<Integer, ArrayList<Student>> hashMap= new HashMap<>();

        hashMap.put(1,studentArrayList);

        ArrayList<Student> studentArrayListOutPut= hashMap.get(1);               // this will give student array list

        for(Student var: studentArrayListOutPut){
            System.out.println("Name: " +var.getName());
            System.out.println("Dept: " +var.getDept());
            System.out.println("Age: " +var.getAge());
        }


    }
}
