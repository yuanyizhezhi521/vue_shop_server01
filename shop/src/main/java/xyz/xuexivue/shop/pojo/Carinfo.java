package xyz.xuexivue.shop.pojo;

import java.io.Serializable;

public class Carinfo implements Serializable {
    private Integer id;

    private String carno;

    private String cartype;

    private Double carprice;

    private Integer carstate;

    private String cardesc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public Double getCarprice() {
        return carprice;
    }

    public void setCarprice(Double carprice) {
        this.carprice = carprice;
    }

    public Integer getCarstate() {
        return carstate;
    }

    public void setCarstate(Integer carstate) {
        this.carstate = carstate;
    }

    public String getCardesc() {
        return cardesc;
    }

    public void setCardesc(String cardesc) {
        this.cardesc = cardesc;
    }
}