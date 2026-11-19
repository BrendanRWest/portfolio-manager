package com.pluralsight.finance;

import java.math.BigDecimal;

public class Jewelry extends FixedAsset{
    private double carat;

    public Jewelry(String name, double carat) {
        super(name);
        this.carat = carat;
    }

    @Override
    public BigDecimal getValue(){
        return new BigDecimal("3500").multiply(BigDecimal.valueOf(carat));
    }
}
