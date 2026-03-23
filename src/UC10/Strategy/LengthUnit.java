package UC10.Strategy;

public enum LengthUnit implements Convertible {
    INCHES(1.0/12.0),
    FEET(1.0),
    YARDS(3.0),
    CENTIMETERS(1.0/30.48);

    private final double conversionFactor;
    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    public double getConversionFactor() {
        return conversionFactor;

    }
    public double convertFromBase(double base) {
        return base/conversionFactor;
    }
    public double convertToBase(double base) {
        return base*conversionFactor;
    }
}