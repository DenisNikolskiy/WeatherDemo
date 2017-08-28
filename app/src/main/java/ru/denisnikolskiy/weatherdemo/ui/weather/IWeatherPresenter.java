package ru.denisnikolskiy.weatherdemo.ui.weather;

import ru.denisnikolskiy.weatherdemo.base.MvpPresenter;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */

public interface IWeatherPresenter<V extends IWeatherView> extends MvpPresenter<V> {

    void onViewInitialized();
}
