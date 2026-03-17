package com.apps.quantitymeasurement;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;
public class Main {
    public static void main(String[] args) {
        Feet feet1 = new Feet(12);
        Feet feet2 = new Feet(12);
        Inches inches1 = new Inches(12);
        Inches inches2 = new Inches(15);
        System.out.println("Feet equal: " + feet1.equals(feet2));
        System.out.println("Inches equal: " + inches1.equals(inches2)); }
}
