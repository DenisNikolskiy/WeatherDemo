package ru.denisnikolskiy.weatherdemo.di;

import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;
import ru.denisnikolskiy.weatherdemo.ui.weather.IWeatherPresenter;
import ru.denisnikolskiy.weatherdemo.ui.weather.IWeatherView;
import ru.denisnikolskiy.weatherdemo.ui.weather.WeatherPresenter;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */

@Module
public class ActivityModule {

    private AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return activity;
    }

    @Provides
    @PerActivity
        IWeatherPresenter<IWeatherView> provideWeatherPresenter() {
        return new WeatherPresenter<>();
    }


}
