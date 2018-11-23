package fr.wcs.blablawild.model;

import java.util.Date;

public class TripResultModel {

    private String firstName;
    private String lastName;
    private Date date;
    private int price;

    public TripResultModel(String firstName, String lastName, Date date, int price) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.price = price;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
