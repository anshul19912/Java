package collections;
import model.Employee;
import java.util.HashSet;

public class HashSetWithEmployee {

    public void demo(){

        HashSet <Employee> EmployeeSet = new HashSet<>();

        EmployeeSet.add(new Employee(101,"Anshul Singh",19,85000));
        EmployeeSet.add(new Employee(101,"Shirley Singh",22,99000));    //will ignore this bocz id is same
        EmployeeSet.add(new Employee(103,"Mayank Agarwal",24,78000));

        for(Employee var: EmployeeSet){
            System.out.println(var.getName());

        }
    }
    public static void main(String[] args){

        HashSetWithEmployee obj= new HashSetWithEmployee();
        obj.demo();
    }
}
