fun main(args:Array<String>){
    var a = "11";
    var b = 11;
    a = b.toString();
    b = a.toInt();

    var c = "a3";//java.lang.NumberFormatException: For input string: "a3"
    println(c.toInt())
}