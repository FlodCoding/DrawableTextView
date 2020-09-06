# DrawableTextView[![](https://jitpack.io/v/FlodCoding/DrawableTextview.svg)](https://jitpack.io/#FlodCoding/DrawableTextView)
## 特性
 * 单独修改Drawable的宽度和高度
 * Drawable与文字一起居中显示
 * 文字在中心显示
 * 设置圆角
 
## Demo
[Download](https://github.com/FlodCoding/DrawableTextView/raw/master/app/build/outputs/apk/debug/app-debug.apk)
### 截图
 ![](/gif/gif1.gif) <br> ![](/gif/gif2.gif) <br> ![](/gif/gif3.gif)


## 如何导入
根目录下的build.gradle

	allprojects {
		  repositories {
		  	...
		  maven { url 'https://jitpack.io' }
		  }
	}
 
 
App目录下的build.gradle
 
 	dependencies {
		//需要Androidx
		implementation 'com.github.FlodCoding:DrawableTextView:1.0.5'
		
     	}

## 使用
```
drawableTextView.setEnableCenterDrawables(true)
                .setEnableTextInCenter(true)
                .setDrawableStart(DrawableStart, width, height) //设置Drawable 并定义其尺寸，单位是DP
                .setRadiusDP(10)                                //设置圆角,单位dp,需要SDK_INT > 21
                     ...

```

#### 或者
```
    <com.flod.view.DrawableTextView
        android:id="@+id/dtv"
        android:layout_width="300dp"
        android:layout_height="150dp"
        android:layout_gravity="center"
        android:background="@android:color/darker_gray"
        android:drawableStart="@drawable/ic_face_black_24dp"
        android:drawableTop="@drawable/ic_sentiment_satisfied_black_24dp"
        android:gravity="center"
        android:text="DrawableTextView"
        android:textSize="20sp"
        app:drawableStartHeight="50dp"
        app:drawableStartWidth="50dp"
        app:radius="10dp"
        app:enableCenterDrawables="true"
        app:enableTextInCenter="true" />
```

## 属性说明

### XML
属性名 | 类型 | 默认值 | 说明
---|:--:|:--:|--:
enableCenterDrawables | boolean | false | 是否文字与Drawable一起居中显示<br>(仅当gravity水平或垂直居中有效)
enableTextInCenter | boolean | false | 是否文字在中心显示<br>(当enableCenterDrawables=true生效时有效果)
radius|dimension|0|设置四边的圆角（需要SDK_INT > 21）
