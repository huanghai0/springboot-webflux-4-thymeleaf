package org.spring.springboot.domain;

public class Mater {

    private int mid;
    private String mname;
    private String mtime;
    private Double mprice;
    private int mnum;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    public Double getMprice() {
        return mprice;
    }

    public void setMprice(Double mprice) {
        this.mprice = mprice;
    }

    public int getMnum() {
        return mnum;
    }

    public void setMnum(int mnum) {
        this.mnum = mnum;
    }

    @Override
    public String toString() {
        return "Mater{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mtime='" + mtime + '\'' +
                ", mprice=" + mprice +
                ", mnum=" + mnum +
                '}';
    }
}
