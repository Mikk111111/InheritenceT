package org.example.player;

public class MusicCD implements Multimedia{
    private String artist;
    public MusicCD(String artist) {
        this.artist=artist;
    }
    @Override
    public void play() {
        System.out.println("Music played by: "+this.artist);
    }
}
