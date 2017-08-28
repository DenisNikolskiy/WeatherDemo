package ru.denisnikolskiy.weatherdemo;

import android.app.Application;

import ru.denisnikolskiy.weatherdemo.di.ApplicationModule;
import ru.denisnikolskiy.weatherdemo.di.ApplicationComponent;
import ru.denisnikolskiy.weatherdemo.di.DaggerApplicationComponent;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */

public class App extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }
}
