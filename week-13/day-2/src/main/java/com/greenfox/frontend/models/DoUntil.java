package com.greenfox.frontend.models;

public class DoUntil {
    int until;

    public DoUntil(int until) {
        this.until = until;
    }

    public DoUntil() {
    }

    public int countUntil(int until) {
        int result = 0;
        for (int i = 1; i <= until; i++) {
            result += i;
        }
        return result;
    }

    public int factorUntil(int until) {
        int result = 1;
        for (int i = 1; i <= until; i++) {
            result *= i;
        }
        return result;
    }

    public int getUntil() {
        return until;
    }

    public void setUntil(int until) {
        this.until = until;
    }
}
