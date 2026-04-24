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
val readOnlyShapess = listOf("треугольник", "квадрат", "круг")
println("Первый элемент в списке: ${readOnlyShapess[0]}")
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

// множества
val readOnlyCars =setOf("BMW","Mercedes","Audi","Audi") //only for reading
// изменяемый набор множества
val cars: MutableSet<String> = mutableSetOf("BMW","Mercedes","Audi","Audi")
println(readOnlyCars) // [BMW,Mercedes,Audi]

//Если не нужно преднамеренное изменение множ-ва
val cars: MutableSet<String> = mutableSetOf("BMW","Mercedes","Audi","Audi")
val carsLocked: Set<String> = cars

//Подсчет количества элементов в мн-ве
val readOnlyCars = setOf("BMW","Mercedes","Audi","Audi")
print("Этот набор имеет ${readOnlyCars.count()} элементов") //3 элемента

//Проверка на нахождение элемента:
val readOnlyCars = setOf("BMW","Mercedes","Audi","Audi")
println("BMW" in readOnlyCars)
//true

//Добавление или удаление элемента из мн-ва
val cars: MutableSet<String> = mutableSetOf("BMW","Mercedes","Audi","Audi")
cars.add("Toyota") // добавление в набор
println(cars) // ("BMW","Mercedes","Audi","Toyota")

cars.remove("Toyota") //удаление из набора
println(cars) // ("BMW","Mercedes","Audi")


//Карта доступная только для чтения
val readOnlySalatMenu = mapOf("Цезарь" to 1,"Оливье" to 2, "Летний" to 3)
println(readOnlySalatMenu) // {Цезарь = 1, Оливье = 2...
//Карта доступная для изменения с объявлением типа:
val juiceMenu: MutableMap<String,Int> = mutableMapOf("Цезарь" to 1,"Оливье" to 2, "Летний" to 3)
println(juiceMenu) //...
//Можно предотвратить изменения карты
val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
val juiceMenuLocked: Map<String, Int> = juiceMenu

//Получения к значению карты с помощью оператора индексированного доступа
val readOnlyJuiceMenu = mapOf("яблоко" to 1, "киви" to 2, "апельсин" to 3)
println("Стоимость яблочного сока ${readOnlyJuiceMenu["apple"]}")
//Стоимость яблочного сока: 100

//Добавление элементов в карту с помощью индекс. доступа:
val juiceMenu: MutableMap<String,Int> = mutableMapOf("apple" to 1, "quiwi" to 2, "orange" to 3)
juiceMenu["coconut"] = 150 // Добавление на карту ключа "кокос" со значением 150
println(juiceMenu) //...

//Также можно удалить элементы с помощью функции .remove(), узнать количество с помощью .count()
 //А также проверить есть ли определенный ключ на карте с помощью функции .containsKey()
val readOnlyJuiceMenu = mapOf("apple" to 1,"carrot" to 2, "quiwi" to 3)
println(readOnlyJuiceMenu.containsKey("quiwi"))
//True

//Можно получить набор ключей или значений карты, используя свойста keys и values
val readOnlyJuiceMenu = mapOf("яблоко" to 1, "киви" to 2, "апельсин" to 3)
println(readOnlyJuiceMenu.keys)
//[яблоко,киви, апельсин]
println(readOnlyJuiceMenu.values)
//[100,190,100]

    //Практическое задание//
//1
    fun main(){
        val greenNumbers = listOf(1,4,23)
        val redNumbers = listOf(17,2)
        println(greenNumbers.count() + redNumbers.count())
    }
//2
fun main(){
    val SUPPORTED = setOf("HTTP", "HTTPS","FTP")
    val requested = "smpt"
    val isSupported = requested.uppercase() in SUPPORTED
    print("Support for $requested: $isSupported")
}
//3
fun main(){
    val number2word = mapOf(1 to "one",2 to "two", 3 to "three")
    val n = 2
    println("$n пишется как '${number2word[n]}' ")
}