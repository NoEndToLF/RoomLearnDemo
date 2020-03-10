package com.example.roomlearndemo.model;

import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Date: 2020-03-09
 * Time: 17:01
 * Author: wangxiaoyun
 */
@Entity (tableName = "USER")
public class UserModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo (name ="NAME")
    private String name;
    @ColumnInfo (name ="DATE")
    private Date date;
    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserModel(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
