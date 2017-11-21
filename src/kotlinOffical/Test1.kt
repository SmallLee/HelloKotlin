package kotlinOffical

fun main(args:Array<String>){
    for (x in 1..5){
        print(x)//12345
    }
    for(x in 1..10 step 2){
        print(x)//1,3,5,7,9
    }
    //降序
    for (x in 10 downTo 1){
        println(x)//10,9,..1
    }
//    demo()
    demo2();
    letDemo();
}
fun demo(){
    var items = listOf<String>("orange","banana","apple");
    when{
        "orange" in items-> println("orange");
        "melon" in items-> println("melon");
    }
}
fun demo2(){
    var fruits = listOf<String>("orange","banana","apple");
    //使用lambda表达式操作集合
    fruits.sortedBy { it}.forEach { println(it)}
}

fun letDemo(){
    "letDemo".let {
        println(it)
        print(33)
    }
}