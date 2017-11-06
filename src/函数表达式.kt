fun main(args:Array<String>){
    var result = add(1,2);
    println(result)
    println(i(1,2))
    println(j(2,4))
}
fun add(x:Int,y:Int):Int{
    return x + y;
}
//方式一
fun add1(x:Int,y:Int):Int = x+y;
//方式二
var i = {x:Int,y:Int -> x +y}
//方式三
var j:(Int,Int) -> Int = {x,y -> x + y}

