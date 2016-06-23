package com.rex.hwong.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.rex.hwong.BuildConfig;
import com.rex.hwong.R;
import com.rex.hwong.bean.UpdateItem;
import com.rex.hwong.presenter.IMainPresenter;
import com.rex.hwong.presenter.Impl.MainPresenterImpl;
import com.rex.hwong.ui.fragment.CommunityFragment;
import com.rex.hwong.ui.fragment.FunFragment;
import com.rex.hwong.ui.fragment.HotspotFragment;
import com.rex.hwong.ui.fragment.LocalFragment;
import com.rex.hwong.ui.fragment.SubscribeFragment;
import com.rex.hwong.ui.iView.IMain;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements IMain {


    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.replace)
    FrameLayout mReplace;
    @BindView(R.id.ctl_main)
    CoordinatorLayout mCtlMain;
    @BindView(R.id.rb_menu_subscribe)
    RadioButton mRbMenuSubscribe;
    @BindView(R.id.rb_menu_hotspot)
    RadioButton mRbMenuHotspot;
    @BindView(R.id.rb_menu_local)
    RadioButton mRbMenuLocal;
    @BindView(R.id.rb_menu_fun)
    RadioButton mRbMenuFun;
    @BindView(R.id.rb_menu_community)
    RadioButton mRbMenuCommunity;
    @BindView(R.id.rg_menu)
    RadioGroup mRgMenu;


    private IMainPresenter mIMainPresenter;
    private ArrayList<Fragment> mFragments;
    private Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mIMainPresenter = new MainPresenterImpl(this);

        mIMainPresenter.checkUpdate();

        init();
    }

    private void init() {
        mFragments = new ArrayList<>();

        mFragments.add(new SubscribeFragment());
        mFragments.add(new HotspotFragment());
        mFragments.add(new LocalFragment());
        mFragments.add(new FunFragment());
        mFragments.add(new CommunityFragment());

        mRgMenu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.i("123", "---->" + checkedId);
            }
        });
    }

    private void switchFragment(Fragment fragment, String title) {

        if (currentFragment == null || !currentFragment.getClass().getName().equals(fragment.getClass().getName())) {
            getSupportFragmentManager().beginTransaction().replace(R.id.replace, fragment).commit();
            currentFragment = fragment;
            ActionBar actionBar = getSupportActionBar();
            assert actionBar != null;
            actionBar.setTitle(title);
        }
    }


    @Override
    public void showUpdate(final UpdateItem updateItem) {
        //若VersionCode大于现有的VersionCode则更新
        if (updateItem.getVersionCode() > BuildConfig.VERSION_CODE) {
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
