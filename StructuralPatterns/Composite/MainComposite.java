package StructuralPatterns.Composite;

public class MainComposite {
    public static void main(String[] args){
        Employee e1 = new Accountant(101, "Han Le", 1000);
        Employee e2 = new Cashier(102, "Hon Li", 2000);
        Employee e3 = new Cashier(103, "someone", 3000);
        Employee e4 = new BankManager(100, "Boss", 10000 );

        e4.add(e1);
        e4.add(e2);
        e4.add(e3);

        e4.print();
    }
}
