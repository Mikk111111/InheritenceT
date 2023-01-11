package org.example.phoneinreface;

import java.math.BigDecimal;

public class Tax implements Phone {
    private BigDecimal change;
    private String taxNumber = "Tax";
    private final BigDecimal cost = BigDecimal.valueOf(0.25);
    public Tax(double coin) {
        this.change=BigDecimal.valueOf(coin);
    }
    @Override
    public void call(String dir) {
        System.out.println("Calling to:" + dir + ", from: " + this.taxNumber);
    }
}
