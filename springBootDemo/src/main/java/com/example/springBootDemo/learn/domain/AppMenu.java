package com.example.springBootDemo.learn.domain;

import java.util.Date;

public class AppMenu {
    private Integer id;

    private String name;

    private String picUrl;

    private String relationModel;

    private String type;

    private String orderMethod;

    private Byte isRecommended;

    private String menuType;

    private Byte status;

    private Integer sort;

    private Date createTime;

    private Date updateTime;

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

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getRelationModel() {
        return relationModel;
    }

    public void setRelationModel(String relationModel) {
        this.relationModel = relationModel == null ? null : relationModel.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getOrderMethod() {
        return orderMethod;
    }

    public void setOrderMethod(String orderMethod) {
        this.orderMethod = orderMethod == null ? null : orderMethod.trim();
    }

    public Byte getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(Byte isRecommended) {
        this.isRecommended = isRecommended;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}