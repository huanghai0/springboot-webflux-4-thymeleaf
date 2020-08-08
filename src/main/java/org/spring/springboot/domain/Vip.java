package org.spring.springboot.domain;

public class Vip {
    private int vid;
    private String vname;
    private Double vprice;
    private Double vdis;

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Double getVprice() {
        return vprice;
    }

    public void setVprice(Double vprice) {
        this.vprice = vprice;
    }

    public Double getVdis() {
        return vdis;
    }

    public void setVdis(Double vdis) {
        this.vdis = vdis;
    }
}
