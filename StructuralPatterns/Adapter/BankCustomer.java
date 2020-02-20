package StructuralPatterns.Adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {

    public void giveBankDetails() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter account holder name: ");
            String customerName = br.readLine();
            System.out.println("\n");

            System.out.println("Enter account number: ");
            long accNumber = Long.parseLong(br.readLine());
            System.out.println("\n");

            System.out.println("Enter bank name: ");
            String bankName = br.readLine();

            setAccHolderName(customerName);
            setAccNumber(accNumber);
            setBankName(bankName);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public String getCreditCard() {
        String customerName = getAccHolderName();
        long accNumber = getAccNumber();
        String bankName = getBankName();
        return String.format("The account number %d of %s in %s bank is valid", accNumber, customerName, bankName);
    }
}
