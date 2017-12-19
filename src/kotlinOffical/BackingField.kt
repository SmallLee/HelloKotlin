package kotlinOffical

fun main(args: Array<String>) {
    var bc = Back();
    bc.count = -2;
    println(bc.count)
}

class Back{
    var count = 0
    set(value) {//只能给字段设置大于等于0的值，其他值都显示为0
        if (value >= 0) { field = value}
    }
}
