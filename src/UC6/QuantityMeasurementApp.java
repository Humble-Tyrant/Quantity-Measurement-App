package UC6;

import UC6.Length;
import UC6.Length.LengthUnit;

public class QuantityMeasurementApp {

    public static boolean demonstrateLengthEquality(Length length1, Length length2) {
        return length1.equals(length2);
    }

    public static boolean demonstrateLengthComparison(Length length1, Length length2) {
        double base1 = length1.getUnit().convertToBase(length1.getValue());
        double base2 = length2.getUnit().convertToBase(length2.getValue());

        return base1 > base2;
    }

    public static Length demonstrateLengthConversion(Length length, LengthUnit toUnit) {

        double baseValue = length.getUnit().convertToBase(length.getValue());

        double convertedValue = baseValue / toUnit.getConversionFactor();

        return new Length(convertedValue, toUnit);
    }

    /**
     * Demonstrate addition of second QuantityLength to first QuantityLength.
     */
    public static Length demonstrateLengthAddition(Length length1, Length length2) {

        if (length1 == null || length2 == null) {
            throw new IllegalArgumentException("Lengths cannot be null");
        }

        LengthUnit targetUnit = length1.getUnit();

        double l1Base = length1.getUnit().convertToBase(length1.getValue());
        double l2Base = length2.getUnit().convertToBase(length2.getValue());

        double sumBase = l1Base + l2Base;

        double resultValue = sumBase / targetUnit.getConversionFactor();

        return new Length(resultValue, targetUnit);
    }

    // Main method
    public static void main(String[] args) {

        Length oneFoot = new Length(7.0, LengthUnit.FEET);
        Length twelveInches = new Length(12.0, LengthUnit.INCHES);


        Length result = demonstrateLengthAddition(oneFoot, twelveInches);
        System.out.println(result);
    }
}