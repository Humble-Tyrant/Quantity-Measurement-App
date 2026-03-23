package UC10.Test;

import UC10.Factory.MeasurementFactory;
import UC10.Model.Quantity.QuantityLength;
import UC10.Strategy.LengthUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityLengthTest {

    @Test
    void testAddition_SameUnit_FeetPlusFeet() {
        QuantityLength l1 = MeasurementFactory.createLength(1.0, LengthUnit.FEET);
        QuantityLength l2 = MeasurementFactory.createLength(2.0, LengthUnit.FEET);

        QuantityLength result = l1.add(l2);

        assertEquals(MeasurementFactory.createLength(3.0, LengthUnit.FEET), result);
    }

    @Test
    void testAddition_SameUnit_InchPlusInch() {
        QuantityLength l1 = MeasurementFactory.createLength(6.0, LengthUnit.INCHES);
        QuantityLength l2 = MeasurementFactory.createLength(6.0, LengthUnit.INCHES);

        QuantityLength result = l1.add(l2);

        assertEquals(MeasurementFactory.createLength(12.0, LengthUnit.INCHES), result);
    }

    @Test
    void testAddition_CrossUnit_FeetPlusInches() {
        QuantityLength l1 = MeasurementFactory.createLength(1.0, LengthUnit.FEET);
        QuantityLength l2 = MeasurementFactory.createLength(12.0, LengthUnit.INCHES);

        QuantityLength result = l1.add(l2);

        assertEquals(MeasurementFactory.createLength(2.0, LengthUnit.FEET), result);
    }

    @Test
    void testAddition_CrossUnit_InchPlusFeet() {
        QuantityLength l1 = MeasurementFactory.createLength(12.0, LengthUnit.INCHES);
        QuantityLength l2 = MeasurementFactory.createLength(1.0, LengthUnit.FEET);

        QuantityLength result = l1.add(l2);

        assertEquals(MeasurementFactory.createLength(24.0, LengthUnit.INCHES), result);
    }

    @Test
    void testAddition_WithZero() {
        QuantityLength l1 = MeasurementFactory.createLength(5.0, LengthUnit.FEET);
        QuantityLength l2 = MeasurementFactory.createLength(0.0, LengthUnit.INCHES);

        QuantityLength result = l1.add(l2);

        assertEquals(MeasurementFactory.createLength(5.0, LengthUnit.FEET), result);
    }

    @Test
    void testAddition_NegativeValues() {
        QuantityLength l1 = MeasurementFactory.createLength(5.0, LengthUnit.FEET);
        QuantityLength l2 = MeasurementFactory.createLength(-2.0, LengthUnit.FEET);

        QuantityLength result = l1.add(l2);

        assertEquals(MeasurementFactory.createLength(3.0, LengthUnit.FEET), result);
    }

    @Test
    void testAddition_NullSecondOperand() {
        QuantityLength l1 = MeasurementFactory.createLength(1.0, LengthUnit.FEET);

        assertThrows(IllegalArgumentException.class, () -> l1.add(null));
    }
}