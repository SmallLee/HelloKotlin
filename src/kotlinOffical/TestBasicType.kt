package kotlinOffical

fun main(args: Array<String>) {
    var a: Long= 12L;//L代表long类型
    var d: Double = 123.5;
    var d1: Double = 123.5e10;//
    println(d1)//1.235E12
    //下划线表示法
    var age = 1_0_0;
    println(age)//100
    var hexByte = 0xFF_EE_DD;
    println(hexByte)//16772829
    numberDemo();
}

fun numberDemo(){
    val a: Int= 128;
    val aBox: Int? = a;
    val aAnotherBox: Int? =a;
    println(aBox==aAnotherBox);//true
    println(aBox===aAnotherBox);//false
    //自动类型转化
    var l  =1L + 3 ;
}
