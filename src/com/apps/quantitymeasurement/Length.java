
package com.apps.quantitymeasurement;

/**
 * Value object representing a length measurement.
 * Supports comparison across units like feet, inches,
 * yards and centimeters.
 */
public class Length {

    private final double value;
    private final LengthUnit unit;

    private static final double EPSILON = 1e-4;

    /**
     * Enum representing supported length units.
     * Conversion factors are defined relative to inches
     * (the base unit).
     */
    public enum LengthUnit {

        INCHES(1.0),
        FEET(12.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        /**
         * Converts the given value to the base unit (inches)
         */
        public double convertToBase(double value) {
            return value * conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    /**
     * Constructor
     */
    public Length(double value, LengthUnit unit) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Length value must be finite");
        }

        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }

    /**
     * Getter for value
     */
    public double getValue() {
        return value;
    }

    /**
     * Getter for unit
     */
    public LengthUnit getUnit() {
        return unit;
    }

    /**
     * Convert current length to base unit (inches)
     */
    private double toBaseUnit() {
        return unit.convertToBase(value);
    }

    /**
     * Equality comparison based on converted base values
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Length other = (Length) obj;

        double difference = Math.abs(this.toBaseUnit() - other.toBaseUnit());

        return difference < EPSILON;
    }

    /**
     * HashCode based on base unit value
     */
    @Override
    public int hashCode() {
        return Double.hashCode(toBaseUnit());
    }

    /**
     * Readable output
     */
    @Override
    public String toString() {
        return value + " " + unit;
    }
}

