fun main() {

    println("Введите n");
    val n = readLine()?.toIntOrNull();
    println("Введите x:")
    val x = readLine()?.toIntOrNull();
    if (n != null && x != null) {
        val y = step(n, x)
        if (y != null) {
            println("y : $y")
        } else {
            println("Целочисленный показатель не существует")
        }
    } else {
        println("Некоректный ввод")
    }
}
    fun  step(n:Int,x:Int):Int? {
        var y = 0
        var power = 1
        while (power <= n) {
            if (power == n) {
                return y
            }
            y++
            power *= x
        }
        return null
    }
