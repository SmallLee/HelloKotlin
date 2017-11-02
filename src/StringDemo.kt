fun main(atgs:Array<String>){
    var result = generator("Tom")
    result= generator("Jack")
    println(result);
}

fun generator(name:String):String{
    return "My name is ${name} ,Hello $name,名字的长度是${name.length}";
}