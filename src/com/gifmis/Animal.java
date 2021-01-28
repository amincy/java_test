package com.gifmis;

public class Animal {
    private int legs;
    private String sound;
    private String pikin;
    private String color;

    public Animal(int legs, String sound, String pikin, String color) {
        this.legs = legs;
        this.sound = sound;
        this.pikin = pikin;
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getPikin() {
        return pikin;
    }

    public void setPikin(String pikin) {
        this.pikin = pikin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
