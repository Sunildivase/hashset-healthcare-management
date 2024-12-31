package com.hashsethealthcaremanagement.model;

import java.util.Objects;

public class Prescription {

    private  int pId;
    private String pDetails;
    private int personId;

    @Override
    public String toString() {
        return "Prescription{" +
                "pId=" + pId +
                ", pDetails='" + pDetails + '\'' +
                ", personId=" + personId +
                '}';
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpDetails() {
        return pDetails;
    }

    public void setpDetails(String pDetails) {
        this.pDetails = pDetails;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return getpId() == that.getpId() && getPersonId() == that.getPersonId() && Objects.equals(getpDetails(), that.getpDetails());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getpId(), getpDetails(), getPersonId());
    }
}
