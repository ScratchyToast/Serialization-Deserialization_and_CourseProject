package alex.student.onpu.weather.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IconWeatherModel {

    @SerializedName("icon")
    @Expose
    String icon;

    @SerializedName("code")
    @Expose
    String code;

    @SerializedName("description")
    @Expose
    String description;

    public void setIcon(String icon){this.icon = icon;}
    public void setCode(String code){this.code = code;}
    public void setDescription(String description){this.description = description;}

    public String getIcon(){return this.icon;}
    public String getCode(){return this.code;}
    public String getDescription(){return this.description;}

    public String toString()
    {
        return String.format("icon: %s, code: %s, description: %s",
                             this.icon, this.code, this.description);
    }


}
