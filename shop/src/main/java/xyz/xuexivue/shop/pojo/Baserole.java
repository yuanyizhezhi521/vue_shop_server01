package xyz.xuexivue.shop.pojo;

import java.io.Serializable;

public class Baserole implements Serializable {
    private Integer rid;

    private String rname;

    private static final long serialVersionUID = 1L;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
}