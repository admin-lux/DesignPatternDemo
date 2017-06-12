package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public class Currency {
    private CurrencyType type = CurrencyType.RMB;
    private float price;

    public Currency() {
    }

    public Currency(float price) {
        this.price = price;
    }

    public Currency(CurrencyType type, float price) {
        this.type = type;
        this.price = price;
    }

    public CurrencyType getType() {
        return type;
    }

    public void setType(CurrencyType type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public enum CurrencyType {
        RMB("RMB");

        private String type;

        CurrencyType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
