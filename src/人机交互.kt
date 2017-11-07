fun main(args: Array<String>) {
    println("请输入第一个数字");
    var num1 = readLine();
    println("请输入第二个数字");
    var num2 = readLine();
    try {
        var n1 = num1!!.toInt();
        var n2 = num2!!.toInt();
        println("${n1} + ${n2} = ${n2+n1}");
    } catch (e:Exception){
        //打印错误信息
        println(e.printStackTrace())
    }
}