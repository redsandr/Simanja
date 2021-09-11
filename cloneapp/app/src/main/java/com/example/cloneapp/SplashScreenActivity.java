package com.example.cloneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Action;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        delaySplashScreen();
    }

    private void delaySplashScreen() {
    Completable.timer(5, TimeUnit.SECONDS,
            AndroidSchedulers.mainThread())
            .subscribe(new Action() {
                @Override
                public void run() throws Throwable {
                    Toast.makeText(SplashScreenActivity.this, "Splash Screen done!!!", Toast.LENGTH_SHORT).show();
                }
            });
    }
}