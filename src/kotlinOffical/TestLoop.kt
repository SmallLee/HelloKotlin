package kotlinOffical

fun main(args: Array<String>) {
//    loopDemo()
    returnDemo()
}

fun loopDemo(){
     for(i in 1..4) {
         loop@ for(j in 1.rangeTo(5)) {
            if (j == 4) {
                break@loop
            } else {
                print(j)//打印出4此1 2 3
            }
        }
    }
}

fun returnDemo(){
    var lists = listOf<Int>(1,2,3,4);
    lists.forEach lit@{
        if (it == 2) {
            return@lit;
        } else {
            println(it)//1,3,4
        }
    }
}