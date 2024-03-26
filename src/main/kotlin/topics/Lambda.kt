package topics

fun main() {
    val a = listOf(1,2,3,4,5)
    a.forEach {e -> println(e) }
    a.map { e -> e * 2 }.forEach { e -> println(e) }
    a.filter { e -> e % 2 == 0 }.forEach { e -> println(e) }
    println(a.reduce { acc, e -> acc + e })

    println(a.sortedByDescending { it })

    println(a.any { it > 10 }) // вернет true, если в списке есть хотя бы одно значение, которое больше 10
    println(a.all { it < 10 }) // вернет true, если в списке все элементы удовлетворяют условию

    println(a.sum())

    val numbers = listOf(1, 3, -4, 2, -11)
    val ( positive, negative) = numbers.partition { it > 0 } // разделяет на два списка по условию
    println(positive)
    println(negative)

    println(listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length })
}