package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {




    @Test
    public void testFeetEquality_SameValue() {
        Feet feet1 = new Feet(12);
        Feet feet2 = new Feet(12);
        assertEquals(feet1, feet2);
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        Feet feet1 = new Feet(12);
        Feet feet2 = new Feet(15);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void testFeetEquality_NullComparison() {
        Feet feet1 = new Feet(12);
        assertNotEquals(null, feet1);
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        Feet feet1 = new Feet(12);
        String notFeet = "Not a Feet";
        assertNotEquals(notFeet, feet1);
    }

    @Test
    public void testFeetEquality_SameReference() {
        Feet feet1 = new Feet(12);
        assertEquals(feet1, feet1);
    }




    @Test
    public void testInchesEquality_SameValue() {
        Inches inches1 = new Inches(12);
        Inches inches2 = new Inches(12);
        assertEquals(inches1, inches2);
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        Inches inches1 = new Inches(12);
        Inches inches2 = new Inches(15);
        assertNotEquals(inches1, inches2);
    }

    @Test
    public void testInchesEquality_NullComparison() {
        Inches inches1 = new Inches(12);
        assertNotEquals(null, inches1);
    }

    @Test
    public void testInchesEquality_DifferentClass() {
        Inches inches1 = new Inches(12);
        String notInches = "Not an Inches";
        assertNotEquals(notInches, inches1);
    }

    @Test
    public void testInchesEquality_SameReference() {
        Inches inches1 = new Inches(12);
        assertEquals(inches1, inches1);
    }


}
