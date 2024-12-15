package weather;



import com.google.gson.Gson;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainHttpExample {

    public static void main(String[] args) {
        // URL de la API de Open-Meteo para la ubicación de Berlín
        String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m";
        
        try {
            // Realizar la solicitud HTTP a la API
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            // Leer la respuesta de la API
            Scanner scanner = new Scanner(connection.getInputStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNext()) {
                response.append(scanner.nextLine());
            }
            scanner.close();

            // Parsear la respuesta JSON usando Gson
            Gson gson = new Gson();
            WeatherData weatherData = gson.fromJson(response.toString(), WeatherData.class);

            // Mostrar los datos actuales
            System.out.println("Current temperature: " + weatherData.getCurrent().getTemperature() + "°C");
            System.out.println("Current wind speed: " + weatherData.getCurrent().getWindSpeed() + " m/s");
            System.out.println("Current humidity: " + weatherData.getCurrent().getHumidity() + "%");

            // Mostrar la temperatura y humedad de las próximas horas
            System.out.println("\nHourly Forecast:");
            for (int i = 0; i < weatherData.getHourly().getTemperature().length; i++) {
                System.out.println("Hour " + i + ": Temperature = " + weatherData.getHourly().getTemperature()[i] + "°C, Humidity = " + weatherData.getHourly().getHumidity()[i] + "%");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}