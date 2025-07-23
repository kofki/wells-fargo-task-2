package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    @JoinColumn(name="portfolioId")
    private Portfolio portfolio;

    @Column
    private String securityName;

    @Column
    private String category;

    @Column
    private String purchaseDate;

    @Column
    private double purchasePrice;

    @Column
    private double quantity;

    protected Security() {}

    public Security(Portfolio portfolio, String securityName, String category, String purchaseDate, double purchasePrice, double quantity) {
        this.portfolio = portfolio;
        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public long getSecurityId() {return securityId;}

    public Portfolio getPortfolio() {return portfolio;}

    public void setPortfolio(Portfolio portfolio) {this.portfolio = portfolio;}

    public String getSecurityName() {return securityName;}

    public void setSecurityName(String securityName) {this.securityName = securityName;}

    public String getCategory() {return category;}

    public void setCategory(String category) {this.category = category;}

    public String getPurchaseDate() {return this.purchaseDate;}

    public void setPurchaseDate(String purchaseDate) {this.purchaseDate = purchaseDate;}

    public double getPurchasePrice() {return this.purchasePrice;}

    public void setPurchasePrice(double purchasePrice) {this.purchasePrice = purchasePrice;}

    public double getQuantity() {return this.quantity;}

    public void setQuantity(double quantity) {this.quantity = quantity;}

}
