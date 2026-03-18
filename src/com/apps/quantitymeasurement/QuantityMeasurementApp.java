package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {
    public static boolean demonstrateLengthEquality(Length l1, Length l2){
        return l1.equals(l2);
    }

    public static void demonstrateFeetEquality(){
        Length f1 = new Length(5, Length.LengthUnit.FEET);
        Length f2 = new Length(5, Length.LengthUnit.FEET);

        System.out.println("Equal or not - " + demonstrateLengthEquality(f1, f2));
    }

    public static void demonstrateInchesEquality(){
        Length i1 = new Length(12, Length.LengthUnit.INCHES);
        Length i2 = new Length(12, Length.LengthUnit.INCHES);

        System.out.println("Equal or not - " + demonstrateLengthEquality(i1, i2));
    }

    public static void demonstrateFeetInchesComparison(){
        Length l1 = new Length(1, Length.LengthUnit.FEET);
        Length l2 = new Length(12, Length.LengthUnit.INCHES);

        System.out.println("Feet & Inches comparison - " + demonstrateLengthEquality(l1, l2));
    }

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetInchesComparison();
    }
}
