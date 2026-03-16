package com.apps.quantitymeasurement;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
public class Main {
    public static void main(String[] args) {
        Feet feet1 = new Feet(12);
        Feet feet2 = new Feet(13);
        System.out.println("Feet 1 equals Feet 2: " + feet1.equals(feet2));
    }
}
