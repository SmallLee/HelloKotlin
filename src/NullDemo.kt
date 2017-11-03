//参数接受非空的值
fun heat(str:String?):String{
    return "热"+str;
}
fun main(args:Array<String>){
    var result = heat("油");
    println(result);
    var result2 = heat(null);
    print(result2)
}