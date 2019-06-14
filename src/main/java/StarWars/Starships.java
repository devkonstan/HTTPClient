package StarWars;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Starships {
    private String name;
    private String model;
    private String manufacturer;
    @SerializedName("cost_in_credits")
    private String costInCredits;
    private String length;
    @SerializedName("max_atmosphering_speed")
    private String maxAtmospheringSpeed;
    private String crew;
    private String passengers;
    @SerializedName("cargo_capacity")
    private String cargoCapacity;
    private String consumables;
    @SerializedName("hyperdrive_rating")
    private String hyperdriveRating;
    private String MGLT;
    private String starship_class;

    private String[] pilots;
    private String[] films;

    private String created;
    private String edited;
    private String url;

    public Starships() {
    }

    @Override
    public String toString() {
        return "StarWars.Starships{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", costInCredits='" + costInCredits + '\'' +
                ", length='" + length + '\'' +
                ", maxAtmospheringSpeed='" + maxAtmospheringSpeed + '\'' +
                ", crew='" + crew + '\'' +
                ", passengers='" + passengers + '\'' +
                ", cargoCapacity='" + cargoCapacity + '\'' +
                ", consumables='" + consumables + '\'' +
                ", hyperdriveRating='" + hyperdriveRating + '\'' +
                ", MGLT='" + MGLT + '\'' +
                ", starship_class='" + starship_class + '\'' +
                ", pilots=" + Arrays.toString(pilots) +
                ", films=" + Arrays.toString(films) +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
