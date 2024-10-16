package org.example

fun main() {
    val ej = Ejercicios()

    println("Ejercicio 1: ")
    ej.ej1()
    println()

    println("Ejercicio 3: ")
    ej.ej3()
    println()


    println("Ejercicio 5: ")
    val goku = Personaje("Goku",100, 50)
    // Con el uso de override dentro de la clas Personaje, simplemente imprimimos el mensaje que devuelve el ToString()
    println(goku)
    println()

    println("Ejercicio 7: ")
    ej.ej7(5)
    val operacion: (Int, Int) -> Int = { x, y -> x + y }
    println(operacion(3,4))
    println()
    
    println("Ejercicio Final: ")
    val combate = Combate()
    combate.combatir()


}