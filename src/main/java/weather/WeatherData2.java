package weather;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class WeatherData2 {

    private double latitude;
    private double longitude;
    @SerializedName("generationtime_ms")
    private double generationTimeMs;
    @SerializedName("utc_offset_seconds")
    private int utcOffsetSeconds;
    private String timezone;
    @SerializedName("timezone_abbreviation")
    private String timezoneAbbreviation;
    private int elevation;

    @SerializedName("current_units")
    private CurrentUnits currentUnits;

    private Current current;

    @SerializedName("hourly_units")
    private HourlyUnits hourlyUnits;

    private Hourly hourly;

    // Getters and Setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getGenerationTimeMs() {
        return generationTimeMs;
    }

    public void setGenerationTimeMs(double generationTimeMs) {
        this.generationTimeMs = generationTimeMs;
    }

    public int getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public void setUtcOffsetSeconds(int utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public CurrentUnits getCurrentUnits() {
        return currentUnits;
    }

    public void setCurrentUnits(CurrentUnits currentUnits) {
        this.currentUnits = currentUnits;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public HourlyUnits getHourlyUnits() {
        return hourlyUnits;
    }

    public void setHourlyUnits(HourlyUnits hourlyUnits) {
        this.hourlyUnits = hourlyUnits;
    }

    public Hourly getHourly() {
        return hourly;
    }

    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    // Inner Classes
    public static class CurrentUnits {
        private String time;
        private String interval;
        @SerializedName("temperature_2m")
        private String temperature2m;
        @SerializedName("wind_speed_10m")
        private String windSpeed10m;

        // Getters and Setters
        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getInterval() {
            return interval;
        }

        public void setInterval(String interval) {
            this.interval = interval;
        }

        public String getTemperature2m() {
            return temperature2m;
        }

        public void setTemperature2m(String temperature2m) {
            this.temperature2m = temperature2m;
        }

        public String getWindSpeed10m() {
            return windSpeed10m;
        }

        public void setWindSpeed10m(String windSpeed10m) {
            this.windSpeed10m = windSpeed10m;
        }
    }

    public static class Current {
        private String time;
        private int interval;
        @SerializedName("temperature_2m")
        private double temperature2m;
        @SerializedName("wind_speed_10m")
        private double windSpeed10m;

        // Getters and Setters
        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getInterval() {
            return interval;
        }

        public void setInterval(int interval) {
            this.interval = interval;
        }

        public double getTemperature2m() {
            return temperature2m;
        }

        public void setTemperature2m(double temperature2m) {
            this.temperature2m = temperature2m;
        }

        public double getWindSpeed10m() {
            return windSpeed10m;
        }

        public void setWindSpeed10m(double windSpeed10m) {
            this.windSpeed10m = windSpeed10m;
        }
    }

    public static class HourlyUnits {
        private String time;
        @SerializedName("temperature_2m")
        private String temperature2m;
        @SerializedName("relative_humidity_2m")
        private String relativeHumidity2m;
        @SerializedName("wind_speed_10m")
        private String windSpeed10m;

        // Getters and Setters
        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTemperature2m() {
            return temperature2m;
        }

        public void setTemperature2m(String temperature2m) {
            this.temperature2m = temperature2m;
        }

        public String getRelativeHumidity2m() {
            return relativeHumidity2m;
        }

        public void setRelativeHumidity2m(String relativeHumidity2m) {
            this.relativeHumidity2m = relativeHumidity2m;
        }

        public String getWindSpeed10m() {
            return windSpeed10m;
        }

        public void setWindSpeed10m(String windSpeed10m) {
            this.windSpeed10m = windSpeed10m;
        }
    }

    public static class Hourly {
        private List<String> time;
        @SerializedName("temperature_2m")
        private List<Double> temperature2m;
        @SerializedName("relative_humidity_2m")
        private List<Integer> relativeHumidity2m;
        @SerializedName("wind_speed_10m")
        private List<Double> windSpeed10m;

        // Getters and Setters
        public List<String> getTime() {
            return time;
        }

        public void setTime(List<String> time) {
            this.time = time;
        }

        public List<Double> getTemperature2m() {
            return temperature2m;
        }

        public void setTemperature2m(List<Double> temperature2m) {
            this.temperature2m = temperature2m;
        }

        public List<Integer> getRelativeHumidity2m() {
            return relativeHumidity2m;
        }

        public void setRelativeHumidity2m(List<Integer> relativeHumidity2m) {
            this.relativeHumidity2m = relativeHumidity2m;
        }

        public List<Double> getWindSpeed10m() {
            return windSpeed10m;
        }

        public void setWindSpeed10m(List<Double> windSpeed10m) {
            this.windSpeed10m = windSpeed10m;
        }
    }
}
