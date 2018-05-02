package edu.ucsd.cs110.temperature;

/**
 * Created by eric on 5/2/18.
 */
public abstract class Temperature {

    float value;

    public Temperature(float v) {
        value = v;
    }
    public final float getValue() {
        return value;
    }

    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}