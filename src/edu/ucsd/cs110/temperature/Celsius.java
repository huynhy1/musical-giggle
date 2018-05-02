package edu.ucsd.cs110.temperature;

/**
 * Created by eric on 5/2/18.
 */
public class Celsius extends Temperature {

    public Celsius(float t) {
        super(t);
    }

    public String toString() {
        return Float.toString(this.value) + " C";
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit((float)((value * 9.0 / 5.0) + 32.0));
    }
}