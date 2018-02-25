package com.pesanteresults.powercruiseusa;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //public static String login = "Login & \nRegistration";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    //@Override
    public void dialOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        String temp = "tel:" + "6124057737";
        intent.setData(Uri.parse(temp));
        startActivity(intent);
    }

    public void clickToRegister(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);

        ObjectAnimator animation = ObjectAnimator.ofFloat(view, "translationY", -100);
        animation.setDuration(400);
        animation.start();
        Register.addRegistrant();
    }

    public void stringURL(View view){
        String url = "http://www.powercruiseusa.com";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void emailURL(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri data = Uri.parse("mailto:USA@powercruise.com?");
        intent.setData(data);
        startActivity(intent);
    }

}
