package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name="clientId")
    private Client client;

    @Column
    private String portfolioName;

    @Column
    private String creationDate;

    protected Portfolio() {}

    public Portfolio(Client client, String portfolioName, String creationDate) {
        this.client = client;
        this.portfolioName = portfolioName;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {return this.portfolioId;}

    public Client getClient() {return client;}

    public String getPortfolioName() {return portfolioName;}

    public void setPortfolioName(String portfolioName) {this.portfolioName = portfolioName;}

    public String getCreationDate() {return creationDate;}

}
