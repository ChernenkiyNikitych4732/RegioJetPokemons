package cz.regiojet.regiojetpokemons

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cz.regiojet.regiojetpokemons.data.model.PokemonEntity
import cz.regiojet.regiojetpokemons.data.repository.PokemonRepository
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val remoteRepository: PokemonRepository
) : ViewModel() {

    // TODO 2.1 - define observable state holder
    // Observable state to hold the list of PokemonEntity
    private val pokemonList = MutableLiveData<List<PokemonEntity>>()

    // TODO 2.2 - load PokemonEntity list from the repository
    fun loadPokemons() {
        viewModelScope.launch {
            try {
                // Fetch the data from repository
                val response = remoteRepository.getPokemons()

                // Update LiveData with the list of PokemonEntity
                pokemonList.value

            } catch (e: Exception) {
                // Handle any errors
                pokemonList.value
            }
        }
    }
}