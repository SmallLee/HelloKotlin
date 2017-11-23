package kotlinOffical

fun main(args:Array<String>){
    var customer = Customer("zhangsan",22);
//    var customer2 = Customer("zhangsan",22,"beijing");
    customer.sex = 1;
    println("sex"+customer.sex)
}