package com.example.roomlearndemo.dao;

import com.example.roomlearndemo.model.UserModel;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

/**
 * Date: 2020-03-09
 * Time: 20:24
 * Author: wangxiaoyun
 */
@Dao
public interface UserDao {
    @Query("SELECT * FROM USER")
    List<UserModel> getUserAll();
    @Query("SELECT * FROM USER WHERE NAME=:name")
    List<UserModel> getUserByName(String name);
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserModel userModel);
    @Update
    void update(UserModel userModel);
    @Delete
    void delete(UserModel userModel);
}
