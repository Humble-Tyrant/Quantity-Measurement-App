package com.apps.quantitymeasurement;
import com.apps.quantitymeasurement.Length.LengthUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality() {
        Length length1 = new Length(5.0, LengthUnit.FEET);
        Length length2 = new Length(5.0, LengthUnit.FEET);

        assertEquals(length1, length2);
    }

    @Test
    public void testInchesEquality() {
        Length length1 = new Length(12.0, LengthUnit.INCHES);
        Length length2 = new Length(12.0, LengthUnit.INCHES);

        assertEquals(length1, length2);
    }

    @Test
    public void testFeetInchesComparison() {
        Length feet = new Length(1.0, LengthUnit.FEET);
        Length inches = new Length(12.0, LengthUnit.INCHES);

        assertEquals(feet, inches);
    }

    @Test
    public void testFeetInequality() {
        Length length1 = new Length(5.0, LengthUnit.FEET);
        Length length2 = new Length(6.0, LengthUnit.FEET);

        assertNotEquals(length1, length2);
    }

    @Test
    public void testInchesInequality() {
        Length length1 = new Length(10.0, LengthUnit.INCHES);
        Length length2 = new Length(12.0, LengthUnit.INCHES);

        assertNotEquals(length1, length2);
    }

    @Test
    public void testCrossUnitInequality() {
        Length feet = new Length(1.0, LengthUnit.FEET);
        Length inches = new Length(10.0, LengthUnit.INCHES);

        assertNotEquals(feet, inches);
    }

    @Test
    public void testMultipleFeetComparison() {
        Length length1 = new Length(2.0, LengthUnit.FEET);
        Length length2 = new Length(24.0, LengthUnit.INCHES);

        assertEquals(length1, length2);
    }

    @Test
    public void yardEquals36Inches() {
        Length yard = new Length(1.0, LengthUnit.YARDS);
        Length inches = new Length(36.0, LengthUnit.INCHES);

        assertEquals(yard, inches);
    }

    @Test
    public void centimeterEquals393Point701Inches() {
        Length cm = new Length(1.0, LengthUnit.CENTIMETERS);
        Length inch = new Length(0.393701, LengthUnit.INCHES);

        assertEquals(cm, inch);
    }

    @Test
    public void threeFeetEqualsOneYard() {
        Length yard = new Length(1.0, LengthUnit.YARDS);
        Length feet = new Length(3.0, LengthUnit.FEET);

        assertEquals(yard, feet);
    }

    @Test
    public void thirtyPoint48CmEqualsOneFoot() {
        Length cm = new Length(30.48, LengthUnit.CENTIMETERS);
        Length foot = new Length(1.0, LengthUnit.FEET);

        assertEquals(cm, foot);
    }

    @Test
    public void yardNotEqualToInches() {
        Length yard = new Length(1.0, LengthUnit.YARDS);
        Length inches = new Length(12.0, LengthUnit.INCHES);

        assertNotEquals(yard, inches);
    }

    @Test
    public void referenceEqualitySameObject() {
        Length length = new Length(5.0, LengthUnit.FEET);

        assertEquals(length, length);
    }

    @Test
    public void equalsReturnsFalseForNull() {
        Length length = new Length(5.0, LengthUnit.FEET);

        assertNotEquals(null, length);
    }

    @Test
    public void reflexiveSymmetricAndTransitiveProperty() {

        Length yard = new Length(1.0, LengthUnit.YARDS);
        Length feet = new Length(3.0, LengthUnit.FEET);
        Length inches = new Length(36.0, LengthUnit.INCHES);

        assertEquals(yard, feet);
        assertEquals(feet, inches);
        assertEquals(yard, inches);
    }

    @Test
    public void differentValuesSameUnitNotEqual() {
        Length length1 = new Length(1.0, LengthUnit.YARDS);
        Length length2 = new Length(2.0, LengthUnit.YARDS);

        assertNotEquals(length1, length2);
    }

    @Test
    public void crossUnitEqualityDemonstrateMethod() {
        Length cm = new Length(2.54, LengthUnit.CENTIMETERS);
        Length inch = new Length(1.0, LengthUnit.INCHES);

        assertEquals(cm, inch);
    }
}

