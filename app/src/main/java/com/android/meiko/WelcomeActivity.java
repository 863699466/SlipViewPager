package com.android.meiko;

import android.app.Activity;
import android.os.Bundle;

import com.android.slip.SwipeViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 蜡笔小新
 * @date: 2016-05-27 14:08
 * @GitHub: https://github.com/meikoz
 */
public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //设置状态栏透明
        StatusBarUtil.setTranslucentBackground(this);

        SwipeViewPager mSwipeView = (SwipeViewPager) findViewById(R.id.swip_viewpage);

        WelcomeViewPageAdapter adapter = new WelcomeViewPageAdapter(this, getAdData());
        //初始化轮播图下面小点
        mSwipeView.updateIndicatorView(getAdData().size());
        mSwipeView.setAdapter(adapter);
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
