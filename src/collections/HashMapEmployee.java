package collections;
import java.util.ArrayList;
import java.util.HashMap;
import model.Employee;

public class HashMapEmployee {

    public static void main(String[] args){

        Employee e1=new Employee(101,"Anshul Singh",19,85000);
        Employee e2=new Employee(102,"Bhagat Singh",23,99000);
        Employee e3=new Employee(103,"Abhishek Kumar",20,78500);

        HashMap<Integer, ArrayList<Employee>> employeeHashMap=new HashMap<>();

        //creating array list of employees
        ArrayList<Employee> employeeArrayList=new ArrayList<>();

        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);

       employeeHashMap.put(1,employeeArrayList);

       ArrayList<Employee>  finallist = employeeHashMap.get(1);

       for (Employee var: finallist){
           System.out.println("id: " +var.getId());
           System.out.println("name: " +var.getName());
           System.out.println("age: " +var.getAge());
           System.out.println("salary: " +var.getSalary());
       }

        

    }
}
