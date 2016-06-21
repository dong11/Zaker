package com.rex.hwong.ui.iView;

/**
 * @author dong {hwongrex@gmail.com}
 * @date 16/6/13
 * @time 下午10:20
 */

public interface IBaseFragment {
    void showProgressDialog();

    void hidProgressDialog();

    void showError(String error);
}
