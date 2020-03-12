package com.fastbj.user.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class User implements Serializable {
    private String id;
    private String loginName;
    private String userName;

    public void setId(String id) {
        this.id = id;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    private String password;
    private Date createDate;

    public String getId() {
        return id;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreateDate() {
        return createDate;
    }
}
