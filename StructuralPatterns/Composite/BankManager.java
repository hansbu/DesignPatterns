package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class BankManager implements Employee {
    private int id;
    private String name;
    private double salary;
    private ArrayList<Employee> employees = new ArrayList<>();

    public BankManager(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("ID: " + id);
        System.out.println("Job title: Manager");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            employee.print();
        }
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }
}
