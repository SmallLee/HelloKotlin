import java.math.BigDecimal
import java.math.BigInteger

fun main(args:Array<String>){
    val result = fact(BigInteger("100"));
    println(result)
}
fun fact(n:BigInteger):BigInteger{
    if (n == BigInteger.ONE) {
        return BigInteger.ONE;
    } else {
        return n*fact(n- BigInteger.ONE);
    }
}