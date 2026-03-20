package UC9.Model.Quantity;

import UC9.Strategy.LengthUnit;
import UC9.Strategy.WeightUnit;

public class QuantityWeight extends Quantity<WeightUnit> {
    public QuantityWeight(double value, WeightUnit unit) {
        super(value, unit);
    }

    @Override
    public QuantityWeight add(Quantity<WeightUnit> other) {
        if (other == null) {
            throw new IllegalArgumentException("Weight cannot be null");
        }

        double thisBase = this.toBaseUnit();
        double otherBase = other.toBaseUnit();

        double sumBase = thisBase + otherBase;

        double resultValue = this.unit.convertFromBase(sumBase);

        return new QuantityWeight(resultValue, this.unit);
    }
}
