package xyz.xuexivue.shop.util;

import org.springframework.stereotype.Component;

@Component
public class MessageUtil {
    private String message;
    private  String error;
    private  String caveat;
    private  String Notice;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getCaveat() {
        return caveat;
    }

    public void setCaveat(String caveat) {
        this.caveat = caveat;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }
}
