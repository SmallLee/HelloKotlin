package kotlinOffical

var x = 1;
fun main(args: Array<String>) {
    println(::x)
    println(::x.get())
    ::x.set(2)
    println(::x.get())
    //=============================
    var prop = A::p;
    println(prop.get(A(2)))//2

    var s = String::class;
    println(s)//class kotlin.String
}

//双冒号可以获得方法的引用，也可以获得属性的引用

class A(var p: Int)
