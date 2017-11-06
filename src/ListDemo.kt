fun main(args: Array<String>) {
    var lists = listOf<String>("苹果","香蕉","西瓜");
    for(n in lists){
        println(n)
    }
    for((i,e) in lists.withIndex()){
        println("$i---$e")
    }
}