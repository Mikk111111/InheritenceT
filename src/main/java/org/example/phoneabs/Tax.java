package org.example.phoneabs;

import java.math.BigDecimal;

public class Tax extends Phone {
    private BigDecimal change;
    private final BigDecimal cost = BigDecimal.valueOf(0.25);
    public Tax(double coin) {
        super("Tax");
        this.change=BigDecimal.valueOf(coin);
    }
    @Override
    public void call(String dir) {
        if(change.compareTo(cost)>-1){
            System.out.println("Calling to:" + dir + ", from: " + super.getNumber());

        }
        System.out.println("Calling to:" + dir + ", from: " + super.getNumber());
    }
}
