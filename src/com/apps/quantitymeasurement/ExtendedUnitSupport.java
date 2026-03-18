package com.apps.quantitymeasurement;

public class ExtendedUnitSupport {
    public static boolean demonstrateLengthEquality(Length l1, Length l2){
        return l1.equals(l2);
    }

    public static boolean demonstrateLengthComparison(double a, Length.LengthUnit unit1, double b, Length.LengthUnit unit2){
        Length l1 = new Length(a, unit1);
        Length l2 = new Length(b, unit2);

        return demonstrateLengthEquality(l1, l2);
    }

    public static void main(String[] args) {
        System.out.println(demonstrateLengthComparison(3, Length.LengthUnit.FEET, 1, Length.LengthUnit.YARDS));
    }
}
