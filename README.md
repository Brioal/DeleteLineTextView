## 多效果TextView控件
## 效果演示:
![](https://github.com/Brioal/DeleteLineTextView/blob/master/art/1.png)
## 添加依赖库的步骤
### 1.项目的gradle文件内的做以下改动
```
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```
### 2.添加最新版本的依赖库,最新版本如右所示,修改末尾的版本即可(因为我有时候更新版本了会忘记修改readme)[![](https://jitpack.io/v/Brioal/DeleteLineTextView.svg)](https://jitpack.io/#Brioal/DeleteLineTextView)
```
dependencies {
	        compile 'com.github.Brioal:DeleteLineTextView:1.0'
	        ////例如上面最新版本是1.1,则只要把1.0改成1.1即可使用最新版本
	}
```
## 使用步骤:
### 1.xml布局文件

```
     <com.brioal.textview.MultEffetTextView
        android:id="@+id/main_tv"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="多种效果的文本显示控件,包含下划线,删除线,粗体,链接等的效果"/>

```
### 2.代码设置
```
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

```
### 3.提供的供自定义视图的方法
方法|功能
:--|:--
`void setDeleteLine()`|设置全部的删除线
`void setUnderLine(int start, int end)`|设置指定范围的下划线
`void setUnderLine()`|设置全部的下划线
`void setTextSizeIndex(int start, int end, int textSize)`|设置指定范围的字体的大小
`void setFrontColor(int color, int start, int end)`|设置指定范围的前景色
`void setFrontColor(int color)`|设置全部文字的前景色
`void setBackColor(int color, int start, int end)`|设置指定范围的字体背景色
`void setFontNormal(int start, int end)`|设置指定范围的字体为正常
`void setFontNormal()`|设置所有范围的字体为正常字体
`void setFontBlod(int start, int end)`|设置指定范围的字体为粗体
`void setFontBlod()`|设置全部字体为粗体
`void setFontItalic(int start, int end) `|设置指定范围的字体为斜体
`void setFontItalic() `|设置全部字体为斜体
`void setFontBlodItalic(int start, int end) `|设置指定范围的字体为粗斜体
`void setFontBlodItalic() `|设置所有的字体为粗斜体
`void setUnderSpan(int start, int end)`|设置下标
`void setTopSpan(int start, int end) `|设置上标
`void setTelUrl(int start, int end, String tel)`|设置电话超链接
`void setWebUrl(int start, int end, String url)`|设置网址访问
`void setSms(int start, int end, String tel)`|设置发送短信
`void setMms(int start, int end, String tel) `|设置发送彩信
`void setDrawable(Drawable drawable, int start, int end)`|设置项目符号


#### 完毕~
#### 写在后面

####2.建了个交流Android开发的QQ群,欢迎新手老手:群号:375276053
