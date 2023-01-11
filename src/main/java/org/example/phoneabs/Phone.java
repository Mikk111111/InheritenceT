package org.example.phoneabs;

public abstract class Phone {

    private String number;
    private String sound;

    public Phone(String number) {
        this.number = number;
    }
    public abstract void call(String number);

    //public void call(String dir) {
    //    System.out.println("Calling to:" + dir + ", from: " + this.number);
    //}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number +
                ", sound='" + sound +
                '}';
    }
}
