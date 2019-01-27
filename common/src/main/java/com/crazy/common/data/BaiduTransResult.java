package com.crazy.common.data;

import lombok.Data;

import java.util.List;


/**
 * {"from":"en","to":"zh","trans_result":[{"src":"the world to cold","dst":"\u4e16\u754c\u53d8\u51b7\u4e86"}]}
 */

@Data
public class BaiduTransResult {
    private String from;
    private String to;
    private List<TransResult> trans_result;


    @Data
    public static class TransResult{
        private String src;
        private String dst;
    }


}
