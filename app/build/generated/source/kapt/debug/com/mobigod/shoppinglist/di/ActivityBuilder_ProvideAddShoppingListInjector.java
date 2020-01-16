package com.mobigod.shoppinglist.di;

import com.mobigod.shoppinglist.ui.shopping.activities.AddShoppingListActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilder_ProvideAddShoppingListInjector.AddShoppingListActivitySubcomponent.class
)
public abstract class ActivityBuilder_ProvideAddShoppingListInjector {
  private ActivityBuilder_ProvideAddShoppingListInjector() {}

  @Binds
  @IntoMap
  @ClassKey(AddShoppingListActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AddShoppingListActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface AddShoppingListActivitySubcomponent
      extends AndroidInjector<AddShoppingListActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AddShoppingListActivity> {}
  }
}
