package com.apps.quantitymeasurement;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTestApp {

    @org.junit.Test
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
        String notAFeet = "Not a Feet";
        assertNotEquals(notAFeet, feet1);
    }

    @Test
    public void testFeetEquality_SameReference() {
        Feet feet2 = new Feet(12);
        assertEquals(feet2, feet2);
    }
}