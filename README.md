# DrawableTextView
## 特性
 * 单独修改Drawable的宽度和高度
 * Drawabel与文字一起居中显示
 * 文字在中心显示
 
## Demo
[Download]()
### 截图
![](/gif/gif1.gif) &ensp;&ensp; ![](/gif/gif2.gif)


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
		//需要是Androidx
		implementation 
		
     	}

## 使用
```
drawableTextView.setEnableCenterDrawables(true)
                .setEnableTextInCenter(true)
                .setDrawableStart(DrawableStart)                //单独设置Drawable,以内部大小为准
                .setDrawableStart(DrawableStart, width, height) //设置Drawable 并定义其尺寸，单位是DP
                .setDrawableTop()
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
        app:enableCenterDrawables="ture"
        app:enableTextInCenter="ture" />
```
