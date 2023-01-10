package org.example.inheritence;

public class ClassD extends ClassB{
    String varDA;
    String varDB;
    public void doDA(){

    }
    public void doDB(){

    }

    @Override
    public String toString() {
        return "ClassD{" +
                "varDA='" + varDA + '\'' +
                ", varDB='" + varDB + '\'' +
                ", varBA='" + varBA + '\'' +
                ", varBB='" + varBB + '\'' +
                ", varAA='" + varAA + '\'' +
                ", varAB='" + varAB + '\'' +
                '}';
    }
}
