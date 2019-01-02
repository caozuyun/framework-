package com.example.springBootDemo.learn.domain;

import java.util.Date;

public class TaskInfo {
    private Integer id;

    private String name;

    private Integer limitNum;

    private Integer profit;

    private Integer ratio;

    private Integer coin;

    private Integer limitCoin;

    private Byte isDefaultRate;

    private String tag;

    private Integer type;

    private Byte isRecommended;

    private Byte status;

    private String packageName;

    private String googlePlayLink;

    private String href;

    private Date updateTime;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public Integer getProfit() {
        return profit;
    }

    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getLimitCoin() {
        return limitCoin;
    }

    public void setLimitCoin(Integer limitCoin) {
        this.limitCoin = limitCoin;
    }

    public Byte getIsDefaultRate() {
        return isDefaultRate;
    }

    public void setIsDefaultRate(Byte isDefaultRate) {
        this.isDefaultRate = isDefaultRate;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Byte getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(Byte isRecommended) {
        this.isRecommended = isRecommended;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getGooglePlayLink() {
        return googlePlayLink;
    }

    public void setGooglePlayLink(String googlePlayLink) {
        this.googlePlayLink = googlePlayLink == null ? null : googlePlayLink.trim();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
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