fun main(args:Array<String>){
    checkFace(430);
    var a = 3;
    var b = 5;
    println("${a}和${b}中较大的数是${returnBig(a,b)}");
}
fun checkFace(score:Int){
    if (score > 90){
        print("帅哥")
    }else{
        print("不是帅哥")
    }
}

fun returnBig(a:Int,b:Int):Int{
    if(a>b)return a else return b;
}