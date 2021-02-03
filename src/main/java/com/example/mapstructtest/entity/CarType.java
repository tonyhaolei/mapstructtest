package com.example.mapstructtest.entity;

import java.io.Serializable;

/**
 * TODO
 *
 * @author lei.hao
 * @date 2021/1/20
 */
public class CarType implements Serializable {

    private long id;

    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
