/**
 * NetweatherForecast.java
 * Provides the raw data from the Netweather API
 * 
 * @author Tom Wilson (S605130)
 */

package uk.ac.tees.s6051830.reactiveenergygrid;

public class NetweatherForecast
{

    private double temperature, humidity, rain;
    private String windInfo, sky;

    /**
     * Class constructor
     * 
     * @param temperature   temperature in degrees Fahrenheit
     * @param humidity      humidity as a percentage
     * @param rain          rain level in inches
     * @param windInfo      wind speed and direction in format "{direction} {speed}"
     * @param sky           sky description
     */          
    public NetweatherForecast(double temperature, double humidity, double rain, String windInfo, String sky)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.rain = rain;
        this.windInfo = windInfo;
        this.sky = sky;
    }
    
    /**
     * Returns the temperature
     * @return temperature in degrees Fahrenheit
     */
    public double getTemperature()
    {
        return this.temperature;
    }   
    
    /**
     * Returns the humidity
     * @return humidity as a percentage
     */
    public double getHumidity()
    {
        return this.humidity;
    }
    
    /**
     * Returns the rain level
     * @return rain level in inches
     */
    public double getRain()
    {
        return this.rain;
    }
    
    /**
     * Returns the wind info
     * @return wind speed and direction in format "{direction} {speed}"
     */
    public String getWindInfo()
    {
        return this.windInfo;
    }
    
    /**
     * Returns the sky description
     * @return sky description
     */
    public String getSky()
    {
        return this.sky;
    }
    
}