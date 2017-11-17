/**
 * MeteoGroupAdapter.java
 * Converts the raw MeteoGroup forecast data to follow the Forecast interface
 * 
 * @author Tom Wilson (S605130)
 */

package uk.ac.tees.s6051830.reactiveenergygrid;

public class MeteoGroupAdapter implements Forecast
{

    private double temperature, humidity;
    private int rainLevel, windSpeed;
    private String windDirection, skyDescription;
    private MeteoGroupForecast f;
  
    /**
     * Class constructor
     * 
     * @param f reference to a MeteoGroupForecast object
     */       
    public MeteoGroupAdapter(MeteoGroupForecast f)
    {
        this.f = f;
    }

    /**
     * @inheritDoc
     * 
     * Grabs the raw temperature data and stores it in the adapted object, then returns it
     */    
    @Override
    public double getTemperature()
    {
        if (this.temperature == 0)
        {
            this.temperature = f.getThermometerInfo();
        }
        
        return this.temperature;
    }

    /**
     * @inheritDoc
     * 
     * Grabs the raw water sensor info and splits it to return the humidity
     */   
    @Override
    public double getHumidity()
    {
        if (this.humidity == 0)
        {
            String waterSensorInfo = f.getWaterSensorInfo();
            String[] data = waterSensorInfo.split("-");
            this.humidity = Double.parseDouble(data[0]);
        }
        
        return this.humidity;
    }

    /**
     * @inheritDoc
     * 
     * Grabs the raw water sensor info and splits it to return the rain level
     */   
    @Override
    public int getRainLevel()
    {
        if (this.rainLevel == 0)
        {
            String waterSensorInfo = f.getWaterSensorInfo();
            String[] data = waterSensorInfo.split("-");
            this.rainLevel = Integer.parseInt(data[1]);
        }
        
        return this.rainLevel;
    }

    /**
     * @inheritDoc
     * 
     * Grabs the raw wind sensor info and splits it to return the wind speed
     */   
    @Override
    public int getWindSpeed()
    {
        if (this.windSpeed == 0)
        {
            String windSensorInfo = f.getWindSensorInfo();
            String[] data = windSensorInfo.split(":");
            this.windSpeed = Integer.parseInt(data[0]);
        }
        
        return this.windSpeed;
    }

    /**
     * @inheritDoc
     * 
     * Grabs the raw wind sensor info and splits it to return the wind direction
     */   
    @Override
    public String getWindDirection()
    {
        if (this.windDirection == null)
        {
            String windSensorInfo = f.getWindSensorInfo();
            String[] data = windSensorInfo.split(":");
            this.windDirection = data[1];
        }
        
        return this.windDirection;
    }

    @Override
    public String getSkyDescription()
    {
        if (this.skyDescription == null)
        {
            this.skyDescription = f.getSkyType();
        }
        
        return this.skyDescription;        
    }

}