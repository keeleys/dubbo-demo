package com.ttianjun.bean;

import java.io.Serializable;

/**
 * Created by keeley on 16/1/14.
 */
public class Order implements Serializable{
    private int id;
    private String name;
    private String no;

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getId() {
        return id;

    }

}
