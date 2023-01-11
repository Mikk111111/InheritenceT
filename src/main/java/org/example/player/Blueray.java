package org.example.player;

public class Blueray implements Multimedia{
    private String name;
    public Blueray(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println("Blueray: "+this.name);
    }
}
