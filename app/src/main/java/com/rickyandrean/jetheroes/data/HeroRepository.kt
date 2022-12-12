package com.rickyandrean.jetheroes.data

import com.rickyandrean.jetheroes.model.Hero
import com.rickyandrean.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}