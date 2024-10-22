package org.example

import java.security.Principal
import kotlin.random.Random

class Ejercicios {

    fun ej1(){
        println("Hola mundo")
    }

    fun ej2(){
        val vida = 100
        println("La vida del personaje es $vida")
    }

    fun ej3(entero: Int): Int {
        println("(${entero}*5) -> ${entero*5}")
        return entero * 5
    }

    fun ej4(){
        var monedas = 0
        for (i in 0..<10){
            monedas += 5
            println("${i+1} - Numero de monedas: $monedas")
        }
    }

    fun ej5(){
        print("Introduce el nivel del PJ: ")
        val nivel = readln().toIntOrNull()

        if (nivel != null && nivel >= 0 ){
            when (nivel){
                in 0..<10 -> println("Personaje principiante")
                in 10..20 -> println("Personaje intermedio")
                else -> println("Personaje avanzado")
            }
        }else{
            println("Error - Valor introducido no válido")
        }
    }



    fun ej6_7_8_9(){
        val pj1 = Personaje("PJ1")
        val pj2 = Personaje("PJ2")


        println("Datos iniciales jugadores:\n$pj1\n$pj2")


        var batallas = 0

        while (batallas < 10){
            batallas++
            var ronda = 0
            println("\n -*-*-*- Batalla $batallas -*-*-*- ")

            // Maxear vida antes de otro combate
            pj1.vida = pj1.vidaMax
            pj2.vida = pj2.vidaMax

            while (pj1.vida > 0 && pj2.vida > 0){
                ronda++
                println("\nRonda $ronda")

                // Pequeña mejora que soluciona (no de la mejor forma) que llegen con 0hp a la ultima ronda.
                if (pj1.vida > 0) {
                    pj1.atacar(pj2)
                } else {
                    println(" * FIN DE LA BATALLA * --> \n$pj1\n$pj2")
                    pj2.aumentarXP() // Gana el PJ2
                    break
                }

                if (pj2.vida > 0) {
                    pj2.atacar(pj1)
                } else {
                    println("\n# FIN DE LA BATALLA #  \n$pj1\n$pj2")
                    pj1.aumentarXP() // Gana el PJ1
                    break
                }

                // Mostrar estadisticas cada 3 rondas
                if (ronda % 3 == 0) println("\nDatos actualizados: \n  $pj1\n  $pj2")
            }
        }


        println("\nAñadiendo items al inventario de ${pj1.nombre}...")
        val listaItems = mutableListOf<Item>(
            Item("Espada"),
            Item("Escudo"),
            Item("Casco"),
            Item("Manzana"),
        )
        listaItems.forEach { item ->
            pj1.addItem(item)
        }
        println()

        println("Mostrar inventario: \n")
        pj1.mostrarInventario()
        println()

        println("Eliminando algun item... \n")
        pj1.removeItem(listaItems[0])
        println("Item eliminado. Inventario actualizado: \n")
        pj1.mostrarInventario()
        println()
    }

    fun ej10(){
        val pj1 = Personaje("PJ1")
        val pj2 = Personaje("PJ2")
        val pj3 = Personaje("PJ3")
        val enemigo = Personaje("Enemigo")
        enemigo.vida = 500

        var ronda = 0

        while (enemigo.vida > 0){
            ronda++
            println("\nRonda $ronda")

            pj1.atacar(enemigo)
            pj2.atacar(enemigo)
            pj3.atacar(enemigo)

            // Mostrar estadisticas cada 3 rondas
            if (ronda % 3 == 0) println("\nSalud enemigo: ${enemigo.vida}")
        }

    }



}