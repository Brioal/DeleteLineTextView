package com.brioal.deletelinetextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.brioal.textview.MultEffetTextView;

public class MainActivity extends AppCompatActivity {
    private MultEffetTextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (MultEffetTextView) findViewById(R.id.main_tv);
        mTextView.setText("下划线,删除线,大字体,小字体,前景色,背景色,正常字体,加粗字体,斜体,粗斜体,下标,上标,点击拨号,点击打开百度,点击发送短信,点击发送彩信,Icon");
        mTextView.setUnderLine(0, 3); //下划线
        mTextView.setDeleteLine(4, 7);//删除线
        mTextView.setTextSizeIndex(8, 11, 24);//文字大小
        mTextView.setTextSizeIndex(12, 15, 14);//文字大小
        mTextView.setFrontColor(Color.RED, 16, 19);//字体颜色
        mTextView.setBackColor(Color.BLUE, 20, 23);//背景颜色
        mTextView.setFontNormal(24, 28);//正常字体
        mTextView.setFontBlod(29, 33);//粗体
        mTextView.setFontItalic(34, 36);//斜体
        mTextView.setFontBlodItalic(37, 40);//粗斜体
        mTextView.setUnderSpan(41, 43);//下标
        mTextView.setTopSpan(44, 46);//上标
        mTextView.setTelUrl(47, 51, "18293107086");//可点击的电话
        mTextView.setWebUrl(52, 58, "http://www.baidu.com");//可点击的网址
        mTextView.setSms(59, 66, "18293107086");//发送短信
        mTextView.setMms(66, 72, "18293107086");//发送彩信
        mTextView.setDrawable(getResources().getDrawable(R.mipmap.ic_launcher), 73, 77);

    }
}
