package com.cardenas.diego.laboratoriocalificado01
import org.junit.Test
class Ejercicio01Kotlin {
    @Test
    fun main(){
        val cadena1="listen" // declaramos la cadena de "listen"
        val cadena2="silent" // declaramos la cadena de "silent"
        println("La palabra $cadena1 y $cadena2 son anagramas?: ${sonAnagramas(cadena1,cadena2)}") // imprimimos el resultado
        val cadena3="hello" // declaramos la cadena de "hello"
        val cadena4="world" // declaramos la cadena de "d"
        println("La palabra $cadena3 y $cadena4 son anagramas?: ${sonAnagramas(cadena3,cadena4)}") // imprimimos el resultado
    }
    private fun sonAnagramas(
        cadena1:String, // primera cadena de texto
        cadena2:String, // pegunda cadena de texto
    ):Boolean{
        val cadena1LowerCase=cadena1.lowercase().toList().sorted() // convertimos la primera cadena a minúsculas,
        // lo convertimos en una lista de caracteres y la ordenamos por orden alfabetico para poder tener las letras y su cantidad
        val cadena2LowerCase=cadena2.lowercase().toList().sorted() // convertimos la primera cadena a minúsculas,
        // lo convertimos en una lista de caracteres y la ordenamos por orden alfabetico para poder tener las letras y su cantidad
        // retornamos true si las listas ordenadas son iguales
        return cadena1LowerCase==cadena2LowerCase
    }
}