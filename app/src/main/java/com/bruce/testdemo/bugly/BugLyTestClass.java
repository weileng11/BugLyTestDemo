package com.bruce.testdemo.bugly;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bruce.testdemo.R;

/**
 * Author:Bruce
 * Package:com.bruce.testdemo.bugly
 * time:2017/9/6.
 * contact：weileng143@163.com
 *
 * @description
 */

public class BugLyTestClass extends FragmentActivity {
//    @InjectView(R.id.btn)
//    Button btn;
//    @InjectView(R.id.activity_main)
//    RelativeLayout activityMain;

    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bugly_testclass_act);
        button=(Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BugClass bugClass = new BugClass();
                String bug = bugClass.bug();
                Toast.makeText(BugLyTestClass.this, bug, Toast.LENGTH_SHORT).show();
            }
        });
    }


//    @OnClick(R.id.btn)
//    public void onClick() {
//        BugClass bugClass = new BugClass();
//        String bug = bugClass.bug();
//        Toast.makeText(BugLyTestClass.this, bug, Toast.LENGTH_SHORT).show();
//    }
}
