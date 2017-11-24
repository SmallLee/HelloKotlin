package kotlinOffical

fun main(args:Array<String>){
    var dc = DataClass("aa",22);
    println(dc.age)
    println(dc.name)
    println(dc.component1())//aa
    println(dc.component2())//22
    println(dc.toString())//kotlinOffical.DataClass@2de80c

    var dc1 = DataClass(name = "jack",age = 22);
    var oldDc = dc1.copy(name = "mike",age = 23);
    println(oldDc.name)
    println(oldDc.age)
    //数据类的解构
    val dataClass = DataClass("beijing",100);
    val(name,age) = dataClass;
    println("$name, $age of years")//beijing, 100 of years
}