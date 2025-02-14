package com.objectserialization;

import java.util.List;
import java.io.*;
import java.util.*;

public class Employee implements Serializable {
    int id;
    String name, dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", Department=" + dept + ", Salary=" + salary + "}";
    }
}

class EmployeeInfo{
    public static void main(String[] args) {
        List<Employee> elist = new ArrayList<>();
       elist.add(new Employee(1, "Raj", "IT", 30000));
       elist.add(new Employee(2, "neha", "IT", 40000));
        elist.add(new Employee(3, "Anu", "EC", 10000));

        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Employee.ser"))){
            oos.writeObject(elist);
            System.out.println("Object serialized successfully.");
        }catch (IOException e) {
        e.printStackTrace();
    }
        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.ser"))) {
            List<Employee> deserializedEmployee = (List<Employee>) ois.readObject();
            deserializedEmployee.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }
}

