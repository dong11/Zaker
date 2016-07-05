package com.rex.hwong.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rex.hwong.R;
import com.rex.hwong.presenter.ISubscribePresenter;
import com.rex.hwong.presenter.Impl.SubscribePresenterImpl;
import com.rex.hwong.ui.iView.ISubscribeFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubscribeFragment extends Fragment implements ISubscribeFragment {

    private ISubscribePresenter mISubscribePresenter;


    public SubscribeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_subscribe, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mISubscribePresenter = new SubscribePresenterImpl(this);
        mISubscribePresenter.getSubscribeBanner();
    }

    @Override
    public void updateList() {
        Log.i("123", "::返回获取的数据::");
    }
}
