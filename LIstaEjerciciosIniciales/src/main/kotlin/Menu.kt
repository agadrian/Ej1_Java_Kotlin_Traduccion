package org.example


/**
 * Clase que representa el menú principal de la aplicación.
 */
class Menu(private val ejercicios: Ejercicios) {

    /**
     * Función interna para pedir una opción dentro de un rango específico.
     * @param min El valor mínimo permitido.
     * @param max El valor máximo permitido.
     * @return La opción seleccionada por el usuario.
     */
    private fun pedirOpcion(min: Int, max: Int): Int {
        var opcion: Int

        do {
            print("Introduce opcion -> ")
            opcion = readln().toIntOrNull() ?: -1

            if (opcion == -1) {
                println("Opcion no valida. ")
            } else if (opcion !in min..max) {
                println("Opcion fuera de rango. ")
            }
        } while (opcion !in min..max)
        return opcion
    }


    /**
     * Función que muestra y gestiona el menú principal.
     */
    fun menuPrincipal() {

        var opc: Int
        do {
            imprimirMenuPrincipal()
            opc = pedirOpcion(1, 8)

            when (opc) {
                1 -> ejercicios.ej1()
                2 -> ejercicios.ej2()
                3 -> ejercicios.ej3(8)
                4 -> ejercicios.ej4()
                5 -> ejercicios.ej5()
                6 -> ejercicios.ej6_7_8_9()
                7 -> ejercicios.ej10()
                8 -> println("Saliendo del programa...")
            }
        } while (opc != 8)
    }

    /**
     * Función interna para imprimir las opciones del menú principal.
     */
    private fun imprimirMenuPrincipal() {
        println("\nMenu Ejercicios")
        println("1.- Ejercicio 1")
        println("2.- Ejercicio 2")
        println("3.- Ejercicio 3")
        println("4.- Ejercicio 4")
        println("5.- Ejercicio 5")
        println("6.- Ejercicio 6,7,8,9")
        println("7.- Ejercicio 10")
        println("8.- Salir")
    }


}


