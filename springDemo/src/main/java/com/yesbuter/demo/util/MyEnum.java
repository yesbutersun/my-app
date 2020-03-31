package com.yesbuter.demo.util;

public enum MyEnum {
    sunday("星期日", 7),
    monday("星期一", 1),
    tuesday("星期二", 2),
    wednesday("星期三", 3);

    private String key;
    private int value;

    MyEnum(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
