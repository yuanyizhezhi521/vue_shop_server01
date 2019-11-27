package xyz.xuexivue.shop.util;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public static Map<String,Object> setMap(Object value){
        Map<String,Object> all=new HashMap<>();
        all.put("status", value);
        return all;
    }
}
