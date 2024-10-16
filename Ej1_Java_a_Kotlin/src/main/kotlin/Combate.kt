package org.example

class Combate {
    private val pj1 = Personaje("Goku", 100, 20)
    private val pj2 = Personaje("Vegeta", 80, 25)

    // Funcion para combatir, para no hacelro directamente en el main.
    fun combatir(){
        while (pj1.vida > 0 && pj2.vida > 0){
            pj1.vida -= pj2.ataque
            pj2.vida -= pj1.ataque
            println("Vida de ${pj1.name}: ${pj1.vida}\nVida de ${pj2.name}: ${pj2.vida}")
        }

        if (pj1.vida <= 0){
            println("${pj1.name} ha ganado el combate")
        }else{
            println("${pj2.name} ha ganado el combate")
        }
    }
}