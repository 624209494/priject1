package com.example.check_1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 按钮
     */
    private Button mBtn1;
    private ImageView mImgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        mBtn1 = (Button) findViewById(R.id.btn1);
        mBtn1.setOnClickListener(this);
        mImgs = (ImageView) findViewById(R.id.imgs);


        ObjectAnimator animator = ObjectAnimator.ofFloat(mImgs, "scaleY",1,0,1);
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(mImgs, "rotation",0,180,0);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(mImgs, "alpha",1,0,1);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(mImgs, "translationY",0,200,0);
        AnimatorSet set = new AnimatorSet();
        set.play(animator).with(animator1).with(animator2).with(animator3);
        set.setDuration(5000);
        set.start();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn1:
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
        }
    }
}
