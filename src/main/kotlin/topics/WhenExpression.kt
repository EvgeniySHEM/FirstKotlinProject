package topics

fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(15)
}

//testWhen(Object object) -> в java
fun testWhen(input: Any) { //Any -> специальный тип данных в котлин, обозначающий любой тип данных
    when(input) {
        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("от 10 до 20")
        is String -> println("Была введена строка длинной ${input.length}")
        else -> println("Что-то еще")
    }
}