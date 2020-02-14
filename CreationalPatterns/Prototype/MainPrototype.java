package CreationalPatterns.Prototype;

public class MainPrototype {
    public static void main(String[] args) {
        EmployeeRecord e1 = new EmployeeRecord("Han Le", 30, "87 Ontario st", 10000);

        EmployeeRecord e2 = (EmployeeRecord) e1.clone();

        EmployeeRecord e3 = e1.getCloneClass();

        System.out.println("Employee 1: ");
        e1.displayRecord();

        System.out.println("Employee 2: ");
        e2.displayRecord();

        System.out.println("Employee 3: ");
        e3.displayRecord();

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));

        System.out.println(e1 == e3);
        System.out.println(e1.equals(e3));

        double x = 1.23321;
        int y = (int) x;
        System.out.println(y);

        int a = 2;
        double b = a;
        System.out.println(b);
    }
}
