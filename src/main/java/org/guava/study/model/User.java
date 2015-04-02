package org.guava.study.model;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/4/2
 * Time: 15:45
 */
public class User {

    private long userId;

    private String userName;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserId:" + this.getUserId() + ";UserName:" + this.getUserName();
    }
}
