package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name="advisorId")
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String address;

    protected Client() {

    }

    public Client(Advisor advisor, String firstName, String lastName, String email, String phone, String address){
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public long getClientId() {return this.clientId;}

    public Advisor getAdvisor() {return this.advisor;}

    public void setAdvisor(Advisor advisor) {this.advisor = advisor;}

    public String getFirstName() {return this.firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return this.lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return this.email;}

    public void setEmail(String email) {this.email = email;}

    public String getPhone() {return this.phone;}

    public void setPhone(String phone) {this.phone = phone;}

    public String getAddress() {return this.address;}

    public void setAddress(String address) {this.address = address;}

}
