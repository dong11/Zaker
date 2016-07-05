package com.rex.hwong.presenter.Impl;

import android.util.Log;

import com.rex.hwong.api.subscribe.SubscribeApi;
import com.rex.hwong.api.subscribe.SubscribeRequest;
import com.rex.hwong.bean.subscribe.SubscribeResponse;
import com.rex.hwong.presenter.ISubscribePresenter;
import com.rex.hwong.ui.iView.ISubscribeFragment;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author dong {hwongrex@gmail.com}
 * @date 16/7/5
 * @time 下午3:56
 */

public class SubscribePresenterImpl extends BasePresenterImpl implements ISubscribePresenter{

    private ISubscribeFragment mSubscribeFragment;

    public SubscribePresenterImpl(ISubscribeFragment subscribeFragment) {
        mSubscribeFragment = subscribeFragment;
    }

    @Override
    public void getSubscribeBanner() {


        Subscription subscription = SubscribeRequest.getSsApi().getSubscribe().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<SubscribeResponse>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
//                        mWeixinFragment.hidProgressDialog();
//                        mWeixinFragment.showError(e.getMessage());

                        Log.i("123", ":::获取数据失败:::" + e.getMessage());

                    }

                    @Override
                    public void onNext(SubscribeResponse subscribeResponse) {

                        Log.i("123", ":::获取数据成功:::" + subscribeResponse);
                        mSubscribeFragment.updateList();

//                        mWeixinFragment.hidProgressDialog();
//                        if (txWeixinResponse.getCode() == 200) {
//                            mWeixinFragment.updateList(txWeixinResponse.getNewslist());
//                            mCacheUtil.put(Config.WEIXIN + page, mGson.toJson(txWeixinResponse));
//                        } else {
//                            mWeixinFragment.showError("服务器内部错误！");
//                        }
                    }
                });
        addSubscription(subscription);
    }
}
