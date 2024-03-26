package topics

fun main() {
    val child = Person("Bobby", "Jones", 5)
    val p1 = Person("Tom", "Jones", 35, child)
    println(p1.children)

    val p2 = Person()

    var rectangle = Rectangle(2.6,4.2)
    var rectangle2 = Rectangle(2.6,4.2)

    println(rectangle.hashCode())
    println(rectangle.toString())
    println(rectangle.equals(rectangle2))
    println("Perimeter is ${rectangle.perimeter}")
    println("Area is ${rectangle.area()}")
}

//Primary Constructor - первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() //пустой ArrayList

    init { //init block выполняется после конструктора
        println("Person is created $firstName")
        println(children) // будет пустой
    }

    // вторичные конструкторы должны всегда вызывать первичный
    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
                children.add(child)
    }

    // конструктор по умолчанию с указанием аргументов по умолчанию
    constructor(): this("", "", 10)
}

data class Rectangle(var height: Double, var length: Double) { //data создаст equals,hashCode, toString
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 //как this.поле в java
        set(value) {
            if (value < 0) println("Negative value!")
            field = value
        }

    fun area() = height * length
}