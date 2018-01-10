package com.hexin.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author shengwen.zhang
 * @createDate 2017-09-25 13:54:42
 * @description 基础bean
 */
public class BaseBean implements Serializable {
    protected int id; // 主键ID
    protected long version; // 记录版本号
    protected String createName; // 创建人
    protected String updateName; // 更新人
    protected Date createTime; // 创建时间
    protected Date updateTime; // 更新时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
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
