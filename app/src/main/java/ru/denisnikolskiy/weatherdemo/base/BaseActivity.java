package ru.denisnikolskiy.weatherdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import ru.denisnikolskiy.weatherdemo.App;
import ru.denisnikolskiy.weatherdemo.di.ActivityComponent;
import ru.denisnikolskiy.weatherdemo.di.ActivityModule;
import ru.denisnikolskiy.weatherdemo.di.DaggerActivityComponent;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */

public abstract class BaseActivity extends AppCompatActivity
        implements MvpView {

    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    protected abstract void initializeLayout();

}
