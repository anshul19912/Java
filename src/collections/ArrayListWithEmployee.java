package collections;
import java.util.ArrayList;
import model.Employee;

public class ArrayListWithEmployee {

    public void demo(){

        ArrayList <Employee> employeeArrayList = new ArrayList<>();

        Employee e1=new Employee(101,"Anshul Singh",19,125000);
        Employee e2=new Employee(102,"Shirley Singh",22,130000);
        Employee e3=new Employee(103,"Vidyut Jamwal",30,215000);
        Employee e4=new Employee(104,"Rishabh pant",22,225000);

        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(e4);

        for(Employee var:employeeArrayList){
            System.out.println("Employee id: "+var.getId());
            System.out.println("Employee name: "+var.getName());
            System.out.println("Employee age: "+var.getAge());
            System.out.println("Employee salary:Rs "+var.getSalary());
        }

    }

    public static void main(String[] args){


        ArrayListWithEmployee obj=new ArrayListWithEmployee();
        obj.demo();
    }
}
