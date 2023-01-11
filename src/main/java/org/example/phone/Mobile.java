package org.example.phone;

public class Mobile extends Phone{

    private String sim;
    private int photos;
    public Mobile(String number,String sim) {
        super(number);
        this.sim=sim;
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

    @Override
    public String toString() {
        return "Mobile{" +
                "number='" + super.getNumber() +
                ", sound='" + super.getSound() +
                ", sim='" + sim +
                ", photos=" + photos +
                '}';
    }
}
