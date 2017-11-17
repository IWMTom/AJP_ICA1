/**
 * Forecast.java
 * An interface that all types of forecast implement
 * 
 * @author Tom Wilson (S605130)
 */

package uk.ac.tees.s6051830.reactiveenergygrid;

public interface Forecast
{

    /**
     * Returns the temperature
     * @return temperature in degrees Celsius
     */
    public double getTemperature();
    
    /**
     * Returns the humidity
     * @return humidity as a percentage
     */
    public double getHumidity();
        
    /**
     * Returns the rain level
     * @return rain level in millimeters
     */    
    public int getRainLevel();
    
    /**
     * Returns the wind speed
     * @return wind speed in MPH
     */   
    public int getWindSpeed();
    
    /**
     * Returns the wind direction
     * @return wind direction
     */       
    public String getWindDirection();
    
    /**
     * Returns the sky description
     * @return sky description
     */   
    public String getSkyDescription();
    
}