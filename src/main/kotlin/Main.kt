/// Funcion main que es la principal, el punto de entrada
/// para el proyecto.

/// Constantes, se declaran en tiempo de compilación
const val PI = 3.1416

fun main(args: Array<String>) {
    println(PI)

    var variable = "Hola soy una variable"
    println(variable)
    variable = "Hola ya cambie mi valor"
    println(variable)

    val soloLEctura = "Hola soy una variable de solo lectura"
    println(soloLEctura)

    /// Tipos de datos y variables
    val numero: Int = 25
    println(numero)
    val numeroLargo: Long = 8342L
    println(numeroLargo)
    val doble: Double = 4.6
    println(doble)
    val flotante: Float = 4.3f
    println(flotante)
    val nombre: String = "Hola Mundo"
    println(nombre)
    val mentira: Boolean = true
    println(mentira)

    val primerValor = 30
    val segundoValor = 13

    /// Restamos los dos valores anteriores
    val tercerValor = primerValor.minus(segundoValor)
    /// Esto es lo mismo a
    val otroTercerValor = primerValor - segundoValor
    println(tercerValor)

    val firstName: String = "Francisco"
    val lastName: String = "Rangel"
    val fullName = "Hola mi nombre es $firstName $lastName"
    println(fullName)

}