package com.example.springBootDemo.learn.domain;

import java.util.Date;

public class SubTaskInfo {
    private Integer id;

    private Integer taskId;

    private String name;

    private Integer duration;

    private Integer type;

    private Integer interval;

    private Integer coinRate;

    private Integer backupRate;

    private Date updateTime;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Integer getCoinRate() {
        return coinRate;
    }

    public void setCoinRate(Integer coinRate) {
        this.coinRate = coinRate;
    }

    public Integer getBackupRate() {
        return backupRate;
    }

    public void setBackupRate(Integer backupRate) {
        this.backupRate = backupRate;
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