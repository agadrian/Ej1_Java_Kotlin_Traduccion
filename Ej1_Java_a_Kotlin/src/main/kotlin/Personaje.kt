package org.example

class Personaje(
    val name: String,
    var vida: Int,
    val ataque: Int
){

    // No es necesario crear el constructor dentro de la clase, ya que se hace al meterle los parametros en la clase

    // Hacemos override de la funcion toString para retornar la informacion de la clase para implimirla posteriormente
    override fun toString(): String {
        return "Nombre: $name, Vida: $vida, Ataque: $ataque"
    }
}
