package com.example.roomlearndemo.db;

import android.content.Context;
import android.service.autofill.UserData;

import com.example.roomlearndemo.dao.UserDao;
import com.example.roomlearndemo.model.UserModel;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

/**
 * Date: 2020-03-09
 * Time: 20:43
 * Author: wangxiaoyun
 */
@Database(entities = {UserModel.class},version = 1,exportSchema = false)
@TypeConverters({ConversionFactory.class})
public abstract class UserDatabase extends RoomDatabase {
    public static UserDatabase getDefault(Context context){
        return buildDatabase(context);
    }

    private static UserDatabase buildDatabase(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(), UserDatabase.class, "PHONE.db")
                .allowMainThreadQueries()
                .build();
    }
    public abstract UserDao getUserDao();
}
