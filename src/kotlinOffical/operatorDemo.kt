package kotlinOffical

fun main(args:Array<String>){
    var a :Int= 2;
    //左移
    println(1 shl 2)
    //右移
    var b = (4 shr 1);
    print(b);//2
    var c = (-8 ushr 1);//忽略符号位
    print(c);//2147483644
    var d = (-8 shr 1);//
    print(d);//-4
    val e = (1 and 2);//0
    print(e);
    val f = (1 xor 2);
    println(f)//3
    val g = 2.inv();
    println(g)//-3
}
