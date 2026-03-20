package UC8;
import UC8.LengthUnit;
import java.util.Objects;
public class Length {
    private final double value;
    private final LengthUnit unit;
    private static final double EPSILON = 1e-4;
    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }
    public double getValue() {
        return value;
    }
    public LengthUnit getUnit() {
        return unit;
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
    private double toBaseUnit() {
        return unit.convertToBase(value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toBaseUnit());
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }

    public Length add(Length other) {
        if (other == null) {
            throw new IllegalArgumentException("Lengths cannot be null");
        }

        double thisBase = this.toBaseUnit();
        double otherBase = other.toBaseUnit();

        double sumBase = thisBase + otherBase;

        double resultValue = this.unit.convertFromBase(sumBase);

        return new Length(resultValue, this.unit);
    }

}
