package ru.denisnikolskiy.weatherdemo.ui.weather;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import javax.inject.Inject;

import ru.denisnikolskiy.weatherdemo.R;
import ru.denisnikolskiy.weatherdemo.base.BaseActivity;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */

public class WeatherActivity extends BaseActivity implements IWeatherView {

    @Inject
    IWeatherPresenter<IWeatherView> presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        getActivityComponent().inject(this);
        presenter.onAttach(this);

        initializeLayout();

    }

    @Override
    protected void initializeLayout() {

    }

    @Override
    protected void onDestroy() {
        presenter.onDetach();
        super.onDestroy();

    }

    @Override
    public void showWhatWeatherNow() {

    }
}
