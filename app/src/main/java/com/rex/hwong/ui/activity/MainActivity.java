package com.rex.hwong.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.rex.hwong.BuildConfig;
import com.rex.hwong.R;
import com.rex.hwong.bean.UpdateItem;
import com.rex.hwong.presenter.IMainPresenter;
import com.rex.hwong.presenter.Impl.MainPresenterImpl;
import com.rex.hwong.ui.iView.IMain;
import com.rex.hwong.utils.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements IMain{

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ctl_main)
    CoordinatorLayout ctlMain;

    private IMainPresenter mIMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mIMainPresenter = new MainPresenterImpl(this);

        mIMainPresenter.checkUpdate();
    }

    @Override
    public void showUpdate(final UpdateItem updateItem) {
        //若VersionCode大于现有的VersionCode则更新
        if(updateItem.getVersionCode() > BuildConfig.VERSION_CODE){
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle(getString(R.string.update_title))
                    .setMessage(String.format(getString(R.string.update_description), updateItem.getVersionName(), updateItem.getReleaseNote()))
                    .setPositiveButton(getString(R.string.update_button), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(updateItem.getDownloadUrl())));
                        }
                    })
                    .setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .show();
        }
    }
}
