@file:JvmName("FooBar") //Slide 29
package com.example.patikalastassignment

import java.io.BufferedReader
import java.io.File
import java.io.FileNotFoundException
import java.math.BigDecimal

//Slide 10
fun printSum(a: Int, b: Int): Unit {
    println("$a and $b's sum: ${a + b}")
}


// Slide 11
var y = 0
fun increaseY() {
    y += 1
    println("Slide 11 $y")
}

//Slide 15
fun findGreater(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//Slide 18 - Slide 81 both of them are the almostly same
fun define(obj: Any): String =
    when (obj) {
        2 -> "Two"
        "Goodbye" -> "Farewell"
        is Double -> "Double"
        is String -> "String"
        else -> "Not recognized"
    }

//Slide 30
fun longMethodName(
    arg1: String,
    arg2: String
): String {

    return ""
}


fun f(x: String, y: String, z: String) =
    println("Slide 32 = " + veryLongFunctionCallWithManyWords()+" $x $y $z")

fun veryLongFunctionCallWithManyWords() = "Hello World"

// Slide 38
fun greet(
    name: String = "Hello",
    greating: String = "Kotlin <3"
) {
    println("Slide 38 = $greating, $name!")
}

//Slide 46
fun String.toUppercaseExtension(): String {
    return this.uppercase()
}

//Slide 50
fun getSomeSize() = 7

//Slide 55
fun convertColorToIndex(colorName: String): Int {
    return when (colorName) {
        "Yellow" -> 0
        "Blue" -> 1
        "Red" -> 2
        "Green" -> 3  // New color added
        "Orange" -> 4 // New color added
        else -> throw IllegalArgumentException("Invalid color name provided")
    }
}


//Slide 56
fun tryCatch() {
    val result = try {
        println("Slide 56 = TryCatch")
    } catch (e: ArithmeticException) {
        println(e.localizedMessage)
        throw IllegalArgumentException(e)
    }
}

//Slide 59
fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

//Slide 60

fun giveAnswer() = 6 * 9

fun giveAnswer1(): Int {
    return 6 * 9
}

//Slide 64
fun <T> genericFunction(input: T) {
    println("Slide 64 Processing input: $input")
}

//Slide 66
private val income = BigDecimal("50000.00")
private val taxRate = BigDecimal("0.20")

fun calcTaxes(): BigDecimal {
    return income.multiply(taxRate).setScale(2, BigDecimal.ROUND_HALF_UP)
}

//Slide 67
fun writeMessageWithPrefix(message: String, prefix: String = "Info") {
    println("Slide 67 [$prefix] $message")
}

//Slide 68
infix fun Int.shl(x: Int): Int {
    return this shl x
}

infix fun Int.times(str: String) = str.repeat(this)

//Slide 70
fun printAll(vararg messages: String) {
    println("Slide 70")
    for (m in messages) println(m)
}

//Slide 72
fun calculateStringLength(notNullString: String): Int {
    return notNullString.length
}

//Slide 73

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.isNotEmpty()) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

//Slide 76
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)


//Slide 89
fun findMax(a: Int, b: Int) = if (a > b) a else b

fun main() {
    //Slide 9
    println("Slide 9")
    print("Goodbye ")
    print("Universe!")
    println("Goodbye Universe!")
    println(2024)


    //Slide 10
    printSum(4, 6)

    //Slide 11
    val d: Int = 2
    val e = 3
    val f: Int
    f = 4
    var y = 6
    println("Slide 11")
    println(d)
    println(f)
    println(y)
    println(e)
    y += 1
    println(y)
    val PI_VALUE = 3.14159
    println(PI_VALUE)
    increaseY()


    //Slide 12
    val rectangle = Rectangle(6.0, 3.0)
    println("Slide 12 Perimeter: ${rectangle.perimeter}")

    //Slide 13

    val square = Square(7.0)
    println("Slide 13 = The perimeter is ${square.perimeter} and color is ${square.colorName}")

    //Slide 14
    var dSlide14 = 2
    val s1 = "d: $d"
    dSlide14 = 3
    val s2 = "${s1.replace(":", " previous value")}, but now: $dSlide14"
    println("Slide 14 $dSlide14 $s1 $s2")

    //Slide 15
    println(findGreater(5, 9))

    //Slide 16
    val products = listOf("apple", "banana", "kiwi")
    println("Slide 16")
    for (product in products) {
        println(product)
    }
    for (index in products.indices) {
        println("$index. product: ${products[index]}")
    }

    //Slide 17
    var index = 0
    println("Slide 17")
    while (index < products.size) {
        println("$index. product: ${products[index]}")
        index++
    }

    //Slide 18
    println("Slide 18")
    println(define("Hello"))

    //Slide 19
    val z = 20
    val xSlide20 = 21
    println("Slide 19")
    if (xSlide20 in 1..z + 1) {
        println("Within range")
    } else {
        println("Out of range")
    }
    val list = listOf("d", "e", "f", "g")
    if (-2 !in 0..list.lastIndex) {
        println("-2 out of range")
    }
    if (list.size !in list.indices) {
        println("List size out of valid index range")
    } else {
        println("List size within valid index range")
    }
    for (y in 1..10) {
        print(y)
    }
    println()
    for (x in 15 downTo 0 step 5) {
        print(x)
    }


    // Slide 20
    println("Slide 20")
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    var zSlide20: String? = "abc"
    if (zSlide20 == null) {
        println("zSlide20 is null")
    }

    //Slide 21
    println("Slide 21")
    var str21: String? = "Cagri Yilmaz"
    if (str21 == null) {
        println("Slide 21 = x is null")
    } else {
        println("Slide 21 = x is not null")
    }

    //Slide 22
    val str = "Çağrı"
    if (str is String) {
        println("Slide 22 = ${str.length}")
    }
    if (str is String && str.length > 0) {
        println("Slide 22 = ${str.length}")
    }
    if (str !is String) return null!!

    //Slide 23

    /*
        PatikaAssignment.kt
     */

    //Slide 24
    /*
       * open class Shape
       * fun SumNumber(){}
       * */

    //Slide 26

    //Sabitler
    val MAX = 5
    val NAME_FIELD = "UserName"
    println("Slide 26 = MAX is ${MAX} UNAME_FIELD is ${NAME_FIELD}")
    //Koleksiyon Tanımı
    val mutableCollection: MutableSet<String> = HashSet()

    //Slide 27
    /*
    public / protected / private / internal
    expect / actual
    final / open / abstract / sealed / const
    external
    override
    lateinit
    tailrec
    vararg
    suspend
    inner
    enum / annotation / fun // as a modifier in `fun interface`
    companion
    inline / value
    infix
    operator
    data
    */


    //Slide 28
    /*
    @Named("Foo")
     val foo: Foo

    @Target(AnnotationTarget.PROPERTY)
    annotation class Shape

    @JsonExclude @JvmField
    var k: String

    @Test fun foo() {}
    */

    //Slide 30
    println("Slide 30 ${longMethodName("Çağrı", "Yılmaz")}")

    //Slide 31
    println("Slide 31 = ${f("Muhammet", "Çağrı", "Yılmaz")}")

    //Slide 32
    println("Slide 32 ${f("Gebze", "Teknik", "Üniversite")}")

    //Slide 33
    /*
    val isEmpty: Boolean get() = size == 0
    val zoo: String
        get(){ return "sas"}
    */

    //Slide 34-35

    var userAge = 27
    println("Slide 34-35")
    if (userAge >= 18 && userAge <= 30) {
        println("User is within the targeted age range for our survey.")
    }
    val userInput = ""
    if (userInput.isNotBlank()) {
        println("Thank you for providing your feedback: $userInput")
    } else {
        println("Feedback cannot be empty. Please provide your thoughts.")
    }

    var file: BufferedReader? = null
    try {
        file = File("userInput.txt").bufferedReader()
        val fileInput = file.readLine()
        println("User input from file: $fileInput")
    } catch (e: FileNotFoundException) {
        println("File not found. Please check the filename and try again.")
    } finally {
        file?.close()
        println("Closing file resources.")
    }

    //Slide 37

    var user = User(4, "Çağrı", "m.cagri0205@gmail.com")
    println("Slide 37 = ${user.username}")
    println("$user")

    //Slide 38
    greet("Çağrı", "Yılmaz")
    //Slide 39
    val numbers = listOf(-2, -8, 4, 3, 9, -10)
    val positiveNumbers = numbers.filter { it > 0 }
    positiveNumbers.forEach { println("Slide 39 = $it") }

    val negativeNumbers = numbers.filter { it < 0 }
    negativeNumbers.forEach { println("Slide 39 = $it") }

    // Slide 40
    val emailList = listOf("smith@example.com", "bbb@xyz.com", "contact@abc.com")

    if ("smith@example.com" in emailList) {
        println("Slide 40: smith@example.com is included")
    }

    if ("ttt@ggg.com" !in emailList) {
        println("Slide 40: ttt@ggg.com is not included")
    }
    //Slide 41
    when (square) {
        is Square -> println("Slide 41 = Square")
        is Color -> println("Slide 41 = Color")
    }

    //Slides 42-43-44
    println("42-43-44")
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((key, value) in map) {
        println("$key -> $value")

    }

    // Slide 45
    val myLazyText: String by lazy {
        println("Slide 45: Lazy Property Initialized")
        "Hello Lazy"
    }
    var someVariable = myLazyText
    println(someVariable)

    // Slide 46
    println("Slide 46: ${"Pathway".toUppercaseExtension()}")

    // Slide 47
    SingletonExample.performAction()

    // Slide 48
    val duck = Duck()
    duck.vocalize()

    //Slide 49
    val fileOperation = File("Text").listFiles()
    println(fileOperation?.size)

    //Slide 50
    val fileSize = fileOperation?.size ?: run {
        val someSize = getSomeSize()
        someSize * 2
    }
    println(fileSize)

    //Slide 51
    val letter = map["g"] ?: println("Slide 51 = There is no g in Map")
    //Slide 52
    val userNames = listOf<String>()
    val primaryUserName = userNames.firstOrNull() ?: println("Slide 52 = No users found!")

    //Slide 53
    val value = "Getir & Patika"
    value?.let {
        println("Slide 53 = The value is not null")
    }

    // Slide 54
    val name: String? = "Kotlin"
    val mapped = name?.let {
        println("Slide 54 = not null and name is $it")
        it.length
    } ?: 0
    println("Slide 54 = $mapped")

    //Slide 55
    println(convertColorToIndex("Yellow"))

    //Slide 56
    tryCatch()

    //Slide 58
    val num = 3
    val numText = if (num == 1) {
        "one"
    } else if (num == 2) {
        "two"
    } else {
        "three or more"
    }
    println("Slide 58 = $numText")

    //Slide 59
    arrayOfMinusOnes(4).forEach { println("Slide 59 $it") }

    //Slide 60
    println(giveAnswer())

    println(giveAnswer1())

    //Slide 61
    val actionMan = ActionFigure()
    with(actionMan) {
        moveDown()
        for (i in 1..2) {
            advance(100.0)
            rotate(90.0)
        }
        moveUp()
    }

    // Slide 62
    val myHue = PaintHue().apply {
        hueName = "Blue"
    }
    println("Slide 62 = ${myHue.hueName}")
    //Slide 63

    /*val stream = Files.newInputStream(Paths.get("/some/grades.txt"))
        stream.buffered().reader().use{ it ->
            println(it.readText())
        }*/

    //Slide 64
    val number = 7
    val text = "Generic"

    genericFunction(number)
    genericFunction(text)

    //Slide 65
    var numberInt = 5
    numberInt = numberInt.also {
        println("Slide 65 = Variable value is : $it")
        it.minus(2)
    }


    //Slide 66
    val taxesDue = calcTaxes()
    println("Taxes due: $taxesDue")

    //Slide 67
    writeMessageWithPrefix("Hello")
    writeMessageWithPrefix(prefix = "Log", message = "Hello")

    //Slide 68
    println("Slide 68 = " + (3 shl 6))
    println("Slide 68 = " + (4 times "Bye "))


    //Slide 70
    printAll("Muhammed", "Çağrı", "Yılmaz", "Beyzanur")

    //Slide 71
    var status: String = "starting"
    println("Slide 71 = $status")
    val indexVal: Int = 1
    val totalPoints = 43


    //Slide 72
    var slideContent: String = "This can't be null"
    var nullableSlideContent: String? = "You can keep a null here"
    calculateStringLength(nullableSlideContent!!)
    nullableSlideContent = null
    var inferredNonNullContent = "The compiler assumes non-null"
    calculateStringLength(slideContent)

    //Slide 73
    println("Slide 73 = " + describeString("Beyzanur"))
    println("Slide 73 = " + describeString("Yılmaz"))


    //Slides 74-75

    val stack = MutableStack("Muhammet", "Çağrı", "Yılmaz")
    println("Slide-75 = $stack")
    stack.push("Emir")
    println("Slide-75 = Peek: ${stack.peek()}")
    println("Slide-75 = Pop: ${stack.pop()}")
    println("Slide-75 = $stack")
    println("Slide-75 = Is empty: ${stack.isEmpty()}")
    println("Slide-75 = Size: ${stack.size()}")


    //Slide 76
    val bookRatings = mutableStackOf(4.5, 3.8, 5.0, 4.2)
    println("Slide 76 = $bookRatings")

    //Slide 77
    val dog: Dog = Yorkshire()
    dog.sayHello()

    //Slide 78
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()

    //Slide 79
    val cat = Cat("Fluffy", 4, "Van Cat")
    cat.showInfo()
    cat.meow()

    //Slide 80
    evaluateEvents("Goodbye")
    evaluateEvents(2)
    evaluateEvents(0L)
    evaluateEvents(MyClass())
    evaluateEvents("goodbye")

    // Slide 82
    val pies = listOf("apple", "blueberry", "pecan")
    for (pie in pies) {
        println("Delicious, a slice of $pie pie!")
    }

    //Slide 83
    var booksRead = 0
    while (booksRead < 5) {
        println("Slide 20 = Read $booksRead books")
        booksRead++
    }
    // Slide 84
    booksRead = 0
    do {
        println("Slide 21 = Read $booksRead books")
        booksRead++
    } while (booksRead < 6)


    // Slide 85
    for (j in 5..8) {
        print(j)
    }
    print(" ")
    for (j in 5 until 8) {
        print(j)
    }
    print(" ")
    for (j in 10..20 step 4) {
        print(j)
    }
    print(" ")
    for (j in 6 downTo 3) {
        print(j)
    }
    print(" ")
    //Slide 86
    for (ch in 'a'..'e') {
        print(ch)
    }
    print(" ")
    for (ch in 'z' downTo 'v' step 2) {
        print(ch)
    }
    print(" ")


    //Slide 87
    val nunmber = 9
    if (nunmber in 0..10) {
        println("Slide 87 = number is in range from 0 to 10")
    }
    if (nunmber !in 1..6) {
        println("Slide 87 = number is not in range from 1 to 6")
    }


    //Slide 88
    val firstNumber: Int = 7
    val secondNumber: Int = 7
    val thirdNumber: Int = 15
    println("Slide 88 = " + (firstNumber == secondNumber))
    println("Slide 88 = " + (firstNumber == thirdNumber))
    val fourthNumber: Int = 20
    val fifthNumber: Int = 20
    val sixthNumber: Int? = fourthNumber
    println("Slide 88 = " + (fourthNumber === fifthNumber))
    println("Slide 88 = " + (fourthNumber === sixthNumber))

    //Slide 89
    println(findMax(99, -42))


    //Slide 91
    val novel1 = Book("Adventures in Scala", "Alex Johnson", 2024)
    val novel2 = Book("Adventures in Scala", "Alex Johnson", 2024)


    // equals() method
    println("Slide 77 equals(): ${novel1.equals(novel2)}")

    // hashCode() method
    println("Slide 77 hashCode() - Book1: ${novel1.hashCode()}")
    println("Slide 77 hashCode() - Book2: ${novel2.hashCode()}")

    // toString() method
    println("Slide 77 toString() - Book1: $novel1")
    println("Slide 77 toString() - Book2: $novel2")

    //copy() method
    val copyBook = novel1.copy(publishYear = 2024)
    println("Slide 77 copy() - Copy Book: $copyBook")

    //Slide 92

    val student1 = Ogrenci("Çağrı", 23, 4)
    student1.copyConstructor()
    println(student1)
}

// Slide 12
class Rectangle(val height: Double, val width: Double) {
    val perimeter = (height + width) * 2
}

//Slide 13
open class Color {
    var colorName: String = "Green"
}

class Square(val edge: Double) : Color() {
    val perimeter = edge * 4
}

/*
if you want to work this code, you must implement test to classpath and import test annotation
//Slide 25
class NewTestSuite {
    @Test
    fun `check_functionality`() {}
    @Test fun checkFunctionality_onMobile() {}
}

@Test
fun addition_isAccurate() {
    assertEquals(16, 7 + 9)
}

@Test
fun stringConcatenation_isAccurate() {
    val string1 = "Bonjour, "
    val string2 = "Monde!"
    assertEquals("Bonjour, Monde!", string1 + string2)
}

 */

//Slide 37
data class User(
    val id: Long,
    val username: String,
    val email: String
)

//Slide 47
object SingletonExample {
    init {
        println("Slide 47 = Singleton class is initialized.")
    }

    fun performAction() {
        println("Slide 47 = An operation is being performed from the Singleton class.")
    }
}

//Slide 48
abstract class Creature {
    abstract fun vocalize()
}

class Duck : Creature() {
    override fun vocalize() {
        println("Slide 48 = Quack Quack!")
    }
}


//Slide 61
class ActionFigure {
    fun moveUp() {
        println("Slide 61 = Move Up")
    }

    fun moveDown() {
        println("Slide 61 = Move Down")
    }

    fun rotate(degrees: Double) {
        println("Slide 61 = Rotate $degrees degree")
    }

    fun advance(pixels: Double) {
        println("Slide 61 = Advance $pixels pixel")
    }

}

// Slide 62
class PaintHue {
    var hueName: String = ""
}

//Slides 74-75

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()
    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size

    override fun toString() = "Slides 74-75 MutableStack(${elements.joinToString()})"
}

//Slide 77
open class Dog {
    open fun sayHello() {
        println("Slide 77 woof woof!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

//Slide 78
open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin: roar!")
    }
}

class Asiatic(name: String) : Lion(name, "India")

//Slide 79
open class Animal(val name: String, val age: Int) {
    open fun showInfo() {
        println("$name is an animal and is $age years old.")
    }
}

class Cat(name: String, age: Int, val breed: String) : Animal(name, age) {
    override fun showInfo() {
        super.showInfo()
        println("$name is a cat, $age years old, and of breed $breed.")
    }

    fun meow() {
        println("$name says meow!")
    }
}

//Slide 80
class MyClass

fun evaluateEvents(obj: Any) {
    when (obj) {
        2 -> println("Two")
        "Goodbye" -> println("Farewell")
        is Double -> println("Double")
        is String -> println("String")
        else -> println("Something else")
    }
}


//Slide 91
data class Book(val name: String, val author: String, val publishYear: Int)

//Slide 92

data class Ogrenci(val ad: String, val numara: Int, val sinif: Int) {
    operator fun component5(): String {
        return ad
    }

    operator fun component6(): Int {
        return numara
    }

    operator fun component7(): Int {
        return sinif
    }

    fun copyConstructor(ad: String = this.ad, numara: Int = this.numara, sinif: Int = this.sinif) =
        Ogrenci(ad, numara, sinif)

}