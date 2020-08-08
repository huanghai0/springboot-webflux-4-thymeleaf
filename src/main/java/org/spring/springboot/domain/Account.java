package org.spring.springboot.domain;

public class Account {
    private String aid;
    private String aname;
    private String apwd;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid='" + aid + '\'' +
                ", aname='" + aname + '\'' +
                ", apwd='" + apwd + '\'' +
                '}';
    }
}
