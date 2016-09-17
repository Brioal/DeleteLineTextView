package com.brioal.textview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Multe Effect TextView
 * Created by Brioal on 2016/9/17.
 */
public class MultEffetTextView extends TextView {
    private SpannableString msp = null;

    public MultEffetTextView(Context context) {
        this(context, null);
    }

    public MultEffetTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //设置指定范围的删除线
    public void setDeleteLine(int start, int end) {
        checkNull();
        msp.setSpan(new StrikethroughSpan(), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
    }

    public void checkNull() {
        if (msp == null) {
            msp = new SpannableString(getText().toString());
        }
    }

    //设置全部的删除线
    public void setDeleteLine() {
        checkNull();
        msp.setSpan(new StrikethroughSpan(), 0, getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
    }

    //设置指定范围的下划线
    public void setUnderLine(int start, int end) {
        checkNull();
        msp.setSpan(new UnderlineSpan(), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
    }

    //设置全部的下划线
    public void setUnderLine() {
        checkNull();
        msp.setSpan(new UnderlineSpan(), 0, getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
    }

    //设置指定范围的字体的大小
    public void setTextSizeIndex(int start, int end, int textSize) {
        checkNull();
        msp.setSpan(new AbsoluteSizeSpan(textSize, true), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
    }

    //设置指定范围的前景色
    public void setFrontColor(int color, int start, int end) {
        checkNull();
        msp.setSpan(new ForegroundColorSpan(color), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
    }

    //设置全部文字的前景色
    public void setFrontColor(int color) {
        checkNull();
        msp.setSpan(new ForegroundColorSpan(color), 0, getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
    }

    //设置指定范围的字体背景色
    public void setBackColor(int color, int start, int end) {
        checkNull();
        msp.setSpan(new BackgroundColorSpan(color), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //设置背景色为青色
        setText(msp);
    }

    //设置指定范围的字体为正常
    public void setFontNormal(int start, int end) {
        checkNull();
        msp.setSpan(new StyleSpan(android.graphics.Typeface.NORMAL), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //正常
        setText(msp);
    }

    //设置所有范围的字体为正常字体
    public void setFontNormal() {
        checkNull();
        msp.setSpan(new StyleSpan(android.graphics.Typeface.NORMAL), 0, getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //正常
        setText(msp);
    }

    //设置指定范围的字体为粗体
    public void setFontBlod(int start, int end) {
        checkNull();
        msp.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //粗体
        setText(msp);
    }

    //设置全部字体为粗体
    public void setFontBlod() {
        checkNull();
        msp.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0, getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //粗体
        setText(msp);
    }

    //设置指定范围的字体为斜体
    public void setFontItalic(int start, int end) {
        checkNull();
        msp.setSpan(new StyleSpan(android.graphics.Typeface.ITALIC), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //斜体
        setText(msp);
    }

    //设置全部字体为斜体
    public void setFontItalic() {
        checkNull();
        msp.setSpan(new StyleSpan(android.graphics.Typeface.ITALIC), 0, getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //斜体
        setText(msp);
    }

    //设置指定范围的字体为粗斜体
    public void setFontBlodItalic(int start, int end) {
        checkNull();
        msp.setSpan(new StyleSpan(android.graphics.Typeface.BOLD_ITALIC), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //粗斜体
        setText(msp);

    }

    //设置所有的字体为粗斜体
    public void setFontBlodItalic() {
        checkNull();
        msp.setSpan(new StyleSpan(android.graphics.Typeface.BOLD_ITALIC), 0, getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //粗斜体
        setText(msp);
    }

    //设置下标
    public void setUnderSpan(int start, int end) {
        checkNull();
        msp.setSpan(new SubscriptSpan(), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
    }

    //设置上标
    public void setTopSpan(int start, int end) {
        checkNull();
        msp.setSpan(new SuperscriptSpan(), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
    }

    //设置电话超链接
    public void setTelUrl(int start, int end, String tel) {
        checkNull();
        msp.setSpan(new URLSpan("tel:" + tel), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    //设置网址访问
    public void setWebUrl(int start, int end, String url) {
        checkNull();
        msp.setSpan(new URLSpan(url), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    //设置发送短信
    public void setSms(int start, int end, String tel) {
        checkNull();
        msp.setSpan(new URLSpan("sms:" + tel), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    //设置发送彩信
    public void setMms(int start, int end, String tel) {
        checkNull();
        msp.setSpan(new URLSpan("mms:" + tel), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    //设置项目符号
    public void setDrawable(Drawable drawable, int start, int end) {
        //设置图片
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        msp.setSpan(new ImageSpan(drawable), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        setText(msp);
    }

}
