package com.rishabh;

public class Temp{
    private final String day;
    private final float temp;
    private final float speedOfWind;

    public Temp(String day, float temp, float windSpeed){
        this.day = day;
        this.temp = temp;
        this.speedOfWind = windSpeed;
    }

    public float feelsLike(){
        return temp * speedOfWind; // formula for feels like temp
    }

    public String outputString(){
        StringBuilder output = new StringBuilder();
        output.append("day - "+day+"\n");
        output.append("temp - ").append(temp).append("\n");
        output.append("Wind speed - ").append(speedOfWind);
        output.append("\nFeels Like temp - ").append(feelsLike());
        return output.toString();
    }
}
