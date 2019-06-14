package Weather;

import java.util.Arrays;

public class WeatherAPI {

    private Coord coord;
    private MainWeather main;
    private Weather[] weather;

    private String base;
    private Integer visibility;
    private String dt;
    private Integer id;
    private String name;
    private Integer cod;

    @Override
    public String toString() {
        return "Weather.WeatherAPI{" +
                "coord=" + coord +
                ", weather=" + Arrays.toString(weather) +
                ", base='" + base + '\'' +
                ", main=" + main +
                ", visibility=" + visibility +
                ", dt='" + dt + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }
}
