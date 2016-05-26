package com.android.meiko;

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
    public static List<String> getAdData() {
        List<String> adList = new ArrayList<>();
        adList.add("http://imgsrc.baidu.com/baike/pic/item/1f5694823d0920aef603a6ec.jpg");
        adList.add("http://c.hiphotos.baidu.com/zhidao/pic/item/95eef01f3a292df59ac3846ebc315c6034a8734c.jpg");
        adList.add("http://img0.imgtn.bdimg.com/it/u=1296117362,655885600&fm=21&gp=0.jpg");
        return adList;
    }
}
