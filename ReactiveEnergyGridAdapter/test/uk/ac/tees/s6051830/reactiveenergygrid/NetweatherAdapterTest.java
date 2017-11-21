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

public class NetweatherAdapterTest
{

    /**
     *  59℉, 34% humidity, 0.05 inches of rain, winds at 6mph NW, partly cloudy skies
     */
    private NetweatherForecast rawForecast = new NetweatherForecast(59, 34, 0.05, "NW 6", "Partly Cloudy");
    private NetweatherAdapter adaptedForecast = new NetweatherAdapter(rawForecast);
    
    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("\nTesting NetweatherAdapter");
        System.out.println("---------------------------------------------");
    }


    /**
     *  Tests that the temperature is converted from F to C correctly
     */    
    @Test
    public void testGetTemperature()
    {
        assertEquals(15, adaptedForecast.getTemperature(), 0);
        
        System.out.println("Testing getTemperature() \t\t OK");
    }

    /**
     *  Tests that the humidity matches
     */    
    @Test
    public void testGetHumidity()
    {
        assertEquals(34, adaptedForecast.getHumidity(), 0);
        
        System.out.println("Testing getHumidity() \t\t\t OK");      
    }

    /**
     *  Tests that the rain level is converted from inches to millimetres correctly
     */    
    @Test
    public void testGetRainLevel()
    {
        assertEquals(1, adaptedForecast.getRainLevel());
        
        System.out.println("Testing getRainLevel() \t\t\t OK");         
    }

    /**
     *  Tests that the wind sensor info is split and wind speed returned
     */    
    @Test
    public void testGetWindSpeed()
    {
        assertEquals(6, adaptedForecast.getWindSpeed());
        
        System.out.println("Testing getWindSpeed() \t\t\t OK"); 
    }
   
     /**
     *  Tests that the wind sensor info is split and wind direction returned
     */     
    @Test
    public void testGetWindDirection()
    {
        assertEquals("NW", adaptedForecast.getWindDirection());
        
        System.out.println("Testing getWindDirection() \t\t OK"); 
    }
    
    /**
     *  Tests that the sky description matches
     */
    @Test
    public void testGetSkyDescription()
    {
        assertEquals("Partly Cloudy", adaptedForecast.getSkyDescription());
        
        System.out.println("Testing getSkyDescription() \t\t OK");
    }     
    
    @AfterClass
    public static void finishClass()
    {
        System.out.println("---------------------------------------------");
    }
    
}
