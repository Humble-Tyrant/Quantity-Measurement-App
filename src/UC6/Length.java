
package UC6;

public class Length {

    private final double value;
    private final LengthUnit unit;

    private static final double EPSILON = 1e-4;

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

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

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

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
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

        double difference = Math.abs(this.toBaseUnit() - other.toBaseUnit());

        return difference < EPSILON;
    }


    @Override
    public int hashCode() {
        return Double.hashCode(toBaseUnit());
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }

    public Length add(Length length1, Length length2, LengthUnit targetUnit) {
        if (length1 == null || length2 == null || targetUnit == null) {
            throw new IllegalArgumentException("Invalid input");

        }
        double l1Feet = length1.getUnit().convertToBase(length1.getValue());
        double l2Feet = length2.getUnit().convertToBase(length2.getValue());
        double sumFeet = l1Feet + l2Feet;
        double resultValue = targetUnit.convertToBase(sumFeet);
        return new Length(resultValue, targetUnit);
    }
}
