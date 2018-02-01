package Day_04_01基础语法补充

fun main(args: Array<String>) {
    mangdata(1,2,3)

    a1()
}

/**
 * 多参数函数定义，新关键字 vararg
 */

fun mangdata(vararg a:Int){
    for (b in a){
        println("--- $b ---")
    }
}

/**
 *  ..  关键字  和  downto 关键字
 *
 *  unite  关键字   排除最后元素
 *
 */
fun a1(){
    var s = 1 until 5
    var c = 1 .. 5
    var a = 4 downTo 1
    for (b in a){
        println(b)
    }
}
