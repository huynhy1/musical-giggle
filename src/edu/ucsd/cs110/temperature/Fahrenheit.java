package edu.ucsd.cs110.temperature;

/**
 * Created by eric on 5/2/18.
 */
public class Fahrenheit extends Temperature {

    public Fahrenheit(float t) {
        super(t);
    }

    public String toString() {
        return Float.toString(this.value) + " F";
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((float)((value - 32) * 5.0 / 9.0));
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }
}
