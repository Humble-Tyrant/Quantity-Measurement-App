package UC10.Strategy;

public enum WeightUnit implements Convertible {
    KILOGRAM(1.0),
    GRAM(1.0/1000.0),
    Pound(0.453592);

    private final double conversionFactor;
    WeightUnit(double conversionFactor) {
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