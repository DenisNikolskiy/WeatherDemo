package ru.denisnikolskiy.weatherdemo.di;

import javax.inject.Singleton;

import dagger.Component;
import ru.denisnikolskiy.weatherdemo.App;

/**
 * Created by Denis Nikolskiy on 27.08.2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App app);
}
