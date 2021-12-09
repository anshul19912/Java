package model;

public class Student {

    String name;
    int age;
    String dept;

    public Student(String name, int age,String dept){      //Parametrized constructor
        this.name=name;
        this.age=age;
        this.dept=dept;
    }

    //getter and setter method
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
