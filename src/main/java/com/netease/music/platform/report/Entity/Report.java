package com.netease.music.platform.report.Entity;

import java.util.Date;

public class Report {

    private Integer id;

    private String user;

    private String content;

    private Date createTime;

    private Date updateTime;

    public Report(Integer id, String user, String content, Date createTime, Date updateTime) {
        this.id = id;
        this.user = user;
        this.content = content;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
