package org.example.inheritence;

public class ClassD extends ClassB{
    String varDA;
    String varDB;
    public ClassD(String varBA)
    {
        super();
        this.varBA=varBA;
    }
    public void doDA(){
        this.varAA="";
        this.varAB="";
        this.varBB="";
        this.varBA="";
        this.varDA="";
        this.varDB="";
        super.doAA();
        super.doAB();
        super.doBA();
        super.doBB();
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
