package com.rex.hwong.presenter.Impl;

import com.rex.hwong.bean.UpdateItem;
import com.rex.hwong.presenter.IMainPresenter;
import com.rex.hwong.ui.iView.IMain;

/**
 * @author dong {hwongrex@gmail.com}
 * @date 16/6/13
 * @time 下午10:20
 */

public class MainPresenterImpl extends BasePresenterImpl implements IMainPresenter{

    private IMain mIMain;

    public MainPresenterImpl(IMain main) {
        if (main == null)
            throw new IllegalArgumentException("main must not be null");
        mIMain = main;
    }

    /**
     * 检查是否有新版本
     */
    @Override
    public void checkUpdate() {
        mIMain.showUpdate(new UpdateItem());
    }
}
