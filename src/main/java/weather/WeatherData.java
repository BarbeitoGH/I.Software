package weather;


import com.google.gson.annotations.SerializedName;

public class WeatherData {

    @SerializedName("current")
    private Current current;

    @SerializedName("hourly")
    private Hourly hourly;

    // Getters y Setters
    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Hourly getHourly() {
        return hourly;
    }

    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    // Clase Current (información actual)
    public static class Current {
        @SerializedName("temperature_2m")
        private double temperature_2m;  // Temperature in Celsius
        @SerializedName("wind_speed_10m")
        private double wind_speed_10m;    // Wind speed in m/s
        private int relative_humidity_2m;        // Humidity in percentage

        // Getters y Setters
        public double getTemperature() {
            return temperature_2m;
        }

        public void setTemperature(double temperature) {
            this.temperature_2m = temperature;
        }

        public double getWindSpeed() {
            return wind_speed_10m;
        }

        public void setWindSpeed(double windSpeed) {
            this.wind_speed_10m = windSpeed;
        }

        public int getHumidity() {
            return relative_humidity_2m;
        }

        public void setHumidity(int humidity) {
            this.relative_humidity_2m = humidity;
        }
    }

    // Clase Hourly (pronóstico horario)
    public static class Hourly {
        @SerializedName("temperature_2m")
        private double[] temperature_2m;  // Hourly temperature in Celsius

        @SerializedName("relative_humidity_2m")
        private int[] relative_humidity_2m;  // Hourly humidity in percentage

        // Getters y Setters
        public double[] getTemperature() {
            return temperature_2m;
        }

        public void setTemperature(double[] temperature_2m) {
            this.temperature_2m = temperature_2m;
        }

        public int[] getHumidity() {
            return relative_humidity_2m;
        }

        public void setHumidity(int[] relative_humidity_2m) {
            this.relative_humidity_2m = relative_humidity_2m;
        }
    }
}