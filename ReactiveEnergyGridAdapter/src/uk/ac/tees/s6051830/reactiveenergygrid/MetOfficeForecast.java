/**
 * MetOfficeForecast.java
 * Implements the Forecast interface to represent a forecast from the Met Office
 * 
 * @author Tom Wilson (S605130)
 * @see Forecast
 */

package uk.ac.tees.s6051830.reactiveenergygrid;

public class MetOfficeForecast implements Forecast
{

    private double temperature, humidity;
    private int rainLevel, windSpeed;
    private String windDirection, skyDescription;
    
    /**
     * Class constructor
     * 
     * @param temperature       temperature in degrees Celsius
     * @param humidity          humidity as a percentage
     * @param rainLevel         rain level in millimeters
     * @param windSpeed         wind speed in MPH
     * @param windDirection     wind direction
     * @param skyDescription    sky description
     */    
    public MetOfficeForecast(double temperature, double humidity, int rainLevel, int windSpeed, String windDirection, String skyDescription)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.rainLevel = rainLevel;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.skyDescription = skyDescription;
    }
    
    @Override
    public double getTemperature()
    {
        return this.temperature;
    }

    @Override
    public double getHumidity()
    {
        return this.humidity;
    }

    @Override
    public int getRainLevel()
    {
        return this.rainLevel;
    }

    @Override
    public int getWindSpeed()
    {
        return this.windSpeed;
    }

    @Override
    public String getWindDirection()
    {
       return this.windDirection; 
    }

    @Override
    public String getSkyDescription()
    {
        return this.skyDescription;
    }

}