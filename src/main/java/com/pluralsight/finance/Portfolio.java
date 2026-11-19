package com.pluralsight.finance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public BigDecimal getValue() {
        BigDecimal value = BigDecimal.ZERO;

        for (Valuable asset : assets) {
            value = value.add(asset.getValue());
        }
        return value;
    }

    public Valuable getMostValuable(){
        BigDecimal value = BigDecimal.ZERO;
        for (Valuable asset : assets) {
            if(asset.getValue().compareTo(value) == 1){
                value = asset.getValue();
            }
        }
        for (Valuable asset : assets) {
            if(asset.getValue().compareTo(value) == 0){
                return asset;
            }
        }
        return null;
    }

    public Valuable getLeastValuable(){
        BigDecimal value = new BigDecimal("1000000000000");

        for (Valuable asset : assets) {
            if(asset.getValue().compareTo(value) == -1){
                value = asset.getValue();
            }
        }
        for (Valuable asset : assets) {
            if(asset.getValue().compareTo(value) == 0){
                return asset;
            }
        }
        return null;
    }
}
