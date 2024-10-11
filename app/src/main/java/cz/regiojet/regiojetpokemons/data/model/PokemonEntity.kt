package cz.regiojet.regiojetpokemons.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pokemon")
data class PokemonEntity(
    val name: String,
)
