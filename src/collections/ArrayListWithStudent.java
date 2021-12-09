package collections;
import model.Student;
import java.util.ArrayList;

public class ArrayListWithStudent {

        public void demo(){

            ArrayList <Student> studentArrayList= new ArrayList<>();

            //create student object using parameterized constructor
            Student student1=new Student("Rahul",23,"CS");
            Student student2=new Student("Raj",26,"CS");
            Student student3=new Student("Mukesh",24,"IT");
            Student student4=new Student("Rohit",23,"CS");
            Student student5=new Student("Kumar",23,"CS");

            studentArrayList.add(student1);
            studentArrayList.add(student2);
            studentArrayList.add(student3);
            studentArrayList.add(student4);
            studentArrayList.add(student5);

            for (Student var: studentArrayList){

                if(var.getAge()>25){
                    var.setDept("CS Second Year");
                }

                System.out.println("printing Student data:Name- " +var.getName());
                System.out.println("printing Student data:department- " +var.getDept());
                System.out.println("printing Student data:age- " +var.getAge());
            }
        }

        public static void main(String [] args){

            ArrayListWithStudent obj=new ArrayListWithStudent();
            obj.demo();
        }


}
