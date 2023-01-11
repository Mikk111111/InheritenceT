package org.example.player;

public class VideoDVD implements Multimedia {
    private String songName;

    public VideoDVD(String name) {
        this.songName = name;
    }
    @Override
    public void play() {
        System.out.println("Movie: "+this.songName);
    }
}
