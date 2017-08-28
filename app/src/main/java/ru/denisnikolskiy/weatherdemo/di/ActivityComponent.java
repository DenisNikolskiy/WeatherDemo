package ru.denisnikolskiy.weatherdemo.di;

import javax.inject.Singleton;

import dagger.Component;
import ru.denisnikolskiy.weatherdemo.ui.weather.WeatherActivity;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(WeatherActivity activity);
}
