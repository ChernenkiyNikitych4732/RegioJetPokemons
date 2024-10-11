package cz.regiojet.regiojetpokemons.data.repository

import cz.regiojet.regiojetpokemons.data.network.PokeApiService
import cz.regiojet.regiojetpokemons.data.network.model.PokemonResponse

// TODO 1.2 rename the file appropriately
// TODO 1.3 implement the repository

class PokemonRepository(private val pokeApiService: PokeApiService) {
    // Function to get a list of Pokemons
    suspend fun getPokemons(): PokemonResponse {
        return pokeApiService.getPokemons()
    }
}
