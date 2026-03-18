package com.apps.quantitymeasurement;

public class Length{
    private final double v;
    private final LengthUnit unit;

    public enum LengthUnit{
        FEET(12.0),
        INCHES(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor){
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor(){
            return conversionFactor;
        }
    }

    public Length(double v, LengthUnit unit){
        if(unit == null){
            throw new IllegalArgumentException("Unit cannot be null");
        }
        if(Double.isNaN(v)){
            throw new IllegalArgumentException("Invalid value");
        }
        this.v=v;
        this.unit=unit;
    }

    private double convertToBaseUnit(){
        return v * unit.getConversionFactor();
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;

        if(obj==null || getClass()!=obj.getClass()) return false;

        Length l=(Length)obj;
        return Double.compare(this.convertToBaseUnit(), l.convertToBaseUnit())==0;
    }
}
