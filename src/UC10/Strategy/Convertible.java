package UC10.Strategy;

public interface Convertible {
    double convertToBase(double base);
    double convertFromBase(double base);
    double getConversionFactor();
}