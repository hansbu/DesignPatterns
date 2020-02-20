package StructuralPatterns.Adapter;

public class MainAdapter {
    public static void main(String[] args) {
        CreditCard creditCard = new BankCustomer();
        creditCard.giveBankDetails();

        System.out.println(creditCard.getCreditCard());
    }
}
