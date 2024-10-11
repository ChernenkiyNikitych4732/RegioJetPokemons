package cz.regiojet.regiojetpokemons.di

import cz.regiojet.regiojetpokemons.data.repository.PokemonRepository
import org.koin.dsl.module

val repositoryModule = module {

    // TODO 1.4 Uncomment repository dependency injection when class is done
    // single { TemporaryDraftName(get()) }
    single { PokemonRepository(get()) }
}