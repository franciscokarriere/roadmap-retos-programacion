
object MiApp {

  def main(args: Array[String]): Unit = {
    // - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:

    // Operadores Aritméticos:

    val num = 5

    // Suma
    val suma = num + 2
    println("La suma es " + suma)

    // Resta
    val resta = num - 2
    println("La resta es " + resta)

    // Multiplicación
    val multiplicacion = num * 3
    println("La multiplicación es " + multiplicacion)

    // División
    val division = num / 2
    println("La división es " + division)

    // Módulo
    val modulo = num % 3
    println("El módulo es " + modulo)


    // Operadores de Asignación:
    var x = 10

    // Asignación
    x = 5
    println("El valor de x es " + x)

    // Asignación con suma
    x += 3
    println("Después de sumar, el valor de x es " + x)

    // Asignación con resta
    x -= 2
    println("Después de restar, el valor de x es " + x)

    // Asignación con multiplicación
    x *= 4
    println("Después de multiplicar, el valor de x es " + x)

    // Asignación con división
    x /= 2
    println("Después de dividir, el valor de x es " + x)

    // Asignación con módulo
    x %= 3
    println("Después de aplicar módulo, el valor de x es " + x)


    // Operadores Relacionales:

    val f = 5
    val g = 7

    // Igual a
    println("f es igual a g: " + (f == g))

    // Diferente de
    println("f es diferente de g: " + (f != g))

    // Menor que
    println("f es menor que g: " + (f < g))

    // Mayor que
    println("f es mayor que g: " + (f > g))

    // Menor o igual que
    println("f es menor o igual que g: " + (f <= g))

    // Mayor o igual que
    println("f es mayor o igual que g: " + (f >= g))


    // Operadores Lógicos:

    val tr = true
    val fa = false

    // AND lógico
    val andResult = tr && fa
    println("Resultado del AND lógico: " + andResult) // Resultado: false

    // OR lógico
    val orResult = tr || fa
    println("Resultado del OR lógico: " + orResult) // Resultado: true

    // NOT lógico
    val notResult = !tr
    println("Resultado del NOT lógico para tr: " + notResult) // Resultado: false



    // Operadores Bit a Bit:
    // para tener en consideracion en este ejemplo:
    /*
    | Decimal | Binario |
    |---------|---------|
    |    0    |   0000  |
    |    1    |   0001  |
    |    2    |   0010  |
    |    3    |   0011  |
    |    4    |   0100  |
    |    5    |   0101  |
    |    6    |   0110  |
    |    7    |   0111  |
    |    8    |   1000  |
    |    9    |   1001  |
    */
    val a = 5 //  0101
    val b = 3 //  0011

    // AND a nivel de bit
    val andBitResult = a & b
    println("Resultado del AND a nivel de bit: " + andBitResult)
    // Resultado binario: 0001, Resultado decimal: 1

    // OR a nivel de bit
    val orBitResult = a | b
    println("Resultado del OR a nivel de bit: " + orBitResult)
    // Resultado binario: 0111, Resultado decimal: 7

    // XOR a nivel de bit
    val xorBitResult = a ^ b
    println("Resultado del XOR a nivel de bit: " + xorBitResult)
    // Resultado binario: 0110, Resultado decimal: 6

    // Complemento a nivel de bit
    val complementBitResult = ~a
    println("Resultado del complemento a nivel de bit para a: " + complementBitResult)
    // Resultado binario: 11111111111111111111111111111010, Resultado decimal: -6

    // Desplazamiento a la izquierda
    val leftShiftResult = a << 1
    println("Resultado del desplazamiento a la izquierda: " + leftShiftResult)
    // Resultado binario: 1010, Resultado decimal: 10

    // Desplazamiento a la derecha (con signo)
    val rightShiftResult = a >> 1
    println("Resultado del desplazamiento a la derecha (con signo): " + rightShiftResult)
    // Resultado binario: 0001, Resultado decimal: 2

    // Desplazamiento a la derecha (sin signo)
    val unsignedRightShiftResult = a >>> 1
    println("Resultado del desplazamiento a la derecha (sin signo): " + unsignedRightShiftResult)
    // Resultado binario: 0001, Resultado decimal: 2





    // Operadores de Concatenación (para cadenas):

    val cadena1 = "Hola"
    val cadena2 = "Mundo"

    // Concatenación de cadenas
    val concatenacion = cadena1 + " " + cadena2
    println("Cadena concatenada: " + concatenacion)




    // OPERADOR DE INCREMENTO Y DECREMENTO **


    /*En Scala, a diferencia de algunos otros lenguajes como Java o C++,
    no existen operadores de incremento (++) o decremento (--). La razón
    es que Scala favorece un enfoque más funcional y orientado a expresiones inmutables.
    En lugar de utilizar operadores de incremento o decremento, se recomienda
    seguir prácticas más funcionales, como la creación de nuevas variables o
    el uso de funciones que produzcan nuevos valores. Aquí tienes un ejemplo
    de cómo podrías realizar operaciones similares sin usar operadores de incremento o decremento:*/
    var inc = 5

    // Incremento
    inc = inc + 1
    println("Después de incrementar, el valor de inc es " + inc)

    // Decremento
    inc = inc - 1
    println("Después de decrementar, el valor de inc es " + inc)

  }
}

/* EJERCICIO:
    * Crea un programa que imprima por consola todos los números comprendidos
    * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
    */
object NumerosEspecificos {
  def main(args: Array[String]): Unit = {
    // Iterar sobre los números del 10 al 55
    for (numero <- 10 to 55) {
      // Verificar si el número es par y no es el 16 ni múltiplo de 3
      if (numero % 2 == 0 && numero != 16 && numero % 3 != 0) {
        println(numero)
      }
    }
  }
}
 
object AppPrincipal {
  def main(args: Array[String]): Unit = {
    MiApp.main(args)  // Llama al método main de MiApp
    NumerosEspecificos.main(args)  // Llama al método main de NumerosEspecificos
  }
}