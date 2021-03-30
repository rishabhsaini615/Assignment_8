package com.rishabh;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter your name").trim();

        JOptionPane.showMessageDialog(null, "Welcome "+name);
        while(true) {
            String day = null;
            float temp = 0, speedOfWind = 0;
            try {
                day = getDay();
                temp = getFloat("Enter the temperature for " + day + "in degree C");
                speedOfWind = getFloat("Enter the wind speed in Km/h");
            }catch (NullPointerException e){
                System.out.println("Thank you!");
                return;
            }
            Temp temperature = new Temp(day, temp, speedOfWind);

            JOptionPane.showMessageDialog(null, temperature.outputString());

            int input = JOptionPane.showConfirmDialog(null, "Do you want to calculate for another day");

            if (input != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }

    public static String getDay(){
        String day = JOptionPane.showInputDialog("Enter the day").trim();
        return day;
    }

    public static float getFloat(String prompt){
        float temperature = 0;
        try{
            temperature = Float.parseFloat(JOptionPane.showInputDialog(prompt).trim());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Wrong Input! Try Again!");
            getFloat(prompt);
        }

        return temperature;
    }

}