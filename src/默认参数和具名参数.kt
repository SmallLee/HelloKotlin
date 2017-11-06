fun main(args:Array<String>){

    var result = 获取圆的面积(3.14f,4f);
    println(result)
    var length = 获取圆的周长(3.14f,2f);
    println(length)

    var length2 = 获取圆的周长2(半径 = 2f);
    println("周长"+length2)
    //具名参数
    var result3 = add2(x= 2,y=3);
    println(result3)
}
val Pi = 3.14f;
fun 获取圆的面积(PI:Float,r:Float):Float{
    return PI* r *r;
}
fun 获取圆的周长(PI:Float,半径:Float):Float{
    return 2 * PI * 半径;
}
//PI:Float = Pi代表PI是默认参数
fun 获取圆的周长2(PI:Float = Pi,半径:Float):Float{
    return 2 * PI * 半径;
}

fun add2(x:Int,y:Int):Int = x+y;