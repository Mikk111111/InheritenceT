package org.example.phone;

import java.math.BigDecimal;

public class Tax extends Phone{
    private BigDecimal change;
    private final BigDecimal cost = BigDecimal.valueOf(0.25);
    public Tax(double coin) {
        super("Tax");
        this.change=BigDecimal.valueOf(coin);
    }
    @Override
    public void call(String dir) {
        if(change.compareTo(cost)>-1){
            super.call(dir);
        }
        super.call(dir);
    }
}
