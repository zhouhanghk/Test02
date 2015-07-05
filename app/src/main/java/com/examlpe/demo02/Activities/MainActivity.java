package com.examlpe.demo02.Activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.examlpe.demo02.Fragments.ChatroomFragment;
import com.examlpe.demo02.Fragments.ContactsFragment;
import com.examlpe.demo02.Fragments.MeFragment;
import com.examlpe.demo02.Fragments.NewsFragment;
import com.examlpe.demo02.R;


public class MainActivity extends Activity implements View.OnClickListener {

    /**
     * 用于展示消息的Fragment
     */
    private ChatroomFragment mChatroomFragment;

    /**
     * 用于展示联系人的Fragment
     */
    private ContactsFragment mContactsFragment;

    /**
     * 用于展示动态的Fragment
     */
    private NewsFragment mNewsFragment;

    /**
     * 用于展示设置的Fragment
     */
    private MeFragment mMeFragment;

    /**
     * 消息界面布局
     */
    private View mChatroomLayout;

    /**
     * 联系人界面布局
     */
    private View mContactsLayout;

    /**
     * 动态界面布局
     */
    private View mNewsLayout;

    /**
     * 设置界面布局
     */
    private View mMeLayout;

    /**
     * 在Tab布局上显示消息图标的控件
     */
    private ImageView mChatroomImage;

    /**
     * 在Tab布局上显示联系人图标的控件
     */
    private ImageView mContactsImage;

    /**
     * 在Tab布局上显示动态图标的控件
     */
    private ImageView mNewsImage;

    /**
     * 在Tab布局上显示设置图标的控件
     */
    private ImageView mMeImage;

    /**
     * 在Tab布局上显示消息标题的控件
     */
    private TextView mChatroomText;

    /**
     * 在Tab布局上显示联系人标题的控件
     */
    private TextView mContactsText;

    /**
     * 在Tab布局上显示动态标题的控件
     */
    private TextView mNewsText;

    /**
     * 在Tab布局上显示设置标题的控件
     */
    private TextView mMeText;

    /**
     * 用于对Fragment进行管理
     */
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main);
        // 初始化布局元素
        initViews();
        fragmentManager = getFragmentManager();
        // 第一次启动时选中第0个tab
        setTabSelection(1);
    }

    /**
     * 在这里获取到每个需要用到的控件的实例，并给它们设置好必要的点击事件。
     */
    private void initViews() {
        mChatroomLayout = findViewById(R.id.chatroom_layout);
        mContactsLayout = findViewById(R.id.contacts_layout);
        mNewsLayout = findViewById(R.id.news_layout);
        mMeLayout = findViewById(R.id.me_layout);
        mChatroomImage = (ImageView) findViewById(R.id.chatroom_image);
        mContactsImage = (ImageView) findViewById(R.id.contacts_image);
        mNewsImage = (ImageView) findViewById(R.id.news_image);
        mMeImage = (ImageView) findViewById(R.id.me_image);
        mChatroomText = (TextView) findViewById(R.id.chatroom_subtitle);
        mContactsText = (TextView) findViewById(R.id.contacts_subtitle);
        mNewsText = (TextView) findViewById(R.id.news_subtitle);
        mMeText = (TextView) findViewById(R.id.me_subtitle);
        mChatroomLayout.setOnClickListener(this);
        mContactsLayout.setOnClickListener(this);
        mNewsLayout.setOnClickListener(this);
        mMeLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.chatroom_layout:
                // 当点击了消息tab时，选中第1个tab
                setTabSelection(0);
                break;
            case R.id.contacts_layout:
                // 当点击了联系人tab时，选中第2个tab
                setTabSelection(1);
                break;
            case R.id.news_layout:
                // 当点击了动态tab时，选中第3个tab
                setTabSelection(2);
//
//            {
//                Intent intent=new Intent(this,NewsDetailsActivity.class);
//                startActivity(intent);
//
//            }
                break;
            case R.id.me_layout:
                // 当点击了设置tab时，选中第4个tab
                setTabSelection(3);
                break;
            default:
                break;
        }
    }

    /**
     * 根据传入的index参数来设置选中的tab页。
     *
     * @param index
     *            每个tab页对应的下标。0表示消息，1表示联系人，2表示动态，3表示设置。
     */
    private void setTabSelection(int index) {
        // 每次选中之前先清楚掉上次的选中状态
        clearSelection();
        // 开启一个Fragment事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        // 先隐藏掉所有的Fragment，以防止有多个Fragment显示在界面上的情况
        hideFragments(transaction);
        switch (index) {
            case 0:
                // 当点击了消息tab时，改变控件的图片和文字颜色
                mChatroomImage.setImageResource(R.drawable.chatroom_selected);
                mChatroomText.setTextColor(Color.WHITE);
                if (mChatroomFragment == null) {
                    // 如果MessageFragment为空，则创建一个并添加到界面上
                    mChatroomFragment = new ChatroomFragment();
                    transaction.add(R.id.content, mChatroomFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(mChatroomFragment);
                }
                break;
            case 1:
                // 当点击了联系人tab时，改变控件的图片和文字颜色
                mContactsImage.setImageResource(R.drawable.contacts_selected);
                mContactsText.setTextColor(Color.WHITE);
                if (mContactsFragment == null) {
                    // 如果ContactsFragment为空，则创建一个并添加到界面上
                    mContactsFragment = new ContactsFragment();
                    transaction.add(R.id.content, mContactsFragment);
                } else {
                    // 如果ContactsFragment不为空，则直接将它显示出来
                    transaction.show(mContactsFragment);
                }
                break;
            case 2:
                // 当点击了动态tab时，改变控件的图片和文字颜色
                mNewsImage.setImageResource(R.drawable.news_selected);
                mNewsText.setTextColor(Color.WHITE);
                if (mNewsFragment == null) {
                    // 如果NewsFragment为空，则创建一个并添加到界面上
                    mNewsFragment = new NewsFragment();
                    transaction.add(R.id.content, mNewsFragment);
                } else {
                    // 如果NewsFragment不为空，则直接将它显示出来
                    transaction.show(mNewsFragment);
                }
                break;
            case 3:
            default:
                // 当点击了设置tab时，改变控件的图片和文字颜色
                mMeImage.setImageResource(R.drawable.me_selected);
                mMeText.setTextColor(Color.WHITE);
                if (mMeFragment == null) {
                    // 如果SettingFragment为空，则创建一个并添加到界面上
                    mMeFragment = new MeFragment();
                    transaction.add(R.id.content, mMeFragment);
                } else {
                    // 如果SettingFragment不为空，则直接将它显示出来
                    transaction.show(mMeFragment);
                }
                break;
        }
        transaction.commit();
    }

    /**
     * 清除掉所有的选中状态。
     */
    private void clearSelection() {
        mChatroomImage.setImageResource(R.drawable.chatroom_unselected);
        mChatroomText.setTextColor(Color.parseColor("#82858b"));
        mContactsImage.setImageResource(R.drawable.contacts_unselected);
        mContactsText.setTextColor(Color.parseColor("#82858b"));
        mNewsImage.setImageResource(R.drawable.news_unselected);
        mNewsText.setTextColor(Color.parseColor("#82858b"));
        mMeImage.setImageResource(R.drawable.me_unselected);
        mMeText.setTextColor(Color.parseColor("#82858b"));
    }

    /**
     * 将所有的Fragment都置为隐藏状态。
     *
     * @param transaction
     *            用于对Fragment执行操作的事务
     */
    private void hideFragments(FragmentTransaction transaction) {
        if (mContactsFragment != null) {
            transaction.hide(mContactsFragment);
        }
        if (mChatroomFragment != null) {
            transaction.hide(mChatroomFragment);
        }
        if (mNewsFragment != null) {
            transaction.hide(mNewsFragment);
        }
        if (mMeFragment != null) {
            transaction.hide(mMeFragment);
        }
    }
}