package org.example.phoneinreface;

public class Mobile implements Phone {

    private String sim;
    private int photos;
    private String number;
    private String sound = "LA LA LA";

    public Mobile(String number,String sim) {
        this.number = number;
        this.sim = sim;
    }
    public void take() {
        this.photos++;
    }
    public String getSim() {
        return sim;
    }

    public int getPhotos() {
        return photos;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void call(String dir) {
        System.out.println("Calling to:" + dir + ", from: " + this.number);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "number='" + this.number +
                ", sound='" + this.sound +
                ", sim='" + this.sim +
                ", photos=" + this.photos +
                '}';
    }
}
