package UC9.Model.Quantity;
import UC9.Strategy.LengthUnit;

public class QuantityLength extends Quantity<LengthUnit> {
    public QuantityLength(double value, LengthUnit unit) {
        super(value, unit);
    }

    @Override
    public QuantityLength add(Quantity<LengthUnit> other) {
        if (other == null) {
            throw new IllegalArgumentException("Lengths cannot be null");
        }

        double thisBase = this.toBaseUnit();
        double otherBase = other.toBaseUnit();

        double sumBase = thisBase + otherBase;

        double resultValue = this.unit.convertFromBase(sumBase);

        return new QuantityLength(resultValue, this.unit);
    }
}