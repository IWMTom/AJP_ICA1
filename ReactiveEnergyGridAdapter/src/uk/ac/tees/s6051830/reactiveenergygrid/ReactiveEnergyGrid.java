/**
 * ReactiveEnergyGrid.java
 *
 * @author Tom Wilson (S605130)
 */

package uk.ac.tees.s6051830.reactiveenergygrid;

import java.text.DecimalFormat;

public class ReactiveEnergyGrid
{

    public static void main(String[] args)
    {
        Forecast forecastA = new MetOfficeForecast(16.5, 57.9, 1, 5, "NE", "Partially Cloudy");
        Forecast forecastB = new MeteoGroupAdapter(new MeteoGroupForecast(18.9, "34.1-2", "3:NW", "Cloudy"));
        Forecast forecastC = new NetweatherAdapter(new NetweatherForecast(64.4, 42.9, 0.11, "SW 8", "Sunny Patches"));
        
        Forecast[] weatherForecasts = {forecastA, forecastB, forecastC};
        DecimalFormat df = new DecimalFormat("#.0"); 
        
        for (Forecast forecast : weatherForecasts)
        {
            System.out.println("Weather Forecast");
            System.out.println("---------------------------------");
            System.out.println("Temperature:\t" + df.format(forecast.getTemperature()) + "\u2103");
            System.out.println("Humidity:\t" + forecast.getHumidity() + "%");
            System.out.println("Rain Level:\t" + forecast.getRainLevel() + "mm");
            System.out.println("Wind:\t\t" + forecast.getWindDirection() + " " + forecast.getWindSpeed() + "mph");
            System.out.println("Skies:\t\t" + forecast.getSkyDescription());
            System.out.println("---------------------------------\n\n");
        }
    }
    
}
