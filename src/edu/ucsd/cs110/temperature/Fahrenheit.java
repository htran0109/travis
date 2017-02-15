package edu.ucsd.cs110.temperature;

/**
 * Created by Hung on 2/15/2017.
 */
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(((this.getValue() - 32)/9) * 5);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue() + " F";
    }
}