package com.hashsethealthcaremanagement.model;

import java.util.Objects;

public class Billing {

    private int bId;
    private int bill;
    private  int totalBill;
    private int personId;

    @Override
    public String toString() {
        return "Billing{" +
                "bId=" + bId +
                ", bill=" + bill +
                ", totalBill=" + totalBill +
                ", personId=" + personId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Billing billing = (Billing) o;
        return getbId() == billing.getbId() && getBill() == billing.getBill() && getTotalBill() == billing.getTotalBill() && getPersonId() == billing.getPersonId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getbId(), getBill(), getTotalBill(), getPersonId());
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
