package com.demo.otehr;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Authror huangshilu
 * @Date 2021/1/28 17:19
 */


public class UDF {

    public static void main(String[] args) {
        String wholeId = "10124-50563001642-50563001650-10106-50563002470-50563000635";
        String s = new UDF().castWholeIdToJson(wholeId);
        System.out.println(s);
    }

    public String castWholeIdToJson(String wholeId) {
        ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        String result = "";
        if (StringUtils.isEmpty(wholeId)) {
            return result;
        }
        //去掉开头和结尾的-
        if (wholeId.startsWith("-")) {
            wholeId = wholeId.substring(1, wholeId.length());
        }
        if (wholeId.endsWith("-")) {
            wholeId = wholeId.substring(0, wholeId.length() - 1);
        }
        Map<String, Long> resultMap = new HashMap<>();
        String[] split = wholeId.split("-");
        String key = "";

        for (int i = 0; i < split.length; i++) {
            key = "bns_area" + (i + 1) + "_id";
            resultMap.put(key, Long.parseLong(split[i]));
        }
        try {
            result = OBJECT_MAPPER.writeValueAsString(resultMap);
        } catch (Exception e) {
        }
        return result;
    }
}
