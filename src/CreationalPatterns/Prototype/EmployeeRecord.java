package CreationalPatterns.Prototype;

public class EmployeeRecord implements Cloneable {
    private String name;
    private int age;
    private String address;
    private double salary;

    public EmployeeRecord(String name, int age, String address, double salary){
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public void displayRecord(){
        System.out.println(String.format(name + "\t" + age + "\t" + address + "\t" + salary));
    }

    @Override
    public Object clone() {
        return new EmployeeRecord(name, age, address, salary);
    }

    public EmployeeRecord getCloneClass() {
        return new EmployeeRecord(name, age, address, salary);
    }
}
