package com.android.meiko;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * @ClassName: CustomViewPageAdapter.java
 * @author: 蜡笔小新
 * @date: 2016-05-12 14:20
 */
public class CustomViewPageAdapter extends PagerAdapter {
    public List<String> comm_data_ls;
    private Context context;
    private View itemView;

    public CustomViewPageAdapter(Context context, List<String> comm_data_ls) {
        this.context = context;
        this.comm_data_ls = comm_data_ls;
    }

    @Override
    public int getCount() {
        return comm_data_ls.size() > 0 ? comm_data_ls.size() == 1 ? 1 : Integer.MAX_VALUE : 0;
    }

    public Object instantiateItem(ViewGroup container, final int position) {
        itemView = View.inflate(context, R.layout.item_viewpage_content, null);
        ImageView imageView = ((ImageView) itemView.findViewById(R.id.image));
        container.addView(itemView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object obj) {
//        container.removeView(itemView);
    }

    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == (arg1);
    }
}
