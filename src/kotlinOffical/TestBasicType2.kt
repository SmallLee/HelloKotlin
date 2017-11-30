package kotlinOffical

import com.sun.javafx.css.Size
import i

fun main(args: Array<String>) {
    println(decimalValue('1'))
    arrayDemo();
    stringDemo()
}

fun decimalValue(number:Char):Int{
    if(number !in '1'..'9') {
        throw IllegalArgumentException("number is not between 1 and 9");
    }
    return number.toInt() - '0'.toInt()//转化为对应的数字
}
//字符0到9对应的ASCII码表对应的值为48~58 !

fun arrayDemo(){
    var array = arrayOf(1,2,3,4);
    for (a in array){
        print(a);
    }
    val arr = Array<String>(10,{i -> i.toString()})
    for (b in arr){
        print(b);
    }
    println(arr.get(3))//3
}
fun stringDemo(){
    var str = """
    |adfdsfd
    |adfdsfd
    |dsfsfdf
        """.trimMargin()
    println(str)

    var arr = Array<Any>(1,{i -> i});
    var brr = Array<Int>(2,{i -> i + 2});
    for (b in brr){
        println(b)
    }
    var a = "aa";
    var b = a?:return;
    println("return 之后")
    println(SIZE.BIG.value)
}

enum class SIZE(var value: Int) {
    BIG(1),
    SMALL(2),
    MIDDLE(3);
    fun value(): Int = value;
}