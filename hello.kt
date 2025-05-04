// Fibbonacci Series
// This is search branch comment
// This is collect branch comment

fun fib(n: Int): Int {
    if(n<=1) return n
    return fib(n-2) + fib(n-1)
}

fun main(){
    print("Fib result = ${fib(4)}")
}
