package UC10.Model.Quantity;

import UC10.Strategy.Convertible;
import java.util.Objects;
public abstract class Quantity<T extends Enum<T> & Convertible> {
    protected double value;
    protected T unit;
    public Quantity(double value, T unit) {
        this.value = value;
        this.unit = unit;
    }
    public double getValue() {
        return value;
    }
    public T getUnit() {
        return unit;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Quantity<?> o)) return false;

        return Double.compare(this.toBaseUnit(), o.toBaseUnit()) == 0;
    }
    double toBaseUnit() {
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

    public abstract Quantity<T> add(Quantity<T> other);

}