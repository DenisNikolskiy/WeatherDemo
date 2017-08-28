package ru.denisnikolskiy.weatherdemo.ui.weather;

import javax.inject.Inject;

import ru.denisnikolskiy.weatherdemo.base.BasePresenter;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */

public class WeatherPresenter<V extends IWeatherView> extends BasePresenter<V>
        implements IWeatherPresenter<V> {

    @Inject
    public WeatherPresenter() {

    }

    @Override
    public void onViewInitialized() {

    }

}
