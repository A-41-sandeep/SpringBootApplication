package com.gl.bookingservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bid;

    private int uid;

    private int rid;

    public Booking(int bid, int uid, int rid) {
        this.bid = bid;
        this.uid = uid;
        this.rid = rid;
    }
    public Booking() {
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bid=" + bid +
                ", uid=" + uid +
                ", rid=" + rid +
                '}';
    }
}
