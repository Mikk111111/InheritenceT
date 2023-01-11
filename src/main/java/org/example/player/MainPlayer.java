package org.example.player;

public class MainPlayer {
    public static void main(String[] args) {
        PlayerInplement player = new PlayerInplement();
        MusicCD cd1 = new MusicCD("Sting");
        MusicCD cd2 = new MusicCD("Radzis");
        MusicCD cd3 = new MusicCD("Cicinas");
        MusicCD cd4 = new MusicCD("Meru");

        player.run(cd1);
        player.run(cd2);
        player.run(cd3);
        player.run(cd4);

        VideoDVD dvd1 = new VideoDVD("Terminator");
        VideoDVD dvd2 = new VideoDVD("Ate");
        VideoDVD dvd3 = new VideoDVD("Sveiki");
        VideoDVD dvd4 = new VideoDVD("Vel");

        player.run(dvd1);
        player.run(dvd2);
        player.run(dvd3);
        player.run(dvd4);

        Blueray br1 = new Blueray("Sorana");
    }
}
