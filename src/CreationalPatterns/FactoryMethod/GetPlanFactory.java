package CreationalPatterns.FactoryMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GetPlanFactory {
    private final String[] planTypesList = new String[]{"domestic", "commercial", "institutional"};
    public final Set<String> validPlanTypes = new HashSet<String>(Arrays.asList(planTypesList));

    public boolean isValidPlanType(String planType){
        return validPlanTypes.contains(planType.toLowerCase());
    }

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("domestic")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("commercial")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("institutional")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
