package topics

fun main() {
    //for each
    val items = listOf("apple", "banana", "orange") //неизменяемый список строк
    val items2 = mutableListOf("apple", "banana", "orange") //изменяемый список строк

    for (item in items) {
        println(item)
    }

    //while
    var index = 0
    while (index < items2.size) {
        println("Item at $index is ${items2[index]}")
        index++
    }

    //Диапазоны(как в Python)
    3..10
    println(5 in 3..10)//true (5 в диапазоне от 3 до 10)

    for (i in 3..10) { // проходим по диапазону от 3 до 10
        println(i)
    }

    for (i in 3..<10) { // проходим по диапазону от 3 до 9 (можно использовать 3 until 10)
        println(i)
    }

    for (i in 10 downTo 1) { // проходим по диапазону от 10 до 1
        println(i)
    }

    for (i in 0..<items2.size) { // проходим по диапазону от 0 до размера списка -1
        println(items2[i])
    }

    for (i in 3..<10 step 2) { // проходим по диапазону от 3 до 9 (можно использовать 3 until 10) с шагом 2
        println(i)
    }
}
