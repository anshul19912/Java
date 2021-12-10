package model;
import java.util.Objects;

public class Employee {

    int id;
    String name;
    int age;
    double salary;


    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() !=o.getClass()) return false;
        Employee employee = (Employee) o;
        return id==employee.id;
    }
    @Override
    public int hashCode(){
        return id;
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
