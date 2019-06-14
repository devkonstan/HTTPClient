package Weather;

public class Weather{
    private Integer id;
    private String main;
    private String description;
    private String icon;

    @Override
    public String toString() {
        return "Weather.Weather{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
