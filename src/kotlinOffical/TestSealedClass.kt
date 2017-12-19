package kotlinOffical


fun main(args: Array<String>) {
    val result = execute(2,Operation.Add(4));
    println(result)
    val result1 = execute(2,Operation.Substract(4));
    println(result1)
    val result2 = execute(2,Operation.Multi(4));
    println(result2)
    val result3 = execute(2,Operation.Divide(4));
    println(result3)
}

sealed class Operation{
    class Add(var num:Int):Operation();
    class Substract(var num:Int):Operation();
    class Multi(var num:Int):Operation();
    class Divide(var num:Int):Operation();
}

fun execute(x: Int,o: Operation):Int{
    when(o){
        is Operation.Add -> return o.num + x;
        is Operation.Substract -> return o.num - x;
        is Operation.Multi -> return o.num * x;
        is Operation.Divide -> return o.num / x;
    }
}