package com.rex.hwong.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.flyco.banner.widget.Banner.base.BaseBanner;
import com.rex.hwong.R;
import com.rex.hwong.utils.ViewFindUtil;

public class SimpleImageBanner extends BaseBanner<Integer, SimpleImageBanner> {

    public SimpleImageBanner(Context context) {
        this(context, null, 0);
    }

    public SimpleImageBanner(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SimpleImageBanner(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onTitleSlect(TextView tv, int position) {
    }

    @Override
    public View onCreateItemView(int position) {
        View inflate = View.inflate(context, R.layout.fragment_subscribe_item_banner, null);
        ImageView iv = ViewFindUtil.find(inflate, R.id.fragment_subscribe_item_banner_iv);

        Integer i = list.get(position);
        int itemWidth = dm.widthPixels;
        int itemHeight = (int) (itemWidth * 360 * 1.0f / 640);
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        iv.setLayoutParams(new LinearLayout.LayoutParams(itemWidth, itemHeight));
        iv.setImageResource(i);

        return inflate;
    }

//    private RoundCornerIndicaor indicator;

    @Override
    public View onCreateIndicator() {
//        indicator = new RoundCornerIndicaor(context);
//        indicator.setViewPager(vp, list.size());
//        return indicator;
        return null;
    }

    @Override
    public void setCurrentIndicator(int i) {
        //  indicator.setCurrentItem(i);
    }
}
