package org.example

import kotlin.random.Random

class Personaje(
    val nombre: String,
    private val inventario: MutableList<Item> = mutableListOf(),
    var exp: Int = 0,
    var nivel: Int = 0
) {

    var vida: Int = Random.nextInt(100,180)
    var vidaMax = vida

    // Ejercicio 6
    private fun criticDamage(): Int{
        val ataque: Int = Random.nextInt(10,30)

        if (ataque > 50) {
            println(" * $nombre - Ataque critico: $ataque de daño")
            return ataque * 2
        } else{
            println(" * $nombre - Ataque normal: $ataque de daño")
            return ataque
        }
    }

    fun atacar(personaje: Personaje){
        val damage = criticDamage()
        personaje.vida -= damage
        if (personaje.vida < 0) personaje.vida = 0
    }

    fun addItem(item: Item){
        inventario.add(item)
    }

    fun removeItem(item: Item){
        inventario.remove(item)
    }

    fun mostrarInventario(){
        println("Inventario de $nombre")
        inventario.forEach { item ->
            println(" * $item")
        }
    }


    fun aumentarXP() {
        if (exp+50 > 200) {
            exp = 0
            nivel++
            println("$nombre ha subido de nivel")
        }else{
            exp+= 50
            println("$nombre ha ganado 50 puntos de exp")
        }
    }



    override fun toString(): String {
        return "Nombre: $nombre, Salud: ${vida}hp, Exp: $exp, Nivel: $nivel"
    }
}