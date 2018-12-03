package com.kodilla.good.patterns.food2door;

public class Supplier {
    private int suppId;
    private String suppName;
    private String prodType;
    private boolean contract;

    public Supplier(int suppId, String suppName, String prodType, boolean contract) {
        this.suppId = suppId;
        this.suppName = suppName;
        this.prodType = prodType;
        this.contract = contract;
    }

    public int getSuppId() {
        return suppId;
    }

    public String getSuppName() {
        return suppName;
    }

    public String getProdType() {
        return prodType;
    }

    public boolean isContract() {
        return contract;
    }
}
