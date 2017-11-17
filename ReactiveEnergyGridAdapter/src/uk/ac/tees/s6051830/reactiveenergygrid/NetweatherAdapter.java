/**
 * NetweatherAdapter.java
 * Converts the raw Netweather forecast data to follow the Forecast interface
 * 
 * @author Tom Wilson (S605130)
 */

package uk.ac.tees.s6051830.reactiveenergygrid;

public class NetweatherAdapter implements Forecast
{
    
    private double temperature, humidity;
    private int rainLevel, windSpeed;
    private String windDirection, skyDescription;
    private NetweatherForecast f;

    /**
     * Class constructor
     * 
     * @param f reference to a NetweatherForecast object
     */       
    public NetweatherAdapter(NetweatherForecast f)
    {
        this.f = f;
    }    

    /**
     * @inheritDoc
     * 
     * Converts the raw temperature data from Fahrenheit to Celsius and stores it
     * in the adapted object, then returns it
     */        
    @Override
    public double getTemperature()
    {
        if (this.temperature == 0)
        {
            this.temperature = ((f.getTemperature() - 32) * (5.0 / 9.0));
        }
        
        return this.temperature;
    }

    @Override
    public double getHumidity()
    {
        if (this.humidity == 0)
        {
            this.humidity = f.getHumidity();
        }
        
        return this.humidity;
    }
 
    /**
     * @inheritDoc
     * 
     * Converts the raw rain level data from inches to millimeters and stores it
     * in the adapted object, then returns it
     */        
    @Override
    public int getRainLevel()
    {
        if (this.rainLevel == 0)
        {
            this.rainLevel = (int) (f.getRain() * 25.4);
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
            String windSensorInfo = f.getWindInfo();
            String[] data = windSensorInfo.split(" ");
            this.windSpeed = Integer.parseInt(data[1]);
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
            String windSensorInfo = f.getWindInfo();
            String[] data = windSensorInfo.split(" ");
            this.windDirection = data[0];
        }
        
        return this.windDirection;
    }

    @Override
    public String getSkyDescription()
    {
        if (this.skyDescription == null)
        {
            this.skyDescription = f.getSky();
        }
        
        return this.skyDescription;
    }
    
}