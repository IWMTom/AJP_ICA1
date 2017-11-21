/**
 * MeteoGroupAdapterTest.java
 * Tests the adapter functionality from MeteoGroupForecast
 * 
 * @author Tom Wilson (S605130)
 */

package uk.ac.tees.s6051830.reactiveenergygrid;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class MeteoGroupAdapterTest
{
    
    /**
     *  18.5℃, 59% humidity, 0mm rain, winds at 5mph NE, cloudy skies
     */
    private MeteoGroupForecast rawForecast = new MeteoGroupForecast(18.5, "59-0", "5:NE", "Cloudy Skies");
    private MeteoGroupAdapter adaptedForecast = new MeteoGroupAdapter(rawForecast);
    
    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("\nTesting MeteoGroupAdapter");
        System.out.println("---------------------------------------------");
    }
    
    /**
     *  Tests that the temperature matches
     */
    @Test
    public void testGetTemperature()
    {
        assertEquals(18.5, adaptedForecast.getTemperature(), 0);
        
        System.out.println("Testing getTemperature() \t\t OK");
    }

    /**
     *  Tests that the water sensor info is split and humidity returned
     */    
    @Test
    public void testGetHumidity()
    {
        assertEquals(59, adaptedForecast.getHumidity(), 0);
        
        System.out.println("Testing getHumidity() \t\t\t OK");      
    }

    /**
     *  Tests that the water sensor info is split and rain level returned
     */    
    @Test
    public void testGetRainLevel()
    {
        assertEquals(0, adaptedForecast.getRainLevel());
        
        System.out.println("Testing getRainLevel() \t\t\t OK");         
    }

    /**
     *  Tests that the wind sensor info is split and wind speed returned
     */    
    @Test
    public void testGetWindSpeed()
    {
        assertEquals(5, adaptedForecast.getWindSpeed());
        
        System.out.println("Testing getWindSpeed() \t\t\t OK"); 
    }
   
    /**
     *  Tests that the wind sensor info is split and wind direction returned
     */      
    @Test
    public void testGetWindDirection()
    {
        assertEquals("NE", adaptedForecast.getWindDirection());
        
        System.out.println("Testing getWindDirection() \t\t OK"); 
    }
    
    /**
     *  Tests that the sky description matches
     */
    @Test
    public void testGetSkyDescription()
    {
        assertEquals("Cloudy Skies", adaptedForecast.getSkyDescription());
        
        System.out.println("Testing getSkyDescription() \t\t OK");
    }    
    
    @AfterClass
    public static void finishClass()
    {
        System.out.println("---------------------------------------------");
    }
    
}
