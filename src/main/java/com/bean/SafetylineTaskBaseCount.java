package com.bean;

/**
 * @author hls
 * @date 2020/12/29 18:58
 */

public class SafetylineTaskBaseCount {


    private String tenant;


    /**
     * 总共条数
     */
    private long totalCount;

    /**
     * 待处理条数
     */
    private long needHandleCount;

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getNeedHandleCount() {
        return needHandleCount;
    }

    public void setNeedHandleCount(long needHandleCount) {
        this.needHandleCount = needHandleCount;
    }


}
