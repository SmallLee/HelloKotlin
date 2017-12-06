package objectdemo


fun main(args: Array<String>){
    val person = Person("haha",33);
    println(person.firstProperty)
}

class Person public  constructor(name: String){
    init {
        println("person init ${name}")
    }
    var firstProperty = "First Property: $name".also(::println)
    constructor(name:String,age: Int) : this(name) {
        println("$name--$age")
    }
}
