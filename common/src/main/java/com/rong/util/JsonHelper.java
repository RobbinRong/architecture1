package com.rong.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by rongjiabin on 2017/9/2.
 */
public class JsonHelper {
    private JsonHelper(){}
    public  static  String object2str(Object object){
        ObjectMapper mapper=new ObjectMapper();
        String str=null;
        try {
            str=mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }
}
