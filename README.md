Android实现APP开屏广告
>   基本上每个App都有引导页面和广告图，实现自动轮播功能,快速实现小点功能
>   Github:https://github.com/meikoz/SlipViewPager

### 动态效果图

<img src="http://ww3.sinaimg.cn/mw690/005Go64ujw1f49ykvwc64g30d40mxnpg.gif" style="width: 30%;"/>
<br/>

### 使用方法
```
//初始化轮播图控件
SwipeViewPager mSwipeView = (SwipeViewPager) findViewById(R.id.swip_viewpage);
//初始化PageAdapter 根据自己的需求自定义样式
CustomViewPageAdapter adapter = new CustomViewPageAdapter(this, getAdData());

//初始化 轮播图指示点
mSwipeView.updateIndicatorView(getAdData().size());
mSwipeView.setAdapter(adapter);
//广告图开启滚动功能
mSwipeView.startScorll();
```

### Gradle使用
Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
Step 2. Add the dependency

	dependencies {
    	        compile 'com.github.meikoz:slipviewpager:1.0.2'
    	}

