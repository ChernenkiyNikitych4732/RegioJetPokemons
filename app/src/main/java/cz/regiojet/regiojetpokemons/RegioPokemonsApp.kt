package cz.regiojet.regiojetpokemons

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import cz.regiojet.regiojetpokemons.di.repositoryModule
import cz.regiojet.regiojetpokemons.di.retrofitModule
import cz.regiojet.regiojetpokemons.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

class RegioPokemonsApp : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var appContext: Context
            private set
    }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidLogger(Level.ERROR)

            appContext = applicationContext!!
            androidContext(this@RegioPokemonsApp)
            androidContext(appContext)

            modules(
                retrofitModule,
                repositoryModule,
                viewModelModule,
            )
        }
    }
}