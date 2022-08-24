package examples.deitel.polymorphism;

import examples.deitel.inheritance.BasePlusCommissionEmployee;
import examples.deitel.inheritance.CommissionEmployee;

public class PolymorphismTest {
    public static void main(String[] args) {

    CommissionEmployee commissionEmployee =
            new CommissionEmployee(
                    "Precious",
                    "Akpan",
                    "222-22-2222",
                    10000,
                    .6
            );

    BasePlusCommissionEmployee basePlusCommissionEmployee =
            new BasePlusCommissionEmployee(
                    "Bob",
                    "Lewis",
                    "333-33-3333",
                    5000,
                    .04,
                    300
            );
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call CommissionEmployee's to " +
                "toString with superclass reference ", "to superclass object", commissionEmployee.toString());

        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's to string with subclass", "reference to subclass object", basePlusCommissionEmployee);

        CommissionEmployee commissionEmployee1 = basePlusCommissionEmployee;

        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with superclass", "reference to subclass object", commissionEmployee1);

    }

}
