package ru.denisnikolskiy.weatherdemo.base;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */

public interface MvpPresenter<View extends MvpView> {

    void onAttach(View mvpView);

    void onDetach();
}
