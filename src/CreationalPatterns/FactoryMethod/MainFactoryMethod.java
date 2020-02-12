package CreationalPatterns.FactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainFactoryMethod {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planType = br.readLine();

        while (!planFactory.isValidPlanType(planType)){
            System.out.println("Plan type is NOT valid. They should be one of the choices below:\n" + planFactory.validPlanTypes);
            planType = br.readLine();
        }

        System.out.println("Enter the number of units: ");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planType);
        p.calculateBill(units);

        System.out.println(String.format("Compute %.2f for %d", 1.2, 3));

    }
}
