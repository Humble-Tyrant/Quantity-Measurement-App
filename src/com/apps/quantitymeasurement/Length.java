package com.apps.quantitymeasurement;

public class Length {
    public enum LengthUnit {

        INCHES(1.0),
        FEET(12.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double convertToBase(double value) {
            return value * conversionFactor;
        }
    }
    private final double value;
    private final LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toBaseUnit() {
        return unit.convertToBase(value);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Length other = (Length) obj;

        return Math.abs(this.toBaseUnit() - other.toBaseUnit()) < 0.0001;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}