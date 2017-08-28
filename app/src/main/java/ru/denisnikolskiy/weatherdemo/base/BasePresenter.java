package ru.denisnikolskiy.weatherdemo.base;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mvpView;

    @Override
    public void onAttach(V mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void onDetach() {
        mvpView = null;
    }
}
