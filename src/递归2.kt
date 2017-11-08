fun main(args:Array<String>){
    var result = 0;
    println(jieplus(4,result))
}
tailrec fun jieplus(n:Int,result:Int):Int{
    println(n)
    if (n == 0){
        return 1;
    } else {
        return jieplus(n - 1,result + n);
    }
}