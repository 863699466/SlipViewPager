package com.android.meiko;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.android.slip.SwipeViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwipeViewPager mSwipeView = (SwipeViewPager) findViewById(R.id.swip_viewpage);
        CustomViewPageAdapter adapter = new CustomViewPageAdapter(this, getAdData());
        if (mSwipeView != null) {
            mSwipeView.updateIndicatorView(getAdData().size());
            mSwipeView.setAdapter(adapter);
            mSwipeView.startScorll();
        }
    }


    // 广告数据
    public static List<Integer> getAdData() {
        List<Integer> adList = new ArrayList<>();
        adList.add(R.mipmap.guide_bg1);
        adList.add(R.mipmap.guide_bg2);
        adList.add(R.mipmap.guide_bg3);
        return adList;
    }
}
