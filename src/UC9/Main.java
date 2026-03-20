package UC9;

import UC9.Factory.MeasurementFactory;
import UC9.Model.Quantity.QuantityLength;
import UC9.Model.Quantity.QuantityWeight;
import UC9.Strategy.LengthUnit;
import UC9.Strategy.WeightUnit;

public class Main {

    public static void main(String[] args) {

        // 🔹 Length examples
        QuantityLength l1 = MeasurementFactory.createLength(5, LengthUnit.FEET);
        QuantityLength l2 = MeasurementFactory.createLength(60, LengthUnit.INCHES);

        System.out.println("Length 1: " + l1);
        System.out.println("Length 2: " + l2);

        System.out.println("Are lengths equal? " + l1.equals(l2));

        QuantityLength lSum = l1.add(l2);
        System.out.println("Sum of lengths: " + lSum);

        System.out.println("------------------------");

        // 🔹 Weight examples
        QuantityWeight w1 = MeasurementFactory.createWeight(1, WeightUnit.KILOGRAM);
        QuantityWeight w2 = MeasurementFactory.createWeight(1000, WeightUnit.GRAM);

        System.out.println("Weight 1: " + w1);
        System.out.println("Weight 2: " + w2);

        System.out.println("Are weights equal? " + w1.equals(w2));

        QuantityWeight wSum = w1.add(w2);
        System.out.println("Sum of weights: " + wSum);

        System.out.println("------------------------");

        // 🔹 Cross comparison (should be false or prevented)
        System.out.println("Length equals Weight? " + l1.equals(w1));
    }
}