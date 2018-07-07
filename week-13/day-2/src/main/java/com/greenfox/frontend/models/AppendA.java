package com.greenfox.frontend.models;

public class AppendA {

    String appendable;

    public AppendA(String appendable) {
        this.appendable = appendable;
    }

    public AppendA() {
    }

    public String append(String appendable) {
        String appended = appendable + "a";
        return appended;
    }

    public String getAppendable() {
        return appendable;
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }
}
