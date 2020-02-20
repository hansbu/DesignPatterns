package StructuralPatterns.Composite;

public class Cashier implements Employee {
    private int id;
    private String name;
    private double salary;

    public Cashier(int id, String name, double salary) {
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
        System.out.println("Job title: Cashier");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public Employee getChild(int i) {
        return null;
    }
}
