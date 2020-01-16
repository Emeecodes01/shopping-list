package com.mobigod.shoppinglist.di;

import com.mobigod.shoppinglist.ui.home.HomeActivity;
import com.mobigod.shoppinglist.ui.home.HomeModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_ProvideHomeActivityInjector.HomeActivitySubcomponent.class)
public abstract class ActivityBuilder_ProvideHomeActivityInjector {
  private ActivityBuilder_ProvideHomeActivityInjector() {}

  @Binds
  @IntoMap
  @ClassKey(HomeActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeActivitySubcomponent.Factory builder);

  @Subcomponent(modules = HomeModule.class)
  public interface HomeActivitySubcomponent extends AndroidInjector<HomeActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomeActivity> {}
  }
}
