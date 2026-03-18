package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    private static final double EPSILON = 1e-6;

    /**
     * Demonstrates equality check between two Length objects
     */
    public static boolean demonstrateLengthEquality(Length length1, Length length2) {

        if (length1 == null || length2 == null) {
            return false;
        }

        boolean result = length1.equals(length2);

        if (result) {
            System.out.println("The two length measurements are equal.");
        } else {
            System.out.println("The two length measurements are not equal.");
        }

        return result;
    }

    /**
     * Demonstrates equality comparison using raw values and units
     */
    public static boolean demonstrateLengthComparison(
            double value1,
            Length.LengthUnit unit1,
            double value2,
            Length.LengthUnit unit2) {

        Length length1 = new Length(value1, unit1);
        Length length2 = new Length(value2, unit2);

        return demonstrateLengthEquality(length1, length2);
    }

    /**
     * Conversion using raw values
     */
    public static Length demonstrateLengthConversion(
            double value,
            Length.LengthUnit fromUnit,
            Length.LengthUnit toUnit) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be finite");
        }

        if (fromUnit == null || toUnit == null) {
            throw new IllegalArgumentException("Units cannot be null");
        }

        double valueInBase = fromUnit.convertToBase(value);

        double convertedValue = valueInBase / toUnit.getConversionFactor();

        return new Length(convertedValue, toUnit);
    }

    /**
     * Overloaded conversion method using an existing Length object
     */
    public static Length demonstrateLengthConversion(
            Length length,
            Length.LengthUnit toUnit) {

        if (length == null) {
            throw new IllegalArgumentException("Length cannot be null");
        }

        return demonstrateLengthConversion(
                length.getValue(),
                length.getUnit(),
                toUnit);
    }

    /**
     * Simple main method for demonstration
     */
    public static void main(String[] args) {

        Length result = demonstrateLengthConversion(
                3.0,
                Length.LengthUnit.FEET,
                Length.LengthUnit.INCHES);

        System.out.println("Converted length: " + result);

        demonstrateLengthComparison(
                1.0,
                Length.LengthUnit.YARDS,
                36.0,
                Length.LengthUnit.INCHES);
    }
}

