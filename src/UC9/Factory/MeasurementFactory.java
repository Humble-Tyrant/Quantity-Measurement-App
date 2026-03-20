package UC9.Factory;

import UC9.Model.Quantity.QuantityLength;
import UC9.Model.Quantity.QuantityWeight;
import UC9.Strategy.LengthUnit;
import UC9.Strategy.WeightUnit;

public class MeasurementFactory {
    private MeasurementFactory() {}
    public static QuantityLength createLength(double value, LengthUnit unit) {
        return new QuantityLength(value, unit);
    }

    public static QuantityWeight createWeight(double value, WeightUnit unit) {
        return new QuantityWeight(value, unit);
    }
}