package ru.denisnikolskiy.weatherdemo.di;

import android.app.Application;

import dagger.Module;
import ru.denisnikolskiy.weatherdemo.App;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */

@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

}
