/**
 * MetOfficeForecastTest.java
 * Tests the adapter functionality from MetOfficeForecast
 * 
 * @author Tom Wilson (S605130)
 */

package uk.ac.tees.s6051830.reactiveenergygrid;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MetOfficeForecastTest {
    
    /**
     *  18.5℃, 48% humidity, 0mm rain, winds at 3mph NE, cloudy skies
     */
    private MetOfficeForecast forecast = new MetOfficeForecast(18.5, 48, 0, 3, "NE", "Cloudy Skies");
    
    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("\nTesting MetOfficeForecast");
        System.out.println("---------------------------------------------");
    }    
    
    /**
     * Test of getTemperature method, of class MetOfficeForecast.
     */
    @Test
    public void testGetTemperature()
    {
        assertEquals(18.5, forecast.getTemperature(), 0);
        
        System.out.println("Testing getTemperature() \t\t OK");
    }

    /**
     * Test of getHumidity method, of class MetOfficeForecast.
     */
    @Test
    public void testGetHumidity()
    {
        assertEquals(48, forecast.getHumidity(), 0);
        
        System.out.println("Testing getHumidity() \t\t\t OK");   
    }

    /**
     * Test of getRainLevel method, of class MetOfficeForecast.
     */
    @Test
    public void testGetRainLevel()
    {
        assertEquals(0, forecast.getRainLevel());
        
        System.out.println("Testing getRainLevel() \t\t\t OK"); 
    }

    /**
     * Test of getWindSpeed method, of class MetOfficeForecast.
     */
    @Test
    public void testGetWindSpeed()
    {
        assertEquals(3, forecast.getWindSpeed());
        
        System.out.println("Testing getWindSpeed() \t\t\t OK"); 
    }

    /**
     * Test of getWindDirection method, of class MetOfficeForecast.
     */
    @Test
    public void testGetWindDirection()
    {
        assertEquals("NE", forecast.getWindDirection());
        
        System.out.println("Testing getWindDirection() \t\t OK"); 
    }

    /**
     * Test of getSkyDescription method, of class MetOfficeForecast.
     */
    @Test
    public void testGetSkyDescription()
    {
        assertEquals("Cloudy Skies", forecast.getSkyDescription());
        
        System.out.println("Testing getSkyDescription() \t\t OK");
    }
    
    @AfterClass
    public static void finishClass()
    {
        System.out.println("---------------------------------------------");
    }    
    
}
