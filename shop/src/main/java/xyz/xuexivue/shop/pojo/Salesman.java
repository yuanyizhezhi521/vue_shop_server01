package xyz.xuexivue.shop.pojo;

import java.io.Serializable;

public class Salesman implements Serializable {
    private Integer sid;

    private String sname;

    private String stelphone;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getStelphone() {
        return stelphone;
    }

    public void setStelphone(String stelphone) {
        this.stelphone = stelphone;
    }
}