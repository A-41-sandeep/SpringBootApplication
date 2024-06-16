package com.gl.roomservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rid;
    private String type;
    private int cost;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Room(int rid, String type, int cost) {
        this.rid = rid;
        this.type = type;
        this.cost = cost;
    }
    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "rid=" + rid +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                '}';
    }
}
