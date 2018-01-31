package Day_03_06枚举

/**
 * 感觉枚举就是把实际的顺序表用数字存放，用汉字表示
 */
enum class week{
    星期一,星期二,星期三,星期四,星期五,星期六,星期天
}

fun main(args: Array<String>) {
    println(week.星期一.name + week.星期一.ordinal)
}