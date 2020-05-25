package com.lws.cloud.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clientvisit")
public class ClientVisit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "visit_id")
    private Integer visitId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "visited_at")
    private String visitedAt;

    @Column(name = "phone")
    private String phoneNo;

    @Column(name = "client_id")
    private int clientId;

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVisitedAt() {
        return visitedAt;
    }

    public void setVisitedAt(String visitedAt) {
        this.visitedAt = visitedAt;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public ClientVisit(){

    }

    public ClientVisit(Integer visitId, String firstName, String lastName, String visitedAt, String phoneNo, int clientId) {
        this.visitId = visitId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.visitedAt = visitedAt;
        this.phoneNo = phoneNo;
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "ClientVisit{" +
                "visitId=" + visitId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", visitedAt='" + visitedAt + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", clientId=" + clientId +
                '}';
    }
}
