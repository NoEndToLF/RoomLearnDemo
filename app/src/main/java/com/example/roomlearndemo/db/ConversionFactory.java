package com.example.roomlearndemo.db;

import java.util.Date;

import androidx.room.TypeConverter;

/**
 * Date: 2020-03-09
 * Time: 20:41
 * Author: wangxiaoyun
 */
public class ConversionFactory {
    @TypeConverter
    public static Long fromDateToLong(Date date) {
        return date == null ? null : date.getTime();
    }

    @TypeConverter
    public static Date fromLongToDate(Long value) {
        return value == null ? null : new Date(value);
    }
}
