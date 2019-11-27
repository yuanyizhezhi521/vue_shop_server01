package xyz.xuexivue.shop.pojo;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private Integer cid;

    private String cname;

    private String ctelphone;

    private String csex;

    private Date cbirthday;

    private Double cjifen;

    private Double cbalance;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtelphone() {
        return ctelphone;
    }

    public void setCtelphone(String ctelphone) {
        this.ctelphone = ctelphone;
    }

    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex;
    }

    public Date getCbirthday() {
        return cbirthday;
    }

    public void setCbirthday(Date cbirthday) {
        this.cbirthday = cbirthday;
    }

    public Double getCjifen() {
        return cjifen;
    }

    public void setCjifen(Double cjifen) {
        this.cjifen = cjifen;
    }

    public Double getCbalance() {
        return cbalance;
    }

    public void setCbalance(Double cbalance) {
        this.cbalance = cbalance;
    }
}