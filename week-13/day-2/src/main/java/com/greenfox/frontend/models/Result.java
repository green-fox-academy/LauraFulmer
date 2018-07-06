package com.greenfox.frontend.models;

import org.springframework.stereotype.Component;

@Component
public class Result {

    Integer received;
    Integer result;

    public Result(Integer result) {
        this.result = result;
    }

    public Result() {
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }
}