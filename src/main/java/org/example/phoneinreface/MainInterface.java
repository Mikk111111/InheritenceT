package org.example.phoneinreface;

public class MainInterface {
    public static void main(String[] arg){
        //Phone ph01 = new Phone("370-666");
        Mobile mb01 = new Mobile("370-777","11");
        Tax tx01 = new Tax(0.5);
        //ph01.setSound("Ha-Ha");
        //System.out.println(ph01);
        //ph01.call("370-567");
        //ph01.call("370-233");
        mb01.call("370-234");
        System.out.println(mb01);
    }
}
