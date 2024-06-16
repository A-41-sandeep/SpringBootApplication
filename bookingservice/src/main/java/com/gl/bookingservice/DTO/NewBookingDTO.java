package com.gl.bookingservice.DTO;

import java.util.List;

public class NewBookingDTO {
    private int uid;
    private List<Integer> rids;

    public NewBookingDTO(int uid, List<Integer> rids) {
        this.uid = uid;
        this.rids = rids;
    }
    public NewBookingDTO() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public List<Integer> getRids() {
        return rids;
    }

    public void setRids(List<Integer> rids) {
        this.rids = rids;
    }

    @Override
    public String toString() {
        return "newBookingDTO{" +
                "uid=" + uid +
                ", rids=" + rids +
                '}';
    }
}
