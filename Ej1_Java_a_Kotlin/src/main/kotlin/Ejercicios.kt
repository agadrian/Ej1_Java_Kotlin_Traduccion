package org.example

class Ejercicios {

    /**
     * Ejercicio 1: Declarar variables en Java y Kotlin
     * En este ejercicio, compararemos cómo se declaran variables en ambos lenguajes y las
     * diferencias en cuanto a la inferencia de tipos.
     *
     * Explica las diferencias entre el uso de var y val en Kotlin frente a las variables en Java
     */
    fun ej1(){
        val vida = 100
        val personaje = "Naruto"
        println("El personaje $personaje tiene $vida puntos de vida")
    }


    /**
     * Vamos a practicar con bucles, que en ambos lenguajes se usan mucho, sobre todo en
     * situaciones como recorrer inventarios o colecciones de objetos.
     * Compara el uso del bucle for en ambos lenguajes, haciendo hincapié en cómo Kotlin
     * simplifica la sintaxis.
     *
     */
    fun ej3(){
        val cofres = listOf("Espada", "Escudo", "Poción")
        cofres.forEach { println("Has encontrado: $it") } // En kotlin con un simple foreach, recorremos la lista
    }


    /**
     *Vamos a explorar cómo Kotlin permite simplificar la sintaxis de las funciones y cómo se usan
     * las expresiones lambda.
     * Compara la simplicidad de las funciones y lambdas en Kotlin con Java, destacando cómo
     * Kotlin es más conciso.
     */
    fun ej7(num: Int): Int {return num*2}
}