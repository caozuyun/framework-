package com.example.springBootDemo.learn.domain;

import java.util.Date;

public class UserInfo {
    private Integer id;

    private String userId;

    private Integer accountId;

    private Integer curCoin;

    private Integer totalCoin;

    private Integer dayCoin;

    private Date updateTime;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getCurCoin() {
        return curCoin;
    }

    public void setCurCoin(Integer curCoin) {
        this.curCoin = curCoin;
    }

    public Integer getTotalCoin() {
        return totalCoin;
    }

    public void setTotalCoin(Integer totalCoin) {
        this.totalCoin = totalCoin;
    }

    public Integer getDayCoin() {
        return dayCoin;
    }

    public void setDayCoin(Integer dayCoin) {
        this.dayCoin = dayCoin;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}