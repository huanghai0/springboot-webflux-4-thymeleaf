package org.spring.springboot.domain;

public class Sale {
    private int sid;
    private String stime;
    private int soid;
    private String sphone;
    private String sseason;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public int getSoid() {
        return soid;
    }

    public void setSoid(int soid) {
        this.soid = soid;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSseason() {
        return sseason;
    }

    public void setSseason(String sseason) {
        this.sseason = sseason;
    }
}
