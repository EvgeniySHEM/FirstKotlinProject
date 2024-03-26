package topics

fun main() {
    var a: String = "Hello"
    // в переменных исключена возможность NullPointerException, туда нельзя положить null

    var b: String? = "Hello" //? - позволяет положить null, но такую переменную нельзя вызвать напрямую
    // нужно вызывать safe call
     b?.length // если там не null, вернет длину строки, а если null, то вернет значение "null"

    //Elvis оператор
    b?.length ?: -1 // если b == null, вернет -1

    println(b?.length ?: -1)

    // !!
    val t = b!!.length //выбросит NPE, если b == null


}