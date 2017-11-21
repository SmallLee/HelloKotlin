package kotlinOffical

fun main(args: Array<String>){
    printSum(2, 3)
    var lists = listOf<String>("apple","bnana","orange")
    //获取每一个元素
    for(item in lists){
        println(item)
    }
    println(lists.first())//apple
    for (index in lists.indices){
        println("${index}--${lists[index]}")//0.1.2
    }
    printWeek(1)
    println(isInRange(3))
}

/*fun add(a: Int, b: Int): Int {
    *//*asd*//*
    return a + b;
}*/

fun add2(a: Int, b: Int) = a + b;

fun printSum(a: Int, b: Int): Unit {
    println("sum of ${a} and ${b} is ${a + b}")
}

fun printWeek(week:Int){
    when(week){
        0-> println("星期一");
        1-> println("星期二");
        2-> println("星期三");
        3-> println("星期四");
        else-> println("其他日子")
    }
}
//range
fun isInRange(a:Int):Boolean{
    val range = a.rangeTo(10);
    println(range)
    return a in 1..10
}


