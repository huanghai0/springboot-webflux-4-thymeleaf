package org.spring.springboot.domain;

public class Product {
    private int pid;
    private  String pname;
    private  Double pprice;
    private int pmid;

    public int getPmid() {
        return pmid;
    }

    public void setPmid(int pmid) {
        this.pmid = pmid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }
}
