package com.example.festivals;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.Timer;
import java.util.TimerTask;

public class AutoScrollService extends Service {
    private static HorizontalScrollView horizontalScrollView;
    private static LinearLayout bannerLinearLayout;
    private Timer timer;
    private int scrollIndex = 0;

    public static void setViews(HorizontalScrollView scrollView, LinearLayout linearLayout) {
        horizontalScrollView = scrollView;
        bannerLinearLayout = linearLayout;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startAutoScroll();
        return START_STICKY;
    }

    private void startAutoScroll() {
        if (horizontalScrollView == null || bannerLinearLayout == null) {
            return;
        }

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    scrollIndex++;
                    if (scrollIndex >= bannerLinearLayout.getChildCount()) {
                        // Reset the scroll index if it reaches the end
                        scrollIndex = 0;
                    }
                    final int scrollTo = bannerLinearLayout.getChildAt(scrollIndex).getLeft();

                    // Scroll to the position
                    horizontalScrollView.post(new Runnable() {
                        @Override
                        public void run() {
                            horizontalScrollView.smoothScrollTo(scrollTo, 0);
                        }
                    });
                } catch (Exception e) {
                    // Handle any exceptions gracefully
                    e.printStackTrace();
                }
            }
        }, 0, 5000);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (timer != null) {
            timer.cancel();
        }
    }
}