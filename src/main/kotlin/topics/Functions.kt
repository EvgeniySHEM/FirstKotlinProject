package topics

fun main() {
    println(testSimple())
    println(testSimple2())
    println(testSimple3(5, 5))
    println(testString(5))
    println(testNamedArguments(y = 1, x = 2, z = 3)) // именованные аргументы
    testDefaultArguments()
    println(foo("Tom"))
    printEven(1,3,4,5,6,7)
    printEven(*intArrayOf(1,3,4,5,6,7), 8, 10) //передаем массив в vararg
}

fun testSimple(): Int { //не принимает параметров, возвращает Int
    return 5 + 5
}

fun testSimple2() = 5 + 5 //Сокращенный вид, если функция простая

fun testSimple3(x: Int, y: Int) = x + y //Сокращенный вид, если функция простая с параметрами

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//void
fun testDefaultArguments(x: Int = 1, y: Int = 2) { //функция с дефолтными аргументами
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    return (if (toUpperCase) name.uppercase() else name) + number
}

fun printEven(vararg numbers: Int) { // vararg
    numbers.forEach { e -> if (e % 2 == 0) println(e)  }
}
