package com.negier.coverbaidulangbottom;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TabHost;

import com.negier.coverbaidulangbottom.fragments.DictFragment;

public class MainActivity extends AppCompatActivity {

    private static final String TAB_DICT = "dict";
    private static final String TAB_DISCOVER = "discover";
    private static final String TAB_VOCAB = "vocab";
    private static final String TAB_ME = "me";
    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this,getSupportFragmentManager(),R.id.fl_container);

        initTab();
    }

    private void initTab() {
        TabHost.TabSpec dictSpec = tabHost.newTabSpec(TAB_DICT);
        TabIndicatorView dictIndicatorView = new TabIndicatorView(this);
        dictIndicatorView.setTabIcon(R.mipmap.tabbar_dict_normal);
        dictIndicatorView.setTabHint("首页");
        dictSpec.setIndicator(dictIndicatorView);
        tabHost.addTab(dictSpec, DictFragment.class,null);

        TabHost.TabSpec discoverSpec = tabHost.newTabSpec(TAB_DISCOVER);
        TabIndicatorView discoverIndicatorView = new TabIndicatorView(this);
        discoverIndicatorView.setTabIcon(R.mipmap.tabbar_discover_normal);
        discoverIndicatorView.setTabHint("发现");
        discoverSpec.setIndicator(discoverIndicatorView);
        tabHost.addTab(discoverSpec, DictFragment.class,null);

        TabHost.TabSpec vocabSpec = tabHost.newTabSpec(TAB_VOCAB);
        TabIndicatorView vocabIndicatorView = new TabIndicatorView(this);
        vocabIndicatorView.setTabIcon(R.mipmap.tabbar_vocab_normal);
        vocabIndicatorView.setTabHint("收藏");
        vocabSpec.setIndicator(vocabIndicatorView);
        tabHost.addTab(vocabSpec, DictFragment.class,null);

        TabHost.TabSpec meSpec = tabHost.newTabSpec(TAB_ME);
        TabIndicatorView meIndicatorView = new TabIndicatorView(this);
        meIndicatorView.setTabIcon(R.mipmap.tabbar_me_normal);
        meIndicatorView.setTabHint("个人");
        meSpec.setIndicator(meIndicatorView);
        tabHost.addTab(meSpec, DictFragment.class,null);

        //去掉那些竖线
        tabHost.getTabWidget().setDividerDrawable(android.R.color.white);

        dictIndicatorView.setTabSelected(true);
    }
}
