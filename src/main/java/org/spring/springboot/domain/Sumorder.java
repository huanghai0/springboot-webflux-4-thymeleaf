package org.spring.springboot.domain;

public class Sumorder {

    private String spid;
    private int snum;

    public String getSpid() {
        return spid;
    }

    public void setSpid(String spid) {
        this.spid = spid;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    @Override
    public String toString() {
        return "Sumorder{" +
                "spid='" + spid + '\'' +
                ", snum=" + snum +
                '}';
    }
}
