// Generated by Dagger (https://dagger.dev).
package ait.android.flashcard.di;

import ait.android.flashcard.data.AppDatabase;
import ait.android.flashcard.data.DecksDAO;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class DatabaseModule_ProvideDeckDaoFactory implements Factory<DecksDAO> {
  private final DatabaseModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideDeckDaoFactory(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public DecksDAO get() {
    return provideDeckDao(module, appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideDeckDaoFactory create(DatabaseModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideDeckDaoFactory(module, appDatabaseProvider);
  }

  public static DecksDAO provideDeckDao(DatabaseModule instance, AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideDeckDao(appDatabase));
  }
}
