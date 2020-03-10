package com.example.roomlearndemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.roomlearndemo.db.UserDatabase;
import com.example.roomlearndemo.model.UserModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserModel userModel=new UserModel(1,"老王");
        UserDatabase.getDefault(this).getUserDao().insert(userModel);
        List<UserModel> userModelList=UserDatabase.getDefault(this).getUserDao().getUserAll();
        for (UserModel userModel1:userModelList){
            Log.v("heihei=",userModel1.getId()+"="+userModel1.getName());
        }
    }
}
