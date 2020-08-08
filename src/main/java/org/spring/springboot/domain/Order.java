package org.spring.springboot.domain;

import java.util.Date;

public class Order {
    private int oid;
    private String otime;
    private String odate;
    private String ophone;
    private int opid;
    private int ocid;
    private int ostat;

    public int getOstat() {
        return ostat;
    }

    public void setOstat(int ostat) {
        this.ostat = ostat;
    }

    public int getOcid() {
        return ocid;
    }

    public void setOcid(int ocid) {
        this.ocid = ocid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate;
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone;
    }

    public int getOpid() {
        return opid;
    }

    public void setOpid(int opid) {
        this.opid = opid;
    }
}
