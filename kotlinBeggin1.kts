fun main() {
    println("Hello, world!")
    // Hello, world!
}

val client = 10
println("We have $client customers")
// We have 11 customers

fun main(){
    val name = "Mary"
    val age = 20
    println("$name is $age years old")
}
//Mary is 20 years old

//очередь магазина
var clients = 10
clients -= 2
clients *= 4
println(clients) // стало ... клиентов

//Переменная без инициализации
val d: Int
d =  3
val e: String = "hello"
println(d) //3
println(e)// hello

//Exs2
fun main(){
    val a: Int = 1000
    val b: String = "Message"
    val c: Double = 3.14
    val d: Long = 100_100_100_100
    val e: Boolean = false
    val f: Char = '\n'
}

val readOnlyShapes = listOf("Треуголньик","квадрат","круг")
println(readOnlyShapes)
val shapes: MutableList<String> = mutableListOf("Треуг","Квадр", "Круг")
println(shapes)

val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
val shapesLocked: List<String> = shapes
val readOnlyShapes = listOf("треугольник", "квадрат", "круг")
println("Первый элемент в списке: ${readOnlyShapes[0]}")
// Первый элемент в списке: треугольник

listOf = readOnlyShapes val("треугольник", "квадрат", "круг")
println("Первый элемент в списке: ${readOnlyShapes.first()}")
// Первый элемент в списке: треугольник

listOf = readOnlyShapes val("треугольник", "квадрат", "круг")
println("В этом списке ${readOnlyShapes.count()} элементов")
// В этом списке 3 элемента


fun main() {
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    // [apple, banana, cherry]
}