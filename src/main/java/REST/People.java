package REST;

import com.google.gson.annotations.SerializedName;

public class People {

    private String name;
    private String height;
    private String mass;
    @SerializedName("hair_color")
    private String hairColor;

    @Override
    public String toString() {
        return "REST.People{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", mass='" + mass + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}