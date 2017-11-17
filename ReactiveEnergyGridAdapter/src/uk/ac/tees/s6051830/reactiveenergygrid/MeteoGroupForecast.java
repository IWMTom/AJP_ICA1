/**
 * MeteoGroupForecast.java
 * Provides the raw data from the MeteoGroup API
 * 
 * @author Tom Wilson (S605130)
 */

package uk.ac.tees.s6051830.reactiveenergygrid;

public class MeteoGroupForecast
{

    private double thermometerInfo;
    private String waterSensorInfo;
    private String windSensorInfo;
    private String skyType;
    
    /**
     * Class constructor
     * 
     * @param thermometerInfo   temperature in degrees Celsius
     * @param waterSensorInfo   humidity and rain level in format "{humidity}-{rainLevel}"
     * @param windSensorInfo    wind speed and direction in format "{speed}:{direction}"
     * @param skyType           sky description
     */      
    public MeteoGroupForecast(double thermometerInfo, String waterSensorInfo, String windSensorInfo, String skyType)
    {
        this.thermometerInfo = thermometerInfo;
        this.waterSensorInfo = waterSensorInfo;
        this.windSensorInfo = windSensorInfo;
        this.skyType = skyType;
    }
    
    /**
     * Returns the temperature
     * @return temperature in degrees Celsius
     */
    public double getThermometerInfo()
    {
        return this.thermometerInfo;
    }

    /**
     * Returns the water sensor info
     * @return water sensor info in format "{humidity}-{rainLevel}"
     */    
    public String getWaterSensorInfo()
    {
        return this.waterSensorInfo;
    }
 
    /**
     * Returns the wind sensor info
     * @return wind sensor info in format "{speed}:{direction}"
     */       
    public String getWindSensorInfo()
    {
        return this.windSensorInfo;
    }

    /**
     * Returns the sky type
     * @return sky description
     */    
    public String getSkyType()
    {
        return this.skyType;
    }    
    
}