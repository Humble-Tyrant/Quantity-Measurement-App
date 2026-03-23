package UC10.Factory;

import UC10.Model.Quantity.QuantityLength;
import UC10.Model.Quantity.QuantityWeight;
import UC10.Strategy.LengthUnit;
import UC10.Strategy.WeightUnit;

public class MeasurementFactory {
    private MeasurementFactory() {}
    public static QuantityLength createLength(double value, LengthUnit unit) {
        return new QuantityLength(value, unit);
    }

    public static QuantityWeight createWeight(double value, WeightUnit unit) {
        return new QuantityWeight(value, unit);
    }
}