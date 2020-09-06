package com.flod.drawabletextview.app;

import android.os.Build;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.flod.drawabletextview.DrawableTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DrawableTextView dtv = findViewById(R.id.dtv);

        Switch swEnableCenterDrawables = findViewById(R.id.swEnableCenterDrawables);
        swEnableCenterDrawables.setChecked(dtv.isEnableCenterDrawables());
        swEnableCenterDrawables.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                dtv.setEnableCenterDrawables(b)
                        .requestLayout();
            }
        });

        Switch swEnableTextInCenter = findViewById(R.id.swEnableTextInCenter);
        swEnableTextInCenter.setChecked(dtv.isEnableTextInCenter());
        swEnableTextInCenter.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                dtv.setEnableTextInCenter(b)
                        .requestLayout();
            }
        });


        SeekBar sbRadius = findViewById(R.id.sbRadius);
        sbRadius.setOnSeekBarChangeListener(new EmptyOnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    dtv.setRadius(progress);
                }
            }

        });

        SeekBar sbWidth = findViewById(R.id.sbWidth);
        sbWidth.setOnSeekBarChangeListener(new EmptyOnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                dtv.setDrawableStart(dtv.getDrawables()[0], i, px2dp(dtv.getDrawables()[0].getBounds().height()));
            }
        });


        SeekBar sbHeight = findViewById(R.id.sbHeight);
        sbHeight.setOnSeekBarChangeListener(new EmptyOnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                dtv.setDrawableStart(dtv.getDrawables()[0], px2dp(dtv.getDrawables()[0].getBounds().width()), i);
            }

        });

    }

    protected int px2dp(float px) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f);
    }


    static class EmptyOnSeekBarChangeListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

}
