package com.donkor.demo.counttimer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCountTimer= (Button) findViewById(R.id.btnCountTimer);
        //倒计时总时间为10S，时间防止从9s开始显示
        MyCountTimer myCountTimer = new MyCountTimer(11000, 1000, btnCountTimer, "重新倒计时");
        myCountTimer.start();
    }
}
