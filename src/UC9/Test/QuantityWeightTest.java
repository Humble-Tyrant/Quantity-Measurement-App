package UC9.Test;

import UC9.Factory.MeasurementFactory;
import UC9.Model.Quantity.QuantityWeight;
import UC9.Strategy.WeightUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityWeightTest {

    @Test
    void testAddition_SameUnit_KgPlusKg() {
        QuantityWeight w1 = MeasurementFactory.createWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = MeasurementFactory.createWeight(2.0, WeightUnit.KILOGRAM);

        QuantityWeight result = w1.add(w2);

        assertEquals(MeasurementFactory.createWeight(3.0, WeightUnit.KILOGRAM), result);
    }

    @Test
    void testAddition_SameUnit_GramPlusGram() {
        QuantityWeight w1 = MeasurementFactory.createWeight(500.0, WeightUnit.GRAM);
        QuantityWeight w2 = MeasurementFactory.createWeight(500.0, WeightUnit.GRAM);

        QuantityWeight result = w1.add(w2);

        assertEquals(MeasurementFactory.createWeight(1000.0, WeightUnit.GRAM), result);
    }

    @Test
    void testAddition_CrossUnit_KgPlusGram() {
        QuantityWeight w1 = MeasurementFactory.createWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = MeasurementFactory.createWeight(1000.0, WeightUnit.GRAM);

        QuantityWeight result = w1.add(w2);

        assertEquals(MeasurementFactory.createWeight(2.0, WeightUnit.KILOGRAM), result);
    }

    @Test
    void testAddition_CrossUnit_GramPlusKg() {
        QuantityWeight w1 = MeasurementFactory.createWeight(1000.0, WeightUnit.GRAM);
        QuantityWeight w2 = MeasurementFactory.createWeight(1.0, WeightUnit.KILOGRAM);

        QuantityWeight result = w1.add(w2);

        assertEquals(MeasurementFactory.createWeight(2000.0, WeightUnit.GRAM), result);
    }

    @Test
    void testAddition_WithZero() {
        QuantityWeight w1 = MeasurementFactory.createWeight(5.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = MeasurementFactory.createWeight(0.0, WeightUnit.GRAM);

        QuantityWeight result = w1.add(w2);

        assertEquals(MeasurementFactory.createWeight(5.0, WeightUnit.KILOGRAM), result);
    }

    @Test
    void testAddition_NegativeValues() {
        QuantityWeight w1 = MeasurementFactory.createWeight(5.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = MeasurementFactory.createWeight(-2.0, WeightUnit.KILOGRAM);

        QuantityWeight result = w1.add(w2);

        assertEquals(MeasurementFactory.createWeight(3.0, WeightUnit.KILOGRAM), result);
    }

    @Test
    void testAddition_NullSecondOperand() {
        QuantityWeight w1 = MeasurementFactory.createWeight(1.0, WeightUnit.KILOGRAM);

        assertThrows(IllegalArgumentException.class, () -> w1.add(null));
    }
}