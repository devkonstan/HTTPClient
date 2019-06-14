package Weather;

import com.google.gson.annotations.SerializedName;

public class MainWeather {
    private Float temp;
    private Integer pressure;
    private Integer humidity;
    @SerializedName("temp_min")
    private Float tempMin;
    @SerializedName("temp_max")
    private Float tempMax;

    @Override
    public String toString() {
        return "Weather.MainWeather{" +
                "temp=" + temp +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                '}';
    }
}
